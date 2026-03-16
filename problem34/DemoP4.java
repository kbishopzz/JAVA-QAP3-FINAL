package problem34;

public class DemoP4 {

  public static void scaleAll(Scalable[] scalables, double factor) {
    try {
      for (int i = 0; i < scalables.length; i++) {
        scalables[i].scale(factor);
      }
    } catch (Exception e) {
      System.out.println("Error while scaling: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    try {
      System.out.println("===============================================");
      System.out.println("     PROBLEM 4: INTERFACE & SCALING DEMO");
      System.out.println("===============================================\n");

      Shape[] shapes = {
          new Circle(5),
          new Ellipse(6, 4),
          new Triangle(3, 4, 5),
          new EquilateralTriangle(6)
      };

      System.out.println("Before Scaling (factor x2):");
      for (int i = 0; i < shapes.length; i++) {
        System.out.println("  " + shapes[i]);
      }

      scaleAll(shapes, 2);

      System.out.println("\nAfter Scaling:");
      for (int i = 0; i < shapes.length; i++) {
        System.out.println("  " + shapes[i]);
      }
      System.out.println("\n===============================================");
    } catch (Exception e) {
      System.out.println("Error in DemoP4: " + e.getMessage());
    }
  }
}
