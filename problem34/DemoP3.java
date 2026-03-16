package problem34;

public class DemoP3 {

  public static void main(String[] args) {
    try {
      System.out.println("===============================================");
      System.out.println("    PROBLEM 3: POLYMORPHISM WITH SHAPES DEMO");
      System.out.println("===============================================\n");

      Shape[] shapes = {
          new Circle(5),
          new Ellipse(6, 4),
          new Triangle(3, 4, 5),
          new EquilateralTriangle(6)
      };

      System.out.println("Shape Properties:");
      for (int i = 0; i < shapes.length; i++) {
        System.out.println("  " + (i + 1) + ". " + shapes[i]);
      }
      System.out.println("\n===============================================");
    } catch (Exception e) {
      System.out.println("Error in DemoP3: " + e.getMessage());
    }
  }
}
