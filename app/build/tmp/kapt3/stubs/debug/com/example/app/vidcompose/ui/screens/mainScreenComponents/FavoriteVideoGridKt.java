package com.example.app.vidcompose.ui.screens.mainScreenComponents;

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
import com.example.app.vidcompose.room.entity.VideoItemDB;
import com.skydoves.landscapist.ImageOptions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u001a8\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a8\u0010\r\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"FavoriteFlowRowItem", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "FavoriteVideoGridItem", "videoViewModel", "Lcom/example/app/vidcompose/ui/screens/mainScreenComponents/VideoViewModel;", "videoItem", "Lcom/example/app/vidcompose/room/entity/VideoItemDB;", "onItemClick", "Lkotlin/Function1;", "FavoriteVideoItemGridLayout", "onVideoItemClick", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "app_debug"})
public final class FavoriteVideoGridKt {
    
    @androidx.compose.runtime.Composable
    public static final void FavoriteVideoItemGridLayout(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.app.vidcompose.room.entity.VideoItemDB, kotlin.Unit> onVideoItemClick, @org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.PaddingValues contentPadding, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.ui.screens.mainScreenComponents.VideoViewModel videoViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.foundation.layout.ExperimentalLayoutApi.class})
    private static final void FavoriteVideoGridItem(androidx.compose.ui.Modifier modifier, com.example.app.vidcompose.ui.screens.mainScreenComponents.VideoViewModel videoViewModel, com.example.app.vidcompose.room.entity.VideoItemDB videoItem, kotlin.jvm.functions.Function1<? super com.example.app.vidcompose.room.entity.VideoItemDB, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void FavoriteFlowRowItem(java.lang.String text, androidx.compose.ui.Modifier modifier) {
    }
}