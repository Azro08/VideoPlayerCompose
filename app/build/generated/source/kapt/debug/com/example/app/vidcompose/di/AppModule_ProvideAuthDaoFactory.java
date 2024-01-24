package com.example.app.vidcompose.di;

import com.example.app.vidcompose.room.VideosDataBase;
import com.example.app.vidcompose.room.dao.AuthDao;
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
public final class AppModule_ProvideAuthDaoFactory implements Factory<AuthDao> {
  private final Provider<VideosDataBase> dbProvider;

  public AppModule_ProvideAuthDaoFactory(Provider<VideosDataBase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public AuthDao get() {
    return provideAuthDao(dbProvider.get());
  }

  public static AppModule_ProvideAuthDaoFactory create(Provider<VideosDataBase> dbProvider) {
    return new AppModule_ProvideAuthDaoFactory(dbProvider);
  }

  public static AuthDao provideAuthDao(VideosDataBase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAuthDao(db));
  }
}
