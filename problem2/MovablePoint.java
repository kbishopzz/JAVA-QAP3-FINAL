package problem2;

public class MovablePoint extends Point {

  private int xSpeed;
  private int ySpeed;

  public MovablePoint() {
    this(0, 0, 0, 0);
  }

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getSpeedX() {
    return xSpeed;
  }

  public int getSpeedY() {
    return ySpeed;
  }

  public void setSpeedX(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public void setSpeedY(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  public MovablePoint move() {
    try {
      setX(getX() + xSpeed);
      setY(getY() + ySpeed);
    } catch (Exception e) {
      System.out.println("Error moving point: " + e.getMessage());
    }
    return this;
  }

  @Override
  public String toString() {
    return "(" + getX() + ", " + getY() + ") speed = (" + xSpeed + ", " + ySpeed + ")";
  }
}
