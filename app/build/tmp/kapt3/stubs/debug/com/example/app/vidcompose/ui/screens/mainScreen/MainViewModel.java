package com.example.app.vidcompose.ui.screens.mainScreen;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import com.example.app.vidcompose.data.LocalMediaProvider;
import com.example.app.vidcompose.model.FolderItem;
import com.example.app.vidcompose.room.entity.VideoItemDB;
import com.example.app.vidcompose.room.repository.FavoriteRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.SharingStarted;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\rR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d\u00a8\u0006%"}, d2 = {"Lcom/example/app/vidcompose/ui/screens/mainScreen/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "localMediaProvider", "Lcom/example/app/vidcompose/data/LocalMediaProvider;", "favoriteRepository", "Lcom/example/app/vidcompose/room/repository/FavoriteRepository;", "(Lcom/example/app/vidcompose/data/LocalMediaProvider;Lcom/example/app/vidcompose/room/repository/FavoriteRepository;)V", "_favVideos", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/app/vidcompose/room/entity/VideoItemDB;", "_folderItemStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/app/vidcompose/model/FolderItem;", "_videoItemsStateFlow", "Lcom/example/app/vidcompose/model/VideoItem;", "<set-?>", "currentSelectedFolder", "getCurrentSelectedFolder", "()Lcom/example/app/vidcompose/model/FolderItem;", "setCurrentSelectedFolder", "(Lcom/example/app/vidcompose/model/FolderItem;)V", "currentSelectedFolder$delegate", "Landroidx/compose/runtime/MutableState;", "favVideos", "getFavVideos", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "folderItemStateFlow", "getFolderItemStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "videoItemsStateFlow", "getVideoItemsStateFlow", "getFavoriteVideos", "Lkotlinx/coroutines/Job;", "updateCurrentSelectedFolderItem", "", "folderItem", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.app.vidcompose.room.repository.FavoriteRepository favoriteRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> _favVideos = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> favVideos = null;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.app.vidcompose.model.VideoItem>> _videoItemsStateFlow = null;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.app.vidcompose.model.FolderItem>> _folderItemStateFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.app.vidcompose.model.VideoItem>> videoItemsStateFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.app.vidcompose.model.FolderItem>> folderItemStateFlow = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState currentSelectedFolder$delegate = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.data.LocalMediaProvider localMediaProvider, @org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.repository.FavoriteRepository favoriteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> getFavVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getFavoriteVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.app.vidcompose.model.VideoItem>> getVideoItemsStateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.app.vidcompose.model.FolderItem>> getFolderItemStateFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.app.vidcompose.model.FolderItem getCurrentSelectedFolder() {
        return null;
    }
    
    public final void setCurrentSelectedFolder(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.model.FolderItem p0) {
    }
    
    public final void updateCurrentSelectedFolderItem(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.model.FolderItem folderItem) {
    }
}