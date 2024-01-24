package com.example.app.vidcompose.room.repository;

import com.example.app.vidcompose.room.dao.FavoriteDao;
import com.example.app.vidcompose.room.entity.VideoItemDB;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/app/vidcompose/room/repository/FavoriteRepository;", "", "dao", "Lcom/example/app/vidcompose/room/dao/FavoriteDao;", "(Lcom/example/app/vidcompose/room/dao/FavoriteDao;)V", "deleteVideoFromFav", "", "video", "Lcom/example/app/vidcompose/room/entity/VideoItemDB;", "(Lcom/example/app/vidcompose/room/entity/VideoItemDB;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteVideos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToFavorite", "app_debug"})
public final class FavoriteRepository {
    private final com.example.app.vidcompose.room.dao.FavoriteDao dao = null;
    
    @javax.inject.Inject
    public FavoriteRepository(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.dao.FavoriteDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveToFavorite(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.entity.VideoItemDB video, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteVideoFromFav(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.entity.VideoItemDB video, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFavoriteVideos(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.app.vidcompose.room.entity.VideoItemDB>> continuation) {
        return null;
    }
}