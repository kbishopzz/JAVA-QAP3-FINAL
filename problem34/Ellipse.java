package problem34;

/**
 * Represents an ellipse with major axis a and minor axis b. Extends Shape. The constructor always
 * assigns the larger value to a.
 *
 * <ul>
 *   <li>Area = π · a · b
 *   <li>Perimeter ≈ π · √(2(a² + b²) − (a − b)² / 2) — Ramanujan approximation
 * </ul>
 */
public class Ellipse extends Shape {

  private double majorAxis; // major axis (larger value)
  private double minorAxis; // minor axis (smaller value)

  /**
   * Constructs an Ellipse. The larger axis value is automatically assigned to a.
   *
   * @param axis1 one axis length (must be positive)
   * @param axis2 the other axis length (must be positive)
   */
  public Ellipse(double axis1, double axis2) {
    super("Ellipse");
    try {
      if (axis1 <= 0 || axis2 <= 0) {
        throw new IllegalArgumentException("Both axis values must be positive.");
      }
      this.majorAxis = Math.max(axis1, axis2);
      this.minorAxis = Math.min(axis1, axis2);
    } catch (IllegalArgumentException e) {
      System.err.println("Ellipse constructor error: " + e.getMessage());
      this.majorAxis = 2.0;
      this.minorAxis = 1.0;
    }
  }

  /**
   * @return the major axis (a)
   */
  public double getA() {
    return majorAxis;
  }

  /**
   * @return the minor axis (b)
   */
  public double getB() {
    return minorAxis;
  }

  /**
   * Computes the area: π · a · b
   *
   * @return the area
   */
  @Override
  public double area() {
    return Math.PI * majorAxis * minorAxis;
  }

  /**
   * Computes the approximate perimeter (Ramanujan's formula): P = π · √(2(a² + b²) − (a − b)² / 2)
   *
   * @return the approximate perimeter
   */
  @Override
  public double perimeter() {
    try {
      return Math.PI
          * Math.sqrt(
              2.0 * (majorAxis * majorAxis + minorAxis * minorAxis)
                  - Math.pow(majorAxis - minorAxis, 2) / 2.0);
    } catch (Exception e) {
      System.err.println("Ellipse perimeter error: " + e.getMessage());
      return 0;
    }
  }

  /**
   * Scales both axes by the given factor.
   *
   * @param factor the scaling multiplier (must be positive)
   */
  @Override
  public void scale(double factor) {
    try {
      if (factor <= 0) {
        throw new IllegalArgumentException("Scale factor must be positive.");
      }
      majorAxis *= factor;
      minorAxis *= factor;
    } catch (IllegalArgumentException e) {
      System.err.println("Ellipse scale error: " + e.getMessage());
    }
  }

  /**
   * Returns a string with shape info plus axis values.
   *
   * @return formatted shape string
   */
  @Override
  public String toString() {
    return super.toString() + String.format("  [a=%.4f, b=%.4f]", majorAxis, minorAxis);
  }
}
