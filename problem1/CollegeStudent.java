package problem1;

public class CollegeStudent extends Student {

  public static final int FROSH = 1;
  public static final int SOPH = 2;
  public static final int JUNIOR = 3;
  public static final int SENIOR = 4;

  private int year;
  private String major;

  public CollegeStudent(
      String name, int age, String gender, String idNum, double gpa, int year, String major) {
    super(name, age, gender, idNum, gpa);
    this.year = year;
    this.major = major;
  }

  public int getYear() {
    return year;
  }

  public String getMajor() {
    return major;
  }

  public void setYear(int year) {
    try {
      if (year < FROSH || year > SENIOR) {
        throw new IllegalArgumentException("Year must be between 1 (Freshman) and 4 (Senior)");
      }
      this.year = year;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting year: " + e.getMessage());
    }
  }

  public void setMajor(String major) {
    try {
      if (major == null || major.trim().isEmpty()) {
        throw new IllegalArgumentException("Major cannot be null or empty");
      }
      this.major = major;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting major: " + e.getMessage());
    }
  }

  private String getYearLabel() {
    switch (year) {
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

  @Override
  public String toString() {
    return super.toString() + ", Year: " + getYearLabel() + ", Major: " + major;
  }
}
