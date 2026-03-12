package problem2;

/**
 * A point that can move across a 2D plane at a set speed. Extends Point by adding speedX and
 * speedY.
 *
 * <p>Important: x and y are <em>private</em> in Point, so all access goes through inherited
 * getters/setters (getX, setX, getY, setY). {@code move()} cannot write {@code x += speedX} — it
 * must use {@code setX(getX() + speedX)} instead.
 */
public class MovablePoint extends Point {

  private int speedX;
  private int speedY;

  /** Default constructor — places point at origin with zero speed. */
  public MovablePoint() {
    this(0, 0, 0, 0);
  }

  /**
   * Constructs a MovablePoint with a starting position and speed.
   *
   * @param x starting x-coordinate
   * @param y starting y-coordinate
   * @param speedX speed in the x direction (pixels/step)
   * @param speedY speed in the y direction (pixels/step)
   */
  public MovablePoint(int x, int y, int speedX, int speedY) {
    super(x, y);
    try {
      this.speedX = speedX;
      this.speedY = speedY;
    } catch (Exception e) {
      System.err.println("Error initializing MovablePoint: " + e.getMessage());
    }
  }

  /**
   * @return the x speed
   */
  public int getSpeedX() {
    return speedX;
  }

  /**
   * @return the y speed
   */
  public int getSpeedY() {
    return speedY;
  }

  /**
   * Sets the x speed.
   *
   * @param speedX the new x speed
   */
  public void setSpeedX(int speedX) {
    try {
      this.speedX = speedX;
    } catch (Exception e) {
      System.err.println("setSpeedX error: " + e.getMessage());
    }
  }

  /**
   * Sets the y speed.
   *
   * @param speedY the new y speed
   */
  public void setSpeedY(int speedY) {
    try {
      this.speedY = speedY;
    } catch (Exception e) {
      System.err.println("setSpeedY error: " + e.getMessage());
    }
  }

  /**
   * Moves this point one step by adding the speed values to the current position. Uses setX/getX
   * because x and y are private in Point.
   *
   * @return this MovablePoint (allows method chaining)
   */
  public MovablePoint move() {
    try {
      setX(getX() + speedX);
      setY(getY() + speedY);
    } catch (Exception e) {
      System.err.println("move() error: " + e.getMessage());
    }
    return this;
  }

  /**
   * Returns a formatted string showing position and speed.
   *
   * @return position and speed in a readable format
   */
  @Override
  public String toString() {
    return "Position: (" + getX() + ", " + getY() + ")  Speed: (" + speedX + ", " + speedY + ")";
  }
}
