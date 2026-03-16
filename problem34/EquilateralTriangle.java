package problem34;

public class EquilateralTriangle extends Triangle {

  public EquilateralTriangle(double side) {
    super("EquilateralTriangle", side, side, side);
  }

  public double getSide() {
    return side1;
  }

  @Override
  public double area() {
    return Math.sqrt(3) / 4 * side1 * side1;
  }
}
