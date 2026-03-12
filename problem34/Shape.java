package problem34;

/**
 * Abstract base class for all 2D shapes (Problems 3 and 4). Every shape has a name and can compute
 * its area and perimeter. Implements Scalable — concrete subclasses must provide the scale()
 * method.
 */
public abstract class Shape implements Scalable {

  protected String name;

  /**
   * Constructs a Shape with the given display name.
   *
   * @param name the name of this shape (e.g. "Circle")
   */
  public Shape(String name) {
    this.name = name;
  }

  /**
   * @return the display name of this shape
   */
  public String getName() {
    return name;
  }

  /**
   * Computes the area of this shape.
   *
   * @return the area as a double
   */
  public abstract double area();

  /**
   * Computes the perimeter of this shape.
   *
   * @return the perimeter as a double
   */
  public abstract double perimeter();

  /**
   * Returns a formatted string with the shape name, area, and perimeter. All subclasses inherit
   * this consistent output format.
   *
   * @return shape info as a readable string
   */
  @Override
  public String toString() {
    try {
      return String.format("%-20s | Area: %10.4f | Perimeter: %10.4f", name, area(), perimeter());
    } catch (Exception e) {
      return name + " (error computing values: " + e.getMessage() + ")";
    }
  }
}
