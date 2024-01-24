package com.example.app.vidcompose.di;

import android.app.Application;
import android.content.Context;
import android.media.audiofx.LoudnessEnhancer;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSession;
import com.example.app.vidcompose.VidComposeApplication;
import com.example.app.vidcompose.data.AppContainer;
import com.example.app.vidcompose.data.LocalMediaProvider;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@androidx.media3.common.util.UnstableApi
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/example/app/vidcompose/di/ViewModelModule;", "", "()V", "provideAppContainer", "Lcom/example/app/vidcompose/data/AppContainer;", "context", "Landroid/app/Application;", "provideExoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "application", "Landroid/content/Context;", "provideLocalMediaPlayer", "Lcom/example/app/vidcompose/data/LocalMediaProvider;", "app", "provideLoudnessEnhancer", "Landroid/media/audiofx/LoudnessEnhancer;", "player", "provideMediaSession", "Landroidx/media3/session/MediaSession;", "providePlayerListener", "Landroidx/media3/common/Player$Listener;", "loudnessEnhancer", "provideVidComposeApplication", "Lcom/example/app/vidcompose/VidComposeApplication;", "app_debug"})
@dagger.Module
public final class ViewModelModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.app.vidcompose.di.ViewModelModule INSTANCE = null;
    
    private ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.example.app.vidcompose.VidComposeApplication provideVidComposeApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.example.app.vidcompose.data.AppContainer provideAppContainer(@org.jetbrains.annotations.NotNull
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final com.example.app.vidcompose.data.LocalMediaProvider provideLocalMediaPlayer(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.data.AppContainer app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final androidx.media3.exoplayer.ExoPlayer provideExoPlayer(@org.jetbrains.annotations.NotNull
    android.content.Context application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final androidx.media3.session.MediaSession provideMediaSession(@org.jetbrains.annotations.NotNull
    android.content.Context application, @org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.ExoPlayer player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final android.media.audiofx.LoudnessEnhancer provideLoudnessEnhancer(@org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.ExoPlayer player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final androidx.media3.common.Player.Listener providePlayerListener(@org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.ExoPlayer player, @org.jetbrains.annotations.NotNull
    android.media.audiofx.LoudnessEnhancer loudnessEnhancer) {
        return null;
    }
}