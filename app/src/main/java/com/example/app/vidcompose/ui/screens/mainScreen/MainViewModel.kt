package com.example.app.vidcompose.ui.screens.mainScreen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.vidcompose.data.LocalMediaProvider
import com.example.app.vidcompose.model.FolderItem
import com.example.app.vidcompose.room.entity.VideoItemDB
import com.example.app.vidcompose.room.repository.FavoriteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
	localMediaProvider: LocalMediaProvider,
	private val favoriteRepository: FavoriteRepository
): ViewModel() {

	private val _favVideos = MutableStateFlow<List<VideoItemDB>?>(null)
	val favVideos = _favVideos

	private val _videoItemsStateFlow = localMediaProvider.getMediaVideosFlow().stateIn(
		viewModelScope,
		SharingStarted.WhileSubscribed(5000),
		emptyList()
	)

	fun getFavoriteVideos () = viewModelScope.launch {
		try {
		    favoriteRepository.getFavoriteVideos().let {
				_favVideos.value = it
			}
		} catch (e : Exception){
			Log.d("ErrorExc", e.message.toString())
		}
	}

	private val _folderItemStateFlow = _videoItemsStateFlow.map{ videoItemsList ->

		videoItemsList.map { videoItem ->
			val splitPath = videoItem.absolutePath.split("/")
			val folderName = splitPath[splitPath.size - 2]
			FolderItem(
				name = folderName,
				videoItemsList.filter {
					val splitPathStrings = it.absolutePath.split("/")
					val name = splitPathStrings[splitPathStrings.size - 2]
					folderName == name
				}
			)
		}.distinct()

	}.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

	val videoItemsStateFlow = _videoItemsStateFlow

	val folderItemStateFlow = _folderItemStateFlow

	var currentSelectedFolder by mutableStateOf(
		FolderItem("null", emptyList())
	)

	fun updateCurrentSelectedFolderItem(folderItem: FolderItem){
		currentSelectedFolder = folderItem
	}

}