package problem2;

public class DemoP2 {

  public static void main(String[] args) {
    try {
      System.out.println("===============================================");
      System.out.println("       PROBLEM 2: INHERITANCE & METHODS DEMO");
      System.out.println("===============================================\n");

      Point p1 = new Point();
      Point p2 = new Point(3, 4);
      MovablePoint p3 = new MovablePoint(0, 0, 2, 3);

      System.out.println("Points Created:");
      System.out.println("  p1 = " + p1);
      System.out.println("  p2 = " + p2);
      System.out.println("  Distance between p1 and p2 = " + p1.distance(p2));

      System.out.println("\nMovingPoint p3 Sequence:");
      System.out.println("  Before move: " + p3);
      p3.move();
      System.out.println("  After move:  " + p3);
      p3.move();
      System.out.println("  After move:  " + p3);
      System.out.println("\n===============================================");
    } catch (Exception e) {
      System.out.println("Error in DemoP2: " + e.getMessage());
    }
  }
}
