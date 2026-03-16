package problem34;

public class Ellipse extends Shape {

  private double a;
  private double b;

  public Ellipse(double a, double b) {
    super("Ellipse");
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  @Override
  public double area() {
    return Math.PI * a * b;
  }

  @Override
  public double perimeter() {
    return Math.PI * Math.sqrt(2 * (a * a + b * b) - ((a - b) * (a - b) / 2.0));
  }

  @Override
  public void scale(double factor) {
    try {
      a = a * factor;
      b = b * factor;
    } catch (Exception e) {
      System.out.println("Error scaling ellipse: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", a = " + a + ", b = " + b;
  }
}
