package problem1;

public class Teacher extends Person {

  private String subject;
  private double salary;

  public Teacher(String name, int age, String gender, String subject, double salary) {
    super(name, age, gender);
    this.subject = subject;
    this.salary = salary;
  }

  public String getSubject() {
    return subject;
  }

  public double getSalary() {
    return salary;
  }

  public void setSubject(String subject) {
    try {
      if (subject == null || subject.trim().isEmpty()) {
        throw new IllegalArgumentException("Subject cannot be null or empty");
      }
      this.subject = subject;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting subject: " + e.getMessage());
    }
  }

  public void setSalary(double salary) {
    try {
      if (salary < 0) {
        throw new IllegalArgumentException("Salary cannot be negative");
      }
      this.salary = salary;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting salary: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
  }
}
