package com.example.app.vidcompose.player

import android.content.pm.ActivityInfo
import android.media.audiofx.LoudnessEnhancer
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.session.MediaSession
import androidx.media3.ui.AspectRatioFrameLayout
import com.example.app.vidcompose.data.LocalMediaProvider
import com.example.app.vidcompose.model.VideoItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@UnstableApi
@HiltViewModel
class PlayerViewModel @Inject constructor(
    val player: ExoPlayer,
    private val mediaSession: MediaSession,
    private val loudnessEnhancer: LoudnessEnhancer,
    private val listener: Player.Listener,
    private val localMediaProvider: LocalMediaProvider,
) : ViewModel() {

    private val _playerState = MutableStateFlow(PlayerState())
    val playerState = _playerState.asStateFlow()

    init {
        player.prepare()
    }

    override fun onCleared() {
        player.removeListener(listener)
        player.release()
        mediaSession.release()
        loudnessEnhancer.release()
        super.onCleared()
    }

    private fun updateCurrentVideoItem(videoItem: VideoItem) {
        _playerState.update {
            it.copy(
                currentVideoItem = videoItem
            )
        }
        setMediaItem(_playerState.value.currentVideoItem!!.uri)
    }

    private fun setMediaItem(uri: Uri) {
        player.apply {
            addMediaItem(MediaItem.fromUri(uri))
            playWhenReady = true
            if (isPlaying) {
                _playerState.update {
                    it.copy(isPlaying = true)
                }
            }
        }
    }

    fun onPlayPauseClick() {
        if (player.isPlaying) {
            player.pause().also {
                _playerState.update {
                    it.copy(isPlaying = false)
                }
            }
        } else {
            player.play().also {
                _playerState.update {
                    it.copy(isPlaying = true)
                }
            }
        }
    }

    fun playPauseOnActivityLifeCycleEvents(shouldPause: Boolean) {
        if (player.isPlaying && shouldPause) {
            player.pause().also {
                _playerState.update { it.copy(isPlaying = false) }
            }
        } else if (!player.isPlaying && !shouldPause) {
            player.play().also {
                _playerState.update { it.copy(isPlaying = true) }
            }
        }
    }

    fun onRotateScreen() {
        val orientation =
            if (_playerState.value.orientation == ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE) {
                ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT
            } else {
                ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE
            }
        _playerState.update {
            it.copy(orientation = orientation)
        }
    }

    fun onResizeClick() {
        _playerState.update {
            it.copy(
                resizeMode = if (_playerState.value.resizeMode == AspectRatioFrameLayout.RESIZE_MODE_FIT) {
                    AspectRatioFrameLayout.RESIZE_MODE_FILL
                } else {
                    AspectRatioFrameLayout.RESIZE_MODE_FIT
                }
            )
        }
    }

    fun onIntent(uri: Uri) {
        localMediaProvider.getVideoItemFromContentUri(uri)?.let {
            updateCurrentVideoItem(it)
        }
    }

    fun onNewIntent(uri: Uri) {
        player.clearMediaItems()
        localMediaProvider.getVideoItemFromContentUri(uri)?.let {
            updateCurrentVideoItem(it)
        }
    }

}

@UnstableApi
data class PlayerState(
    val isPlaying: Boolean = false,
    val currentVideoItem: VideoItem? = null,
    val resizeMode: Int = AspectRatioFrameLayout.RESIZE_MODE_FIT,
    val orientation: Int = ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE
)