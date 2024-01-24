package com.example.app.vidcompose.ui.screens.mainScreenComponents;

import android.util.Log;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ExperimentalLayoutApi;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import com.example.app.vidcompose.R;
import com.example.app.vidcompose.model.VideoItem;
import com.skydoves.landscapist.ImageOptions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u001a8\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a<\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0013"}, d2 = {"FlowRowItem", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "VideoGridItem", "videoViewModel", "Lcom/example/app/vidcompose/ui/screens/mainScreenComponents/VideoViewModel;", "videoItem", "Lcom/example/app/vidcompose/model/VideoItem;", "onItemClick", "Lkotlin/Function1;", "VideoItemGridLayout", "videoList", "", "onVideoItemClick", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "app_debug"})
public final class VideosViewGridKt {
    
    @androidx.compose.runtime.Composable
    public static final void VideoItemGridLayout(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.app.vidcompose.model.VideoItem> videoList, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.app.vidcompose.model.VideoItem, kotlin.Unit> onVideoItemClick, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.foundation.layout.ExperimentalLayoutApi.class})
    private static final void VideoGridItem(androidx.compose.ui.Modifier modifier, com.example.app.vidcompose.ui.screens.mainScreenComponents.VideoViewModel videoViewModel, com.example.app.vidcompose.model.VideoItem videoItem, kotlin.jvm.functions.Function1<? super com.example.app.vidcompose.model.VideoItem, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void FlowRowItem(java.lang.String text, androidx.compose.ui.Modifier modifier) {
    }
}