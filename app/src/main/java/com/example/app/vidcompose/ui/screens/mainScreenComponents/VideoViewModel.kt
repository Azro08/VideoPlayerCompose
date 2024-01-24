package com.example.app.vidcompose.ui.screens.mainScreenComponents

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.vidcompose.room.entity.VideoItemDB
import com.example.app.vidcompose.room.repository.FavoriteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VideoViewModel @Inject constructor(
    private val repository: FavoriteRepository
) : ViewModel() {

    private val _deletedVideo = MutableStateFlow<VideoItemDB?>(null)
    val deletedVideo: MutableStateFlow<VideoItemDB?> = _deletedVideo

    private val _favoriteVideos = MutableStateFlow<List<VideoItemDB>?>(null)
    val favoriteVideos = _favoriteVideos

    fun getFavoriteVideos() = viewModelScope.launch {
        val favVideos = repository.getFavoriteVideos()
        _favoriteVideos.value = favVideos
    }

    fun saveVideoToFav(video: VideoItemDB) = viewModelScope.launch {
        repository.saveToFavorite(video)
    }

    fun deleteVideoFromFavorite(video: VideoItemDB) = viewModelScope.launch {
        repository.deleteVideoFromFav(video)
        _deletedVideo.value = video
        getFavoriteVideos()
    }

}