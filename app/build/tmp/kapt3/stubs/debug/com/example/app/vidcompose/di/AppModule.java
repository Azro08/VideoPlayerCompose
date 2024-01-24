package com.example.app.vidcompose.di;

import android.app.Application;
import android.content.Context;
import androidx.room.Room;
import com.example.app.vidcompose.room.VideosDataBase;
import com.example.app.vidcompose.room.dao.FavoriteDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/app/vidcompose/di/AppModule;", "", "()V", "provideApplicationContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideAuthDao", "Lcom/example/app/vidcompose/room/dao/AuthDao;", "db", "Lcom/example/app/vidcompose/room/VideosDataBase;", "provideDataBaseInstance", "app", "provideFavoritesDao", "Lcom/example/app/vidcompose/room/dao/FavoriteDao;", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.app.vidcompose.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.Context provideApplicationContext(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.app.vidcompose.room.VideosDataBase provideDataBaseInstance(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.app.vidcompose.room.dao.FavoriteDao provideFavoritesDao(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.VideosDataBase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.example.app.vidcompose.room.dao.AuthDao provideAuthDao(@org.jetbrains.annotations.NotNull
    com.example.app.vidcompose.room.VideosDataBase db) {
        return null;
    }
}