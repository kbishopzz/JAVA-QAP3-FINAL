package problem34;

/**
 * Represents a general triangle with three sides. Extends Shape. Area is computed with Heron's
 * formula.
 *
 * <p>The triangle inequality is validated in the constructor. If the sides are invalid the program
 * prints an error and exits.
 */
public class Triangle extends Shape {

  protected double side1;
  protected double side2;
  protected double side3;

  /**
   * Constructs a Triangle and validates the triangle inequality. Calls System.exit(1) if the sides
   * cannot form a triangle.
   *
   * @param side1 first side length (must be positive)
   * @param side2 second side length (must be positive)
   * @param side3 third side length (must be positive)
   */
  public Triangle(double side1, double side2, double side3) {
    this("Triangle", side1, side2, side3);
  }

  /**
   * Protected constructor used by subclasses to pass a custom shape name.
   *
   * @param name the display name for this shape
   * @param side1 first side length
   * @param side2 second side length
   * @param side3 third side length
   */
  protected Triangle(String name, double side1, double side2, double side3) {
    super(name);
    try {
      if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
        throw new IllegalArgumentException(
            "All sides must be positive. Got: " + side1 + ", " + side2 + ", " + side3);
      }
      if (!isValidTriangle(side1, side2, side3)) {
        throw new IllegalArgumentException(
            "Sides "
                + side1
                + ", "
                + side2
                + ", "
                + side3
                + " do not satisfy the triangle inequality.");
      }
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } catch (IllegalArgumentException e) {
      System.err.println("Triangle error: " + e.getMessage());
      System.exit(1);
    }
  }

  /** Checks that each side is less than the sum of the other two. */
  private boolean isValidTriangle(double s1, double s2, double s3) {
    return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
  }

  /**
   * @return side 1 length
   */
  public double getSide1() {
    return side1;
  }

  /**
   * @return side 2 length
   */
  public double getSide2() {
    return side2;
  }

  /**
   * @return side 3 length
   */
  public double getSide3() {
    return side3;
  }

  /**
   * Computes the area using Heron's formula: s = (a + b + c) / 2 → Area = √(s · (s−a) · (s−b) ·
   * (s−c))
   *
   * @return the triangle's area
   */
  @Override
  public double area() {
    try {
      double s = (side1 + side2 + side3) / 2.0;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    } catch (Exception e) {
      System.err.println("Triangle area error: " + e.getMessage());
      return 0;
    }
  }

  /**
   * Computes the perimeter (sum of all three sides).
   *
   * @return the perimeter
   */
  @Override
  public double perimeter() {
    return side1 + side2 + side3;
  }

  /**
   * Scales all three sides by the given factor.
   *
   * @param factor the scaling multiplier (must be positive)
   */
  @Override
  public void scale(double factor) {
    try {
      if (factor <= 0) {
        throw new IllegalArgumentException("Scale factor must be positive.");
      }
      side1 *= factor;
      side2 *= factor;
      side3 *= factor;
    } catch (IllegalArgumentException e) {
      System.err.println("Triangle scale error: " + e.getMessage());
    }
  }

  /**
   * Returns a string with shape info plus the three side lengths.
   *
   * @return formatted shape string
   */
  @Override
  public String toString() {
    return super.toString() + String.format("  [sides=%.4f, %.4f, %.4f]", side1, side2, side3);
  }
}
