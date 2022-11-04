package io.github.aaronchenwei.example.dagger;

/**
 * Brand of a {@link Car}.
 *
 * @author aaronchenwei
 */
public class Brand {

  /**
   * The name of the brand.
   */
  private final String name;

  /**
   * Instantiates a new Brand.
   *
   * @param name the {@link #name}
   */
  public Brand(String name) {
    this.name = name;
  }

  /**
   * Gets the {@link #name}.
   *
   * @return the {@link #name}
   */
  public String getName() {
    return name;
  }

}
