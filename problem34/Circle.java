package problem34;

/**
 * Represents a circle shape. Extends Shape with a radius. Area = π·r², Perimeter (circumference) =
 * 2π·r.
 */
public class Circle extends Shape {

  private double radius;

  /**
   * Constructs a Circle with the given radius.
   *
   * @param radius the circle's radius (must be greater than 0)
   */
  public Circle(double radius) {
    super("Circle");
    try {
      if (radius <= 0) {
        throw new IllegalArgumentException("Radius must be positive, got: " + radius);
      }
      this.radius = radius;
    } catch (IllegalArgumentException e) {
      System.err.println("Circle constructor error: " + e.getMessage());
      this.radius = 1.0; // safe default
    }
  }

  /**
   * @return the radius of this circle
   */
  public double getRadius() {
    return radius;
  }

  /**
   * Sets the radius of this circle.
   *
   * @param radius the new radius (must be greater than 0)
   */
  public void setRadius(double radius) {
    try {
      if (radius <= 0) {
        throw new IllegalArgumentException("Radius must be positive.");
      }
      this.radius = radius;
    } catch (IllegalArgumentException e) {
      System.err.println("setRadius error: " + e.getMessage());
    }
  }

  /**
   * Computes the area: π · r²
   *
   * @return the area
   */
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  /**
   * Computes the circumference: 2π · r
   *
   * @return the perimeter
   */
  @Override
  public double perimeter() {
    return 2.0 * Math.PI * radius;
  }

  /**
   * Scales this circle by multiplying its radius by the given factor.
   *
   * @param factor the scaling multiplier (must be positive)
   */
  @Override
  public void scale(double factor) {
    try {
      if (factor <= 0) {
        throw new IllegalArgumentException("Scale factor must be positive.");
      }
      radius *= factor;
    } catch (IllegalArgumentException e) {
      System.err.println("Circle scale error: " + e.getMessage());
    }
  }

  /**
   * Returns a string with shape info plus the radius.
   *
   * @return formatted shape string
   */
  @Override
  public String toString() {
    return super.toString() + String.format("  [radius=%.4f]", radius);
  }
}
