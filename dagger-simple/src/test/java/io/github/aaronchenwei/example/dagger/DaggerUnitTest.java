package io.github.aaronchenwei.example.dagger;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for building a {@link Car} using Dagger.
 *
 * @author aaronchenwei
 */
public class DaggerUnitTest {

  /**
   * Builds two {@link Car} and checks that the fields are injected correctly.
   */
  @Test
  public void givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {
    VehiclesComponent component = DaggerVehiclesComponent.create();

    Car carOne = component.buildCar();
    Car carTwo = component.buildCar();

    Assertions.assertNotNull(carOne);
    Assertions.assertNotNull(carTwo);
    Assertions.assertNotNull(carOne.getEngine());
    Assertions.assertNotNull(carTwo.getEngine());
    Assertions.assertNotNull(carOne.getBrand());
    Assertions.assertNotNull(carTwo.getBrand());
    Assertions.assertNotEquals(carOne.getEngine(), carTwo.getEngine());
    Assertions.assertEquals(carOne.getBrand(), carTwo.getBrand());
  }

}
