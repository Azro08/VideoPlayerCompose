package com.example.app.vidcompose.di;

import android.media.audiofx.LoudnessEnhancer;
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
public final class ViewModelModule_ProvideLoudnessEnhancerFactory implements Factory<LoudnessEnhancer> {
  private final Provider<ExoPlayer> playerProvider;

  public ViewModelModule_ProvideLoudnessEnhancerFactory(Provider<ExoPlayer> playerProvider) {
    this.playerProvider = playerProvider;
  }

  @Override
  public LoudnessEnhancer get() {
    return provideLoudnessEnhancer(playerProvider.get());
  }

  public static ViewModelModule_ProvideLoudnessEnhancerFactory create(
      Provider<ExoPlayer> playerProvider) {
    return new ViewModelModule_ProvideLoudnessEnhancerFactory(playerProvider);
  }

  public static LoudnessEnhancer provideLoudnessEnhancer(ExoPlayer player) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideLoudnessEnhancer(player));
  }
}
