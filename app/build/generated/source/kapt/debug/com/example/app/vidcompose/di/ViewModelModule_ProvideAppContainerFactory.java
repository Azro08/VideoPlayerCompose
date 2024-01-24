package com.example.app.vidcompose.di;

import android.app.Application;
import com.example.app.vidcompose.data.AppContainer;
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
public final class ViewModelModule_ProvideAppContainerFactory implements Factory<AppContainer> {
  private final Provider<Application> contextProvider;

  public ViewModelModule_ProvideAppContainerFactory(Provider<Application> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppContainer get() {
    return provideAppContainer(contextProvider.get());
  }

  public static ViewModelModule_ProvideAppContainerFactory create(
      Provider<Application> contextProvider) {
    return new ViewModelModule_ProvideAppContainerFactory(contextProvider);
  }

  public static AppContainer provideAppContainer(Application context) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideAppContainer(context));
  }
}
