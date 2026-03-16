package problem34;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    super("Circle");
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return 2.0 * Math.PI * radius;
  }

  @Override
  public void scale(double factor) {
    try {
      radius = radius * factor;
    } catch (Exception e) {
      System.out.println("Error scaling circle: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", radius = " + radius;
  }
}
