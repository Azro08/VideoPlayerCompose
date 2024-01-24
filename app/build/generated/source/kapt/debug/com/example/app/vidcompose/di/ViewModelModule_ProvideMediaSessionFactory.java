package com.example.app.vidcompose.di;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSession;
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
public final class ViewModelModule_ProvideMediaSessionFactory implements Factory<MediaSession> {
  private final Provider<Context> applicationProvider;

  private final Provider<ExoPlayer> playerProvider;

  public ViewModelModule_ProvideMediaSessionFactory(Provider<Context> applicationProvider,
      Provider<ExoPlayer> playerProvider) {
    this.applicationProvider = applicationProvider;
    this.playerProvider = playerProvider;
  }

  @Override
  public MediaSession get() {
    return provideMediaSession(applicationProvider.get(), playerProvider.get());
  }

  public static ViewModelModule_ProvideMediaSessionFactory create(
      Provider<Context> applicationProvider, Provider<ExoPlayer> playerProvider) {
    return new ViewModelModule_ProvideMediaSessionFactory(applicationProvider, playerProvider);
  }

  public static MediaSession provideMediaSession(Context application, ExoPlayer player) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideMediaSession(application, player));
  }
}
