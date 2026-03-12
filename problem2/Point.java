package problem2;

/** Represents a 2D point with x and y coordinates. Used as the base class for MovablePoint. */
public class Point {

  private int xcoord;
  private int ycoord;

  /** Default constructor — places the point at the origin (0, 0). */
  public Point() {
    this(0, 0);
  }

  /**
   * Constructs a Point at the given coordinates.
   *
   * @param x the x-coordinate
   * @param y the y-coordinate
   */
  public Point(int x, int y) {
    try {
      this.xcoord = x;
      this.ycoord = y;
    } catch (Exception e) {
      System.err.println("Error initializing Point: " + e.getMessage());
    }
  }

  /**
   * @return the x-coordinate
   */
  public int getX() {
    return xcoord;
  }

  /**
   * @return the y-coordinate
   */
  public int getY() {
    return ycoord;
  }

  /**
   * Sets the x-coordinate.
   *
   * @param x the new x value
   */
  public void setX(int x) {
    try {
      this.xcoord = x;
    } catch (Exception e) {
      System.err.println("setX error: " + e.getMessage());
    }
  }

  /**
   * Sets the y-coordinate.
   *
   * @param y the new y value
   */
  public void setY(int y) {
    try {
      this.ycoord = y;
    } catch (Exception e) {
      System.err.println("setY error: " + e.getMessage());
    }
  }

  /**
   * Computes the Euclidean distance from this point to another.
   *
   * @param other the other Point
   * @return the distance, or -1 if the other point is null
   */
  public double distance(Point other) {
    try {
      if (other == null) {
        throw new NullPointerException("Cannot compute distance to a null point.");
      }
      int dx = this.xcoord - other.xcoord;
      int dy = this.ycoord - other.ycoord;
      return Math.sqrt(dx * dx + dy * dy);
    } catch (NullPointerException e) {
      System.err.println("distance error: " + e.getMessage());
      return -1;
    }
  }

  /**
   * Returns a string representation of this Point.
   *
   * @return coordinates in (x, y) format
   */
  @Override
  public String toString() {
    return "(" + xcoord + ", " + ycoord + ")";
  }
}
