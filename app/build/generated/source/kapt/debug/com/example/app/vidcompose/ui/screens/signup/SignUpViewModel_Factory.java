package com.example.app.vidcompose.ui.screens.signup;

import com.example.app.vidcompose.room.repository.AuthRepository;
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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<AuthRepository> authRepositoryProvider;

  public SignUpViewModel_Factory(Provider<AuthRepository> authRepositoryProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(authRepositoryProvider.get());
  }

  public static SignUpViewModel_Factory create(Provider<AuthRepository> authRepositoryProvider) {
    return new SignUpViewModel_Factory(authRepositoryProvider);
  }

  public static SignUpViewModel newInstance(AuthRepository authRepository) {
    return new SignUpViewModel(authRepository);
  }
}
