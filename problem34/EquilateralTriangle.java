package problem34;

/**
 * Represents an equilateral triangle (all three sides equal). Extends Triangle — passes the same
 * value for all three sides.
 *
 * <ul>
 *   <li>Area = (√3 / 4) · side² (exact formula, overrides Heron's)
 *   <li>Perimeter = 3 · side (inherited from Triangle)
 * </ul>
 */
public class EquilateralTriangle extends Triangle {

  /**
   * Constructs an EquilateralTriangle with three equal sides.
   *
   * @param side the length of each side (must be positive)
   */
  public EquilateralTriangle(double side) {
    super("EquilateralTriangle", side, side, side);
  }

  /**
   * @return the common side length
   */
  public double getSide() {
    return side1; // all three sides are equal
  }

  /**
   * Computes the area using the equilateral formula: (√3 / 4) · side² Overrides the inherited
   * Heron's formula.
   *
   * @return the area
   */
  @Override
  public double area() {
    try {
      return (Math.sqrt(3.0) / 4.0) * side1 * side1;
    } catch (Exception e) {
      System.err.println("EquilateralTriangle area error: " + e.getMessage());
      return 0;
    }
  }
}
