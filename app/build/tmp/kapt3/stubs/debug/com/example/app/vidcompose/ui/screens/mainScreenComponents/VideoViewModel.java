package com.example.app.vidcompose.ui.screens.mainScreenComponents;

import androidx.lifecycle.ViewModel;
import com.example.app.vidcompose.room.entity.VideoItemDB;
import com.example.app.vidcompose.room.repository.FavoriteRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/app/vidcompose/ui/screens/mainScreenComponents/VideoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/app/vidcompose/room/repository/FavoriteRepository;", "(Lcom/example/app/vidcompose/room/repository/FavoriteRepository;)V", "_deletedVideo", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/app/vidcompose/room/entity/VideoItemDB;", "_favoriteVideos", "", "deletedVideo", "getDeletedVideo", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "favoriteVideos", "getFavoriteVideos", "deleteVideoFromFavorite", "Lkotlinx/coroutines/Job;", "video", "saveVideoToFav", "app_debug"})
public final class VideoViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.app.vidcompose.room.repository.FavoriteRepository repository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.room.entity.VideoItemDB> _deletedVideo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.room.entity.VideoItemDB> deletedVideo = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> _favoriteVideos = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> favoriteVideos = null;
    
    @javax.inject.Inject
    public VideoViewModel(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.repository.FavoriteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.vidcompose.room.entity.VideoItemDB> getDeletedVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> getFavoriteVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getFavoriteVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveVideoToFav(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.entity.VideoItemDB video) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteVideoFromFavorite(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.entity.VideoItemDB video) {
        return null;
    }
}