package io.github.aaronchenwei.example.dagger;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Dagger module for providing vehicles components.
 *
 * @author aaronchenwei
 */
@Module
public class VehiclesModule {

  /**
   * Creates an {@link Engine}.
   *
   * @return an {@link Engine}
   */
  @Provides
  public Engine provideEngine() {
    return new Engine("v12");
  }

  /**
   * Creates a {@link Brand}.
   *
   * @return a {@link Brand}
   */
  @Provides
  @Singleton
  public Brand provideBrand() {
    return new Brand("Mercedes-Benz");
  }

}
