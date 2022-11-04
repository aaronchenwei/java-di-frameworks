package io.github.aaronchenwei.example.dagger;

import javax.inject.Inject;

/**
 * Represents a car.
 *
 * @author aaronchenwei
 */
public class Car {

  /**
   * The car's engine.
   */
  private final Engine engine;

  /**
   * The car's brand.
   */
  private final Brand brand;

  /**
   * Instantiates a new Car.
   *
   * @param engine the {@link #engine}
   * @param brand  the {@link #brand}
   */
  @Inject
  public Car(Engine engine, Brand brand) {
    this.engine = engine;
    this.brand = brand;
  }

  /**
   * Gets the {@link #engine}.
   *
   * @return the {@link #engine}
   */
  public Engine getEngine() {
    return engine;
  }

  /**
   * Gets the {@link #brand}.
   *
   * @return the {@link #brand}
   */
  public Brand getBrand() {
    return brand;
  }

}
