package com.example.app.vidcompose.di;

import com.example.app.vidcompose.VidComposeApplication;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ViewModelModule_ProvideVidComposeApplicationFactory implements Factory<VidComposeApplication> {
  @Override
  public VidComposeApplication get() {
    return provideVidComposeApplication();
  }

  public static ViewModelModule_ProvideVidComposeApplicationFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static VidComposeApplication provideVidComposeApplication() {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideVidComposeApplication());
  }

  private static final class InstanceHolder {
    private static final ViewModelModule_ProvideVidComposeApplicationFactory INSTANCE = new ViewModelModule_ProvideVidComposeApplicationFactory();
  }
}
