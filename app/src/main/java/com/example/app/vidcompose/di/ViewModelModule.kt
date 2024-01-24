package com.example.app.vidcompose.di

import android.app.Application
import android.content.Context
import android.media.audiofx.LoudnessEnhancer
import androidx.media3.common.AudioAttributes
import androidx.media3.common.C
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.session.MediaSession
import com.example.app.vidcompose.VidComposeApplication
import com.example.app.vidcompose.data.AppContainer
import com.example.app.vidcompose.data.LocalMediaProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@UnstableApi
@InstallIn(ActivityRetainedComponent::class)
object ViewModelModule {

    @Provides
    fun provideVidComposeApplication(): VidComposeApplication =
        VidComposeApplication()

    @Provides
    fun provideAppContainer(context: Application) = AppContainer(context)

    @Provides
    fun provideLocalMediaPlayer(app: AppContainer): LocalMediaProvider =
        app.localMediaProvider

    @Provides
    fun provideExoPlayer(application: Context) = ExoPlayer
        .Builder(application)
        .setAudioAttributes(
            AudioAttributes.Builder()
                .setUsage(C.USAGE_MEDIA)
                .setContentType(C.AUDIO_CONTENT_TYPE_MOVIE)
                .build(),
            true
        )
        .build()

    @Provides
    fun provideMediaSession(application: Context, player: ExoPlayer) =
        MediaSession.Builder(application, player).build()

    @Provides
    fun provideLoudnessEnhancer(player: ExoPlayer) = LoudnessEnhancer(player.audioSessionId)

    @Provides
    fun providePlayerListener(player: ExoPlayer, loudnessEnhancer: LoudnessEnhancer) =
        object : Player.Listener {
            var enhancer = loudnessEnhancer
            override fun onDeviceVolumeChanged(volume: Int, muted: Boolean) {
                super.onDeviceVolumeChanged(volume, muted)
                player.volume = volume.toFloat()
            }

            override fun onAudioSessionIdChanged(audioSessionId: Int) {
                super.onAudioSessionIdChanged(audioSessionId)
                enhancer.release()

                try {
                    enhancer = LoudnessEnhancer(audioSessionId)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
}