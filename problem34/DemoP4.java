package problem34;

/**
 * Demo class for Problem 4. Demonstrates the Scalable interface — prints all shapes before and
 * after applying a scale factor through a static helper method.
 *
 * <p>Run from the QAP 3 root:
 *
 * <pre>
 *   javac -d . "Problem 3-4"/*.java
 *   java problem34.DemoP4
 * </pre>
 */
public class DemoP4 {

  /**
   * Applies the given scale factor to every element in a Scalable array.
   *
   * @param scalables an array of Scalable objects to resize
   * @param factor the multiplier to apply to each element
   */
  public static void scaleAll(Scalable[] scalables, double factor) {
    try {
      for (Scalable s : scalables) {
        s.scale(factor);
      }
    } catch (Exception e) {
      System.err.println("scaleAll error: " + e.getMessage());
    }
  }

  /**
   * Main entry point — runs Problem 4 demonstrations.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    try {
      System.out.println("=== Problem 4 — Scalable Interface ===\n");

      // Shape implements Scalable, so Shape[] works with scaleAll()
      Shape[] shapes = {
        new Circle(5.0),
        new Ellipse(6.0, 4.0),
        new Triangle(3.0, 4.0, 5.0),
        new EquilateralTriangle(6.0)
      };

      System.out.println("--- Before Scaling ---");
      for (Shape s : shapes) {
        System.out.println(s);
      }

      scaleAll(shapes, 2.0);

      System.out.println("\n--- After Scaling by factor 2.0 ---");
      for (Shape s : shapes) {
        System.out.println(s);
      }

      scaleAll(shapes, 0.5);

      System.out.println("\n--- After Scaling back by factor 0.5 ---");
      for (Shape s : shapes) {
        System.out.println(s);
      }

      // Test invalid scale factor
      System.out.println("\n--- Invalid Scale Factor Test ---");
      shapes[0].scale(-1.0); // should print error, not crash

    } catch (Exception e) {
      System.err.println("Unexpected error in DemoP4: " + e.getMessage());
    }
  }
}
