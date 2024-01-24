package com.example.app.vidcompose.player;

import android.content.pm.ActivityInfo;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSession;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.example.app.vidcompose.data.LocalMediaProvider;
import com.example.app.vidcompose.model.VideoItem;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@androidx.media3.common.util.UnstableApi
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006&"}, d2 = {"Lcom/example/app/vidcompose/player/PlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "mediaSession", "Landroidx/media3/session/MediaSession;", "loudnessEnhancer", "Landroid/media/audiofx/LoudnessEnhancer;", "listener", "Landroidx/media3/common/Player$Listener;", "localMediaProvider", "Lcom/example/app/vidcompose/data/LocalMediaProvider;", "(Landroidx/media3/exoplayer/ExoPlayer;Landroidx/media3/session/MediaSession;Landroid/media/audiofx/LoudnessEnhancer;Landroidx/media3/common/Player$Listener;Lcom/example/app/vidcompose/data/LocalMediaProvider;)V", "_playerState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/app/vidcompose/player/PlayerState;", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "playerState", "Lkotlinx/coroutines/flow/StateFlow;", "getPlayerState", "()Lkotlinx/coroutines/flow/StateFlow;", "onCleared", "", "onIntent", "uri", "Landroid/net/Uri;", "onNewIntent", "onPlayPauseClick", "onResizeClick", "onRotateScreen", "playPauseOnActivityLifeCycleEvents", "shouldPause", "", "setMediaItem", "updateCurrentVideoItem", "videoItem", "Lcom/example/app/vidcompose/model/VideoItem;", "app_debug"})
public final class PlayerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.media3.exoplayer.ExoPlayer player = null;
    private final androidx.media3.session.MediaSession mediaSession = null;
    private final android.media.audiofx.LoudnessEnhancer loudnessEnhancer = null;
    private final androidx.media3.common.Player.Listener listener = null;
    private final com.example.app.vidcompose.data.LocalMediaProvider localMediaProvider = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.player.PlayerState> _playerState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.app.vidcompose.player.PlayerState> playerState = null;
    
    @javax.inject.Inject
    public PlayerViewModel(@org.jetbrains.annotations.NotNull
    androidx.media3.exoplayer.ExoPlayer player, @org.jetbrains.annotations.NotNull
    androidx.media3.session.MediaSession mediaSession, @org.jetbrains.annotations.NotNull
    android.media.audiofx.LoudnessEnhancer loudnessEnhancer, @org.jetbrains.annotations.NotNull
    androidx.media3.common.Player.Listener listener, @org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.data.LocalMediaProvider localMediaProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.media3.exoplayer.ExoPlayer getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.app.vidcompose.player.PlayerState> getPlayerState() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void updateCurrentVideoItem(com.example.app.vidcompose.model.VideoItem videoItem) {
    }
    
    private final void setMediaItem(android.net.Uri uri) {
    }
    
    public final void onPlayPauseClick() {
    }
    
    public final void playPauseOnActivityLifeCycleEvents(boolean shouldPause) {
    }
    
    public final void onRotateScreen() {
    }
    
    public final void onResizeClick() {
    }
    
    public final void onIntent(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    public final void onNewIntent(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
}