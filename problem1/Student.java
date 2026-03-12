package problem1;

/** Represents a high-school student, extending Person with an ID and GPA. */
public class Student extends Person {

  protected String myIdNum;
  protected double myGpa;

  /**
   * Constructs a new Student using the Person superclass constructor.
   *
   * @param name the student's full name
   * @param age the student's age
   * @param gender the student's gender
   * @param idNum the student ID number
   * @param gpa the grade point average (0.0 – 4.0)
   */
  public Student(String name, int age, String gender, String idNum, double gpa) {
    super(name, age, gender);
    try {
      this.myIdNum = (idNum != null && !idNum.isEmpty()) ? idNum : "000000";
      this.myGpa = (gpa >= 0.0 && gpa <= 4.0) ? gpa : 0.0;
    } catch (Exception e) {
      System.err.println("Error initializing Student: " + e.getMessage());
    }
  }

  /**
   * @return the student's ID number
   */
  public String getIdNum() {
    return myIdNum;
  }

  /**
   * @return the student's GPA
   */
  public double getGpa() {
    return myGpa;
  }

  /**
   * Sets the student's ID number.
   *
   * @param idNum the new ID number (cannot be null or empty)
   */
  public void setIdNum(String idNum) {
    try {
      if (idNum == null || idNum.isEmpty()) {
        throw new IllegalArgumentException("ID number cannot be null or empty.");
      }
      this.myIdNum = idNum;
    } catch (IllegalArgumentException e) {
      System.err.println("setIdNum error: " + e.getMessage());
    }
  }

  /**
   * Sets the student's GPA.
   *
   * @param gpa the new GPA (must be between 0.0 and 4.0)
   */
  public void setGpa(double gpa) {
    try {
      if (gpa < 0.0 || gpa > 4.0) {
        throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
      }
      this.myGpa = gpa;
    } catch (IllegalArgumentException e) {
      System.err.println("setGpa error: " + e.getMessage());
    }
  }

  /**
   * Returns a formatted string for this Student.
   *
   * @return inherited Person info plus ID and GPA
   */
  @Override
  public String toString() {
    return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGpa;
  }
}
