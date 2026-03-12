package problem34;

/**
 * Demo class for Problem 3. Creates one of each shape type, stores them in a Shape array, then
 * prints each shape's name, area, and perimeter via toString().
 *
 * <p>Run from the QAP 3 root:
 *
 * <pre>
 *   javac -d . "Problem 3-4"/*.java
 *   java problem34.DemoP3
 * </pre>
 */
public class DemoP3 {

  /**
   * Main entry point — runs Problem 3 demonstrations.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    try {
      System.out.println("=== Problem 3 — Abstract Shape Hierarchy ===\n");

      // Shape array — all stored as the abstract type (polymorphism)
      Shape[] shapes = {
        new Circle(5.0),
        new Ellipse(6.0, 4.0),
        new Triangle(3.0, 4.0, 5.0),
        new EquilateralTriangle(6.0)
      };

      // toString() is defined once in Shape and used by all
      for (Shape s : shapes) {
        System.out.println(s);
      }

      // --- Demonstrate the invalid triangle guard ---
      System.out.println("\n--- Invalid Triangle Test (program will exit) ---");
      System.out.println("Attempting Triangle(1, 2, 10) ...");
      Triangle bad = new Triangle(1.0, 2.0, 10.0); // triggers System.exit(1)
      System.out.println(bad); // never reached

    } catch (Exception e) {
      System.err.println("Unexpected error in DemoP3: " + e.getMessage());
    }
  }
}
