package com.example.app.vidcompose.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.app.vidcompose.room.entity.VideoItemDB

@Dao
interface FavoriteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveToFavorite(video : VideoItemDB)

    @Delete
    suspend fun deleteVideoFromFav(video: VideoItemDB)

    @Query("SELECT * FROM favorites_table")
    suspend fun getFavoriteVideos () :List<VideoItemDB>

}