package problem34;

public class Triangle extends Shape {

  protected double side1;
  protected double side2;
  protected double side3;

  public Triangle(double side1, double side2, double side3) {
    this("Triangle", side1, side2, side3);
  }

  protected Triangle(String name, double side1, double side2, double side3) {
    super(name);

    try {
      if (!isValidTriangle(side1, side2, side3)) {
        throw new IllegalArgumentException("Not a valid triangle.");
      }

      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      System.exit(1);
    }
  }

  private boolean isValidTriangle(double s1, double s2, double s3) {
    return (s1 + s2 > s3) && (s2 + s3 > s1) && (s3 + s1 > s2);
  }

  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }

  public double getSide3() {
    return side3;
  }

  @Override
  public double area() {
    double s = perimeter() / 2.0;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  @Override
  public double perimeter() {
    return side1 + side2 + side3;
  }

  @Override
  public void scale(double factor) {
    try {
      side1 = side1 * factor;
      side2 = side2 * factor;
      side3 = side3 * factor;
    } catch (Exception e) {
      System.out.println("Error scaling triangle: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", sides = " + side1 + ", " + side2 + ", " + side3;
  }
}
