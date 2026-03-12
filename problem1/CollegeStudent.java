package problem1;

/** Represents a college student, extending Student with a year level and major. */
public class CollegeStudent extends Student {

  /** Year-level constants */
  public static final int FROSH = 1;

  public static final int SOPH = 2;
  public static final int JUNIOR = 3;
  public static final int SENIOR = 4;

  private int myYear;
  private String myMajor;

  /**
   * Constructs a new CollegeStudent using the Student superclass constructor.
   *
   * @param name the student's full name
   * @param age the student's age
   * @param gender the student's gender
   * @param idNum the student ID number
   * @param gpa the grade point average (0.0 – 4.0)
   * @param year current college year (1=FROSH, 2=SOPH, 3=JUNIOR, 4=SENIOR)
   * @param major the student's declared major (e.g. "Computer Science")
   */
  public CollegeStudent(
      String name, int age, String gender, String idNum, double gpa, int year, String major) {
    super(name, age, gender, idNum, gpa);
    try {
      this.myYear = (year >= 1 && year <= 4) ? year : FROSH;
      this.myMajor = (major != null && !major.isEmpty()) ? major : "Undeclared";
    } catch (Exception e) {
      System.err.println("Error initializing CollegeStudent: " + e.getMessage());
    }
  }

  /**
   * @return the current year level (1–4)
   */
  public int getYear() {
    return myYear;
  }

  /**
   * @return the student's declared major
   */
  public String getMajor() {
    return myMajor;
  }

  /**
   * Sets the current college year level.
   *
   * @param year the year to set (must be 1–4)
   */
  public void setYear(int year) {
    try {
      if (year < 1 || year > 4) {
        throw new IllegalArgumentException("Year must be between 1 (FROSH) and 4 (SENIOR).");
      }
      this.myYear = year;
    } catch (IllegalArgumentException e) {
      System.err.println("setYear error: " + e.getMessage());
    }
  }

  /**
   * Sets the student's declared major.
   *
   * @param major the new major (cannot be null)
   */
  public void setMajor(String major) {
    try {
      if (major == null) {
        throw new IllegalArgumentException("Major cannot be null.");
      }
      this.myMajor = major;
    } catch (IllegalArgumentException e) {
      System.err.println("setMajor error: " + e.getMessage());
    }
  }

  /** Returns the friendly name of the current year level. */
  private String getYearLabel() {
    switch (myYear) {
      case FROSH:
        return "Freshman";
      case SOPH:
        return "Sophomore";
      case JUNIOR:
        return "Junior";
      case SENIOR:
        return "Senior";
      default:
        return "Unknown";
    }
  }

  /**
   * Returns a formatted string for this CollegeStudent.
   *
   * @return inherited Student info plus year label and major
   */
  @Override
  public String toString() {
    return super.toString()
        + ", Year: "
        + getYearLabel()
        + " ("
        + myYear
        + ")"
        + ", Major: "
        + myMajor;
  }
}
