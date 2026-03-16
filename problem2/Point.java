package problem2;

public class Point {

  private int x;
  private int y;

  public Point() {
    this(0, 0);
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance(Point other) {
    try {
      int dx = x - other.x;
      int dy = y - other.y;
      return Math.sqrt(dx * dx + dy * dy);
    } catch (Exception e) {
      System.out.println("Error calculating distance: " + e.getMessage());
      return 0;
    }
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
