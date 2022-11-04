package io.github.aaronchenwei.example.dagger;

/**
 * Engine of a {@link Car}.
 *
 * @author aaronchenwei
 */
public class Engine {

  /**
   * The name of the engine.
   */
  private final String name;

  public Engine(String name) {
    this.name = name;
  }

  /**
   * Starts the engine.
   */
  public void start() {
    System.out.println("Engine started");
  }

  /**
   * Stops the engine.
   */
  public void stop() {
    System.out.println("Engine stopped");
  }

}
