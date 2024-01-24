package com.example.app.vidcompose.player;

import android.media.audiofx.LoudnessEnhancer;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSession;
import com.example.app.vidcompose.data.LocalMediaProvider;
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
public final class PlayerViewModel_Factory implements Factory<PlayerViewModel> {
  private final Provider<ExoPlayer> playerProvider;

  private final Provider<MediaSession> mediaSessionProvider;

  private final Provider<LoudnessEnhancer> loudnessEnhancerProvider;

  private final Provider<Player.Listener> listenerProvider;

  private final Provider<LocalMediaProvider> localMediaProvider;

  public PlayerViewModel_Factory(Provider<ExoPlayer> playerProvider,
      Provider<MediaSession> mediaSessionProvider,
      Provider<LoudnessEnhancer> loudnessEnhancerProvider,
      Provider<Player.Listener> listenerProvider, Provider<LocalMediaProvider> localMediaProvider) {
    this.playerProvider = playerProvider;
    this.mediaSessionProvider = mediaSessionProvider;
    this.loudnessEnhancerProvider = loudnessEnhancerProvider;
    this.listenerProvider = listenerProvider;
    this.localMediaProvider = localMediaProvider;
  }

  @Override
  public PlayerViewModel get() {
    return newInstance(playerProvider.get(), mediaSessionProvider.get(), loudnessEnhancerProvider.get(), listenerProvider.get(), localMediaProvider.get());
  }

  public static PlayerViewModel_Factory create(Provider<ExoPlayer> playerProvider,
      Provider<MediaSession> mediaSessionProvider,
      Provider<LoudnessEnhancer> loudnessEnhancerProvider,
      Provider<Player.Listener> listenerProvider, Provider<LocalMediaProvider> localMediaProvider) {
    return new PlayerViewModel_Factory(playerProvider, mediaSessionProvider, loudnessEnhancerProvider, listenerProvider, localMediaProvider);
  }

  public static PlayerViewModel newInstance(ExoPlayer player, MediaSession mediaSession,
      LoudnessEnhancer loudnessEnhancer, Player.Listener listener,
      LocalMediaProvider localMediaProvider) {
    return new PlayerViewModel(player, mediaSession, loudnessEnhancer, listener, localMediaProvider);
  }
}
