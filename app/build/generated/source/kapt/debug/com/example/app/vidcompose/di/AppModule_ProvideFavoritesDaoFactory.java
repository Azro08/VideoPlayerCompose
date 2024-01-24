package com.example.app.vidcompose.di;

import com.example.app.vidcompose.room.VideosDataBase;
import com.example.app.vidcompose.room.dao.FavoriteDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideFavoritesDaoFactory implements Factory<FavoriteDao> {
  private final Provider<VideosDataBase> dbProvider;

  public AppModule_ProvideFavoritesDaoFactory(Provider<VideosDataBase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FavoriteDao get() {
    return provideFavoritesDao(dbProvider.get());
  }

  public static AppModule_ProvideFavoritesDaoFactory create(Provider<VideosDataBase> dbProvider) {
    return new AppModule_ProvideFavoritesDaoFactory(dbProvider);
  }

  public static FavoriteDao provideFavoritesDao(VideosDataBase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFavoritesDao(db));
  }
}
