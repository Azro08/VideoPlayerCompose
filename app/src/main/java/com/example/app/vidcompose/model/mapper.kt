package com.example.app.vidcompose.model

import com.example.app.vidcompose.room.entity.VideoItemDB

fun VideoItem.toVideoItemDB () = VideoItemDB(
    name = name,
    absolutePath = absolutePath,
    id = id,
    uri = uri,
    size = size,
    width = width,
    height = height,
    duration = duration,
    dateModified = dateModified
)