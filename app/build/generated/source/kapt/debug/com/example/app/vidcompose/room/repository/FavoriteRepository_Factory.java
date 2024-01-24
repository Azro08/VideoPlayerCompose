package com.example.app.vidcompose.room.repository;

import com.example.app.vidcompose.room.dao.FavoriteDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class FavoriteRepository_Factory implements Factory<FavoriteRepository> {
  private final Provider<FavoriteDao> daoProvider;

  public FavoriteRepository_Factory(Provider<FavoriteDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public FavoriteRepository get() {
    return newInstance(daoProvider.get());
  }

  public static FavoriteRepository_Factory create(Provider<FavoriteDao> daoProvider) {
    return new FavoriteRepository_Factory(daoProvider);
  }

  public static FavoriteRepository newInstance(FavoriteDao dao) {
    return new FavoriteRepository(dao);
  }
}
