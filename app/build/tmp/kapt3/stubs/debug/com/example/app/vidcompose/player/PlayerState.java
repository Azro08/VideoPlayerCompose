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

@androidx.media3.common.util.UnstableApi
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/example/app/vidcompose/player/PlayerState;", "", "isPlaying", "", "currentVideoItem", "Lcom/example/app/vidcompose/model/VideoItem;", "resizeMode", "", "orientation", "(ZLcom/example/app/vidcompose/model/VideoItem;II)V", "getCurrentVideoItem", "()Lcom/example/app/vidcompose/model/VideoItem;", "()Z", "getOrientation", "()I", "getResizeMode", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
public final class PlayerState {
    private final boolean isPlaying = false;
    @org.jetbrains.annotations.Nullable
    private final com.example.app.vidcompose.model.VideoItem currentVideoItem = null;
    private final int resizeMode = 0;
    private final int orientation = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.app.vidcompose.player.PlayerState copy(boolean isPlaying, @org.jetbrains.annotations.Nullable
    com.example.app.vidcompose.model.VideoItem currentVideoItem, int resizeMode, int orientation) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public PlayerState() {
        super();
    }
    
    public PlayerState(boolean isPlaying, @org.jetbrains.annotations.Nullable
    com.example.app.vidcompose.model.VideoItem currentVideoItem, int resizeMode, int orientation) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.app.vidcompose.model.VideoItem component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.app.vidcompose.model.VideoItem getCurrentVideoItem() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getResizeMode() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getOrientation() {
        return 0;
    }
}