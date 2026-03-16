package problem34;

public abstract class Shape implements Scalable {

  private String name;

  public Shape(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract double area();

  public abstract double perimeter();

  @Override
  public String toString() {
    try {
      return name + " area = " + area() + ", perimeter = " + perimeter();
    } catch (Exception e) {
      return name + " could not be displayed.";
    }
  }
}
