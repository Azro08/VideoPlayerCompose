package com.example.app.vidcompose.di;

import android.app.Application;
import com.example.app.vidcompose.room.VideosDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideDataBaseInstanceFactory implements Factory<VideosDataBase> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideDataBaseInstanceFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public VideosDataBase get() {
    return provideDataBaseInstance(appProvider.get());
  }

  public static AppModule_ProvideDataBaseInstanceFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideDataBaseInstanceFactory(appProvider);
  }

  public static VideosDataBase provideDataBaseInstance(Application app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideDataBaseInstance(app));
  }
}
