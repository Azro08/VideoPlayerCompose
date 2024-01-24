package com.example.app.vidcompose.ui.screens.mainScreen;

import com.example.app.vidcompose.data.LocalMediaProvider;
import com.example.app.vidcompose.room.repository.FavoriteRepository;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<LocalMediaProvider> localMediaProvider;

  private final Provider<FavoriteRepository> favoriteRepositoryProvider;

  public MainViewModel_Factory(Provider<LocalMediaProvider> localMediaProvider,
      Provider<FavoriteRepository> favoriteRepositoryProvider) {
    this.localMediaProvider = localMediaProvider;
    this.favoriteRepositoryProvider = favoriteRepositoryProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(localMediaProvider.get(), favoriteRepositoryProvider.get());
  }

  public static MainViewModel_Factory create(Provider<LocalMediaProvider> localMediaProvider,
      Provider<FavoriteRepository> favoriteRepositoryProvider) {
    return new MainViewModel_Factory(localMediaProvider, favoriteRepositoryProvider);
  }

  public static MainViewModel newInstance(LocalMediaProvider localMediaProvider,
      FavoriteRepository favoriteRepository) {
    return new MainViewModel(localMediaProvider, favoriteRepository);
  }
}
