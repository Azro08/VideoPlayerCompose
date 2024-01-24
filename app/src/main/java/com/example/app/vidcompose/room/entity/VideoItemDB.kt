package com.example.app.vidcompose.room.entity

import android.net.Uri
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.app.vidcompose.room.Converters

@Entity(tableName = "favorites_table")
data class VideoItemDB(
    @ColumnInfo val name: String,
    @ColumnInfo val absolutePath: String,
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo val id: Long,
    @ColumnInfo
    @TypeConverters(Converters::class)
    val uri: Uri,
    @ColumnInfo val size: Long,
    @ColumnInfo val width: Int,
    @ColumnInfo val height: Int,
    @ColumnInfo val duration: Long,
    @ColumnInfo val dateModified: Long
) {
    fun Long.toHhMmSs(): String {
        val seconds = (this / 1000).toInt()
        val hours = seconds / 3600
        val minutes = (seconds % 3600) / 60
        val remainingSeconds = seconds % 60
        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds)
    }
}