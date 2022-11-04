package io.github.aaronchenwei.example.dagger;

import dagger.Component;
import javax.inject.Singleton;

/**
 * Dagger component for building vehicles.
 *
 * @author aaronchenwei
 */
@Singleton
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {

  /**
   * Builds a {@link Car}.
   *
   * @return a {@link Car}
   */
  Car buildCar();

}
