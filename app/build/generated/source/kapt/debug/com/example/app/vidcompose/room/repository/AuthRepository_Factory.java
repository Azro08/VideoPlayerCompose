package com.example.app.vidcompose.room.repository;

import com.example.app.vidcompose.room.dao.AuthDao;
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
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  private final Provider<AuthDao> daoProvider;

  public AuthRepository_Factory(Provider<AuthDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public AuthRepository get() {
    return newInstance(daoProvider.get());
  }

  public static AuthRepository_Factory create(Provider<AuthDao> daoProvider) {
    return new AuthRepository_Factory(daoProvider);
  }

  public static AuthRepository newInstance(AuthDao dao) {
    return new AuthRepository(dao);
  }
}
