package com.example.app.vidcompose.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.app.vidcompose.room.dao.AuthDao;
import com.example.app.vidcompose.room.dao.FavoriteDao;
import com.example.app.vidcompose.room.entity.User;
import com.example.app.vidcompose.room.entity.VideoItemDB;

@androidx.room.Database(entities = {com.example.app.vidcompose.room.entity.VideoItemDB.class, com.example.app.vidcompose.room.entity.User.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.example.app.vidcompose.room.Converters.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/app/vidcompose/room/VideosDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getAuthDao", "Lcom/example/app/vidcompose/room/dao/AuthDao;", "getFavoriteDao", "Lcom/example/app/vidcompose/room/dao/FavoriteDao;", "Companion", "app_debug"})
public abstract class VideosDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.example.app.vidcompose.room.VideosDataBase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String dbName = "database";
    
    public VideosDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.app.vidcompose.room.dao.FavoriteDao getFavoriteDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.app.vidcompose.room.dao.AuthDao getAuthDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/app/vidcompose/room/VideosDataBase$Companion;", "", "()V", "dbName", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}