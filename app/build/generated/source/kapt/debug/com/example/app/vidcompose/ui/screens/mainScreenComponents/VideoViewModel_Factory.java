package com.example.app.vidcompose.ui.screens.mainScreenComponents;

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
public final class VideoViewModel_Factory implements Factory<VideoViewModel> {
  private final Provider<FavoriteRepository> repositoryProvider;

  public VideoViewModel_Factory(Provider<FavoriteRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public VideoViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static VideoViewModel_Factory create(Provider<FavoriteRepository> repositoryProvider) {
    return new VideoViewModel_Factory(repositoryProvider);
  }

  public static VideoViewModel newInstance(FavoriteRepository repository) {
    return new VideoViewModel(repository);
  }
}
