package com.example.app.vidcompose.di;

import android.media.audiofx.LoudnessEnhancer;
import androidx.media3.common.Player;
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
public final class ViewModelModule_ProvidePlayerListenerFactory implements Factory<Player.Listener> {
  private final Provider<ExoPlayer> playerProvider;

  private final Provider<LoudnessEnhancer> loudnessEnhancerProvider;

  public ViewModelModule_ProvidePlayerListenerFactory(Provider<ExoPlayer> playerProvider,
      Provider<LoudnessEnhancer> loudnessEnhancerProvider) {
    this.playerProvider = playerProvider;
    this.loudnessEnhancerProvider = loudnessEnhancerProvider;
  }

  @Override
  public Player.Listener get() {
    return providePlayerListener(playerProvider.get(), loudnessEnhancerProvider.get());
  }

  public static ViewModelModule_ProvidePlayerListenerFactory create(
      Provider<ExoPlayer> playerProvider, Provider<LoudnessEnhancer> loudnessEnhancerProvider) {
    return new ViewModelModule_ProvidePlayerListenerFactory(playerProvider, loudnessEnhancerProvider);
  }

  public static Player.Listener providePlayerListener(ExoPlayer player,
      LoudnessEnhancer loudnessEnhancer) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.providePlayerListener(player, loudnessEnhancer));
  }
}
