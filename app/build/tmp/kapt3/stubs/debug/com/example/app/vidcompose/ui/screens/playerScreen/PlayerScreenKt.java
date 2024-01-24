package com.example.app.vidcompose.ui.screens.playerScreen;

import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.TimeBar;
import com.example.app.vidcompose.R;
import com.example.app.vidcompose.player.PlayerViewModel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u001aR\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001aR\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u001aP\u0010\u001a\u001a\u00020\u00012\b\b\u0001\u0010\u001b\u001a\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u001a,\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a(\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a8\u0006\'"}, d2 = {"BottomControls", "", "player", "Landroidx/media3/common/Player;", "totalTime", "", "onRotateScreenClick", "Lkotlin/Function0;", "resizeMode", "", "onResizeModeChange", "modifier", "Landroidx/compose/ui/Modifier;", "CustomSeekBar", "isSeekInProgress", "Lkotlin/Function1;", "", "onSeekBarMove", "currentTime", "totalDuration", "MiddleControls", "isPlaying", "onClick", "onPlayPauseClick", "onSeekForwardClick", "onSeekBackwardClick", "MiddleControlsItem", "icon", "contentDescription", "onIconClick", "onSingleClick", "onDoubleClick", "PlayerScreen", "viewModel", "Lcom/example/app/vidcompose/player/PlayerViewModel;", "onBackClick", "UpperControls", "videoTitle", "", "app_debug"})
public final class PlayerScreenKt {
    
    @androidx.compose.runtime.Composable
    @androidx.media3.common.util.UnstableApi
    public static final void PlayerScreen(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.player.PlayerViewModel viewModel, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRotateScreenClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    private static final void UpperControls(java.lang.String videoTitle, kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void MiddleControls(boolean isPlaying, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function0<kotlin.Unit> onPlayPauseClick, kotlin.jvm.functions.Function0<kotlin.Unit> onSeekForwardClick, kotlin.jvm.functions.Function0<kotlin.Unit> onSeekBackwardClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.media3.common.util.UnstableApi
    private static final void BottomControls(androidx.media3.common.Player player, long totalTime, kotlin.jvm.functions.Function0<kotlin.Unit> onRotateScreenClick, int resizeMode, kotlin.jvm.functions.Function0<kotlin.Unit> onResizeModeChange, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    private static final void MiddleControlsItem(@androidx.annotation.DrawableRes
    int icon, @androidx.annotation.StringRes
    int contentDescription, kotlin.jvm.functions.Function0<kotlin.Unit> onIconClick, kotlin.jvm.functions.Function0<kotlin.Unit> onSingleClick, kotlin.jvm.functions.Function0<kotlin.Unit> onDoubleClick, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.media3.common.util.UnstableApi
    public static final void CustomSeekBar(@org.jetbrains.annotations.NotNull
    androidx.media3.common.Player player, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> isSeekInProgress, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onSeekBarMove, long currentTime, long totalDuration, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
}