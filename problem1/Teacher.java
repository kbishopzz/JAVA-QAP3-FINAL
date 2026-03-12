package problem1;

/** Represents a teacher, extending Person with a subject and annual salary. */
public class Teacher extends Person {

  private String mySubject;
  private double mySalary;

  /**
   * Constructs a new Teacher using the Person superclass constructor.
   *
   * @param name the teacher's full name
   * @param age the teacher's age
   * @param gender the teacher's gender
   * @param subject the subject taught (e.g. "Computer Science", "Chemistry")
   * @param salary the teacher's annual salary (must be non-negative)
   */
  public Teacher(String name, int age, String gender, String subject, double salary) {
    super(name, age, gender);
    try {
      this.mySubject = (subject != null && !subject.isEmpty()) ? subject : "Other";
      this.mySalary = (salary >= 0) ? salary : 0.0;
    } catch (Exception e) {
      System.err.println("Error initializing Teacher: " + e.getMessage());
    }
  }

  /**
   * @return the subject this teacher teaches
   */
  public String getSubject() {
    return mySubject;
  }

  /**
   * @return the teacher's annual salary
   */
  public double getSalary() {
    return mySalary;
  }

  /**
   * Sets the subject this teacher teaches.
   *
   * @param subject the new subject (cannot be null)
   */
  public void setSubject(String subject) {
    try {
      if (subject == null) {
        throw new IllegalArgumentException("Subject cannot be null.");
      }
      this.mySubject = subject;
    } catch (IllegalArgumentException e) {
      System.err.println("setSubject error: " + e.getMessage());
    }
  }

  /**
   * Sets the teacher's annual salary.
   *
   * @param salary the new salary (must be 0 or greater)
   */
  public void setSalary(double salary) {
    try {
      if (salary < 0) {
        throw new IllegalArgumentException("Salary cannot be negative.");
      }
      this.mySalary = salary;
    } catch (IllegalArgumentException e) {
      System.err.println("setSalary error: " + e.getMessage());
    }
  }

  /**
   * Returns a formatted string for this Teacher.
   *
   * @return inherited Person info plus subject and salary
   */
  @Override
  public String toString() {
    return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
  }
}
