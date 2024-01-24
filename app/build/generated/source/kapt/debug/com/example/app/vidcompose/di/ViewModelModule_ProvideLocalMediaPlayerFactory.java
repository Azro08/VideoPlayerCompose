package com.example.app.vidcompose.di;

import com.example.app.vidcompose.data.AppContainer;
import com.example.app.vidcompose.data.LocalMediaProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ViewModelModule_ProvideLocalMediaPlayerFactory implements Factory<LocalMediaProvider> {
  private final Provider<AppContainer> appProvider;

  public ViewModelModule_ProvideLocalMediaPlayerFactory(Provider<AppContainer> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public LocalMediaProvider get() {
    return provideLocalMediaPlayer(appProvider.get());
  }

  public static ViewModelModule_ProvideLocalMediaPlayerFactory create(
      Provider<AppContainer> appProvider) {
    return new ViewModelModule_ProvideLocalMediaPlayerFactory(appProvider);
  }

  public static LocalMediaProvider provideLocalMediaPlayer(AppContainer app) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideLocalMediaPlayer(app));
  }
}
