package com.example.app.vidcompose.data;

import android.app.Application;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.provider.OpenableColumns;
import android.util.Log;
import com.example.app.vidcompose.model.VideoItem;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import java.io.File;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010\rJA\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/app/vidcompose/data/LocalMediaProvider;", "", "applicationContext", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getMediaVideo", "", "Lcom/example/app/vidcompose/model/VideoItem;", "selection", "", "selectionArgs", "", "sortOrder", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getMediaVideosFlow", "Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getVideoItemFromContentUri", "uri", "Landroid/net/Uri;", "Companion", "app_debug"})
public final class LocalMediaProvider {
    private final android.app.Application applicationContext = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.app.vidcompose.data.LocalMediaProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "Local Media Provider";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] VIDEO_PROJECTION = {"_id", "_data", "duration", "height", "width", "_size", "date_modified"};
    
    public LocalMediaProvider(@org.jetbrains.annotations.NotNull
    android.app.Application applicationContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.app.vidcompose.model.VideoItem getVideoItemFromContentUri(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.app.vidcompose.model.VideoItem>> getMediaVideosFlow(@org.jetbrains.annotations.Nullable
    java.lang.String selection, @org.jetbrains.annotations.Nullable
    java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable
    java.lang.String sortOrder) {
        return null;
    }
    
    private final java.util.List<com.example.app.vidcompose.model.VideoItem> getMediaVideo(java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/example/app/vidcompose/data/LocalMediaProvider$Companion;", "", "()V", "TAG", "", "VIDEO_COLLECTION_URI", "Landroid/net/Uri;", "getVIDEO_COLLECTION_URI", "()Landroid/net/Uri;", "VIDEO_PROJECTION", "", "getVIDEO_PROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.net.Uri getVIDEO_COLLECTION_URI() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getVIDEO_PROJECTION() {
            return null;
        }
    }
}