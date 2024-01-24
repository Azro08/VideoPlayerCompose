package com.example.app.vidcompose.room.dao;

import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.app.vidcompose.room.Converters;
import com.example.app.vidcompose.room.entity.VideoItemDB;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FavoriteDao_Impl implements FavoriteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VideoItemDB> __insertionAdapterOfVideoItemDB;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<VideoItemDB> __deletionAdapterOfVideoItemDB;

  public FavoriteDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVideoItemDB = new EntityInsertionAdapter<VideoItemDB>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `favorites_table` (`name`,`absolutePath`,`id`,`uri`,`size`,`width`,`height`,`duration`,`dateModified`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final VideoItemDB entity) {
        if (entity.getName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getName());
        }
        if (entity.getAbsolutePath() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getAbsolutePath());
        }
        statement.bindLong(3, entity.getId());
        final String _tmp = __converters.fromUri(entity.getUri());
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, _tmp);
        }
        statement.bindLong(5, entity.getSize());
        statement.bindLong(6, entity.getWidth());
        statement.bindLong(7, entity.getHeight());
        statement.bindLong(8, entity.getDuration());
        statement.bindLong(9, entity.getDateModified());
      }
    };
    this.__deletionAdapterOfVideoItemDB = new EntityDeletionOrUpdateAdapter<VideoItemDB>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `favorites_table` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final VideoItemDB entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object saveToFavorite(final VideoItemDB video,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVideoItemDB.insert(video);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteVideoFromFav(final VideoItemDB video,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfVideoItemDB.handle(video);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getFavoriteVideos(final Continuation<? super List<VideoItemDB>> continuation) {
    final String _sql = "SELECT * FROM favorites_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<VideoItemDB>>() {
      @Override
      @NonNull
      public List<VideoItemDB> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAbsolutePath = CursorUtil.getColumnIndexOrThrow(_cursor, "absolutePath");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUri = CursorUtil.getColumnIndexOrThrow(_cursor, "uri");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "size");
          final int _cursorIndexOfWidth = CursorUtil.getColumnIndexOrThrow(_cursor, "width");
          final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
          final int _cursorIndexOfDuration = CursorUtil.getColumnIndexOrThrow(_cursor, "duration");
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final List<VideoItemDB> _result = new ArrayList<VideoItemDB>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final VideoItemDB _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAbsolutePath;
            if (_cursor.isNull(_cursorIndexOfAbsolutePath)) {
              _tmpAbsolutePath = null;
            } else {
              _tmpAbsolutePath = _cursor.getString(_cursorIndexOfAbsolutePath);
            }
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final Uri _tmpUri;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfUri)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfUri);
            }
            _tmpUri = __converters.toUri(_tmp);
            final long _tmpSize;
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
            final int _tmpWidth;
            _tmpWidth = _cursor.getInt(_cursorIndexOfWidth);
            final int _tmpHeight;
            _tmpHeight = _cursor.getInt(_cursorIndexOfHeight);
            final long _tmpDuration;
            _tmpDuration = _cursor.getLong(_cursorIndexOfDuration);
            final long _tmpDateModified;
            _tmpDateModified = _cursor.getLong(_cursorIndexOfDateModified);
            _item = new VideoItemDB(_tmpName,_tmpAbsolutePath,_tmpId,_tmpUri,_tmpSize,_tmpWidth,_tmpHeight,_tmpDuration,_tmpDateModified);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
