package problem2;

/**
 * Demo class for Problem 2. Tests the Point and MovablePoint classes — construction, movement, and
 * setters.
 *
 * <p>Run from the QAP 3 root:
 *
 * <pre>
 *   javac problem2/*.java
 *   java -cp . problem2.DemoP2
 * </pre>
 */
public class DemoP2 {

  /**
   * Main entry point — runs Problem 2 demonstrations.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    try {
      System.out.println("=== Problem 2 — Point / MovablePoint ===\n");

      // --- Basic Point usage ---
      Point p1 = new Point(); // origin
      Point p2 = new Point(3, 4);

      System.out.println("p1: " + p1);
      System.out.println("p2: " + p2);
      System.out.printf("Distance p1 → p2: %.4f%n", p1.distance(p2));

      // Setters
      p1.setX(1);
      p1.setY(1);
      System.out.println("p1 after setX/setY: " + p1);

      // --- MovablePoint usage ---
      System.out.println("\n--- MovablePoint ---");
      MovablePoint mp = new MovablePoint(0, 0, 2, 3);
      System.out.println("Initial:       " + mp);

      mp.move();
      System.out.println("After move #1: " + mp);

      mp.move();
      System.out.println("After move #2: " + mp);

      // Change speed and move again
      mp.setSpeedX(-1);
      mp.setSpeedY(-2);
      System.out.println("Speed changed: " + mp);

      mp.move();
      System.out.println("After move #3: " + mp);

      // Getter check
      System.out.println("\nspeedX: " + mp.getSpeedX() + "  speedY: " + mp.getSpeedY());
      System.out.println("x: " + mp.getX() + "  y: " + mp.getY());

      // Null-distance guard
      System.out.println("\n--- Null Point Distance Test ---");
      double d = p2.distance(null); // prints error gracefully
      System.out.println("Result: " + d);

    } catch (Exception e) {
      System.err.println("Unexpected error in DemoP2: " + e.getMessage());
    }
  }
}
