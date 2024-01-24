package com.example.app.vidcompose.room.repository

import com.example.app.vidcompose.room.dao.FavoriteDao
import com.example.app.vidcompose.room.entity.VideoItemDB
import javax.inject.Inject

class FavoriteRepository @Inject constructor(
    private val dao: FavoriteDao
) {

    suspend fun saveToFavorite(video: VideoItemDB) = dao.saveToFavorite(video)

    suspend fun deleteVideoFromFav(video: VideoItemDB) = dao.deleteVideoFromFav(video)


    suspend fun getFavoriteVideos(): List<VideoItemDB> = dao.getFavoriteVideos()

}