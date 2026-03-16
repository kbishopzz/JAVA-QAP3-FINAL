package problem1;

public class Student extends Person {

  private String idNum;
  private double gpa;

  public Student(String name, int age, String gender, String idNum, double gpa) {
    super(name, age, gender);
    this.idNum = idNum;
    this.gpa = gpa;
  }

  public String getIdNum() {
    return idNum;
  }

  public double getGpa() {
    return gpa;
  }

  public void setIdNum(String idNum) {
    try {
      if (idNum == null || idNum.trim().isEmpty()) {
        throw new IllegalArgumentException("ID number cannot be null or empty");
      }
      this.idNum = idNum;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting ID number: " + e.getMessage());
    }
  }

  public void setGpa(double gpa) {
    try {
      if (gpa < 0.0 || gpa > 4.0) {
        throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
      }
      this.gpa = gpa;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting GPA: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", ID: " + idNum + ", GPA: " + gpa;
  }
}
