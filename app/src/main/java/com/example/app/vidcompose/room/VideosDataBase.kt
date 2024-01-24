package com.example.app.vidcompose.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.app.vidcompose.room.dao.AuthDao
import com.example.app.vidcompose.room.dao.FavoriteDao
import com.example.app.vidcompose.room.entity.User
import com.example.app.vidcompose.room.entity.VideoItemDB

@TypeConverters(Converters::class)
@Database(entities = [VideoItemDB::class, User::class], version = 1, exportSchema = false)
abstract class VideosDataBase : RoomDatabase() {
    abstract fun getFavoriteDao(): FavoriteDao
    abstract fun getAuthDao() : AuthDao

    companion object {
        const val dbName = "database"

    }

}