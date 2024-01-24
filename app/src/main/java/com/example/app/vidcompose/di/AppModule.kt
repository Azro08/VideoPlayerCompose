package com.example.app.vidcompose.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.app.vidcompose.room.VideosDataBase
import com.example.app.vidcompose.room.dao.FavoriteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApplicationContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideDataBaseInstance(app: Application): VideosDataBase =
        Room.databaseBuilder(
            app,
            VideosDataBase::class.java,
            VideosDataBase.dbName
        ).build()


    @Singleton
    @Provides
    fun provideFavoritesDao(db: VideosDataBase): FavoriteDao =
        db.getFavoriteDao()

    @Singleton
    @Provides
    fun provideAuthDao(db: VideosDataBase) =
        db.getAuthDao()


}