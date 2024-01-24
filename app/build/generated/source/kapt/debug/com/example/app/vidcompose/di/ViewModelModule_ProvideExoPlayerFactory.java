package com.example.app.vidcompose.di;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
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
public final class ViewModelModule_ProvideExoPlayerFactory implements Factory<ExoPlayer> {
  private final Provider<Context> applicationProvider;

  public ViewModelModule_ProvideExoPlayerFactory(Provider<Context> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public ExoPlayer get() {
    return provideExoPlayer(applicationProvider.get());
  }

  public static ViewModelModule_ProvideExoPlayerFactory create(
      Provider<Context> applicationProvider) {
    return new ViewModelModule_ProvideExoPlayerFactory(applicationProvider);
  }

  public static ExoPlayer provideExoPlayer(Context application) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideExoPlayer(application));
  }
}
