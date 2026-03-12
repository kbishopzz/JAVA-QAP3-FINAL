package problem1;

/**
 * Demo class for Problem 1. Constructs Person, Student, Teacher, and CollegeStudent objects and
 * exercises their toString() methods and setters.
 *
 * <p>Run from the QAP 3 root:
 *
 * <pre>
 *   javac problem1/*.java
 *   java -cp . problem1.DemoP1
 * </pre>
 */
public class DemoP1 {

  /**
   * Main entry point — runs Problem 1 demonstrations.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    try {
      System.out.println("=== Problem 1 — High School Inheritance ===\n");

      // --- Basic construction (matches PDF sample usage) ---
      Person bob = new Person("Coach Bob", 27, "M");
      System.out.println(bob);

      Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
      System.out.println(lynne);

      Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
      System.out.println(mrJava);

      CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
      System.out.println(ima);

      // --- Test getters ---
      System.out.println("\n--- Getter Output ---");
      System.out.println("Name: " + bob.getName());
      System.out.println("Age: " + bob.getAge());
      System.out.println("Gender: " + bob.getGender());
      System.out.println("ID: " + lynne.getIdNum());
      System.out.println("GPA: " + lynne.getGpa());
      System.out.println("Subject: " + mrJava.getSubject());
      System.out.println("Salary: $" + mrJava.getSalary());
      System.out.println("Year: " + ima.getYear());
      System.out.println("Major: " + ima.getMajor());

      // --- Test valid setters ---
      System.out.println("\n--- After Valid Setter Calls ---");
      bob.setName("Coach Robert");
      bob.setAge(28);
      bob.setGender("M");
      System.out.println(bob);

      lynne.setGpa(3.8);
      lynne.setIdNum("HS99999");
      System.out.println(lynne);

      mrJava.setSalary(55000.0);
      mrJava.setSubject("Advanced Java");
      System.out.println(mrJava);

      ima.setYear(CollegeStudent.SOPH);
      ima.setMajor("Computer Science");
      System.out.println(ima);

      // --- Test invalid inputs (try-catch in action) ---
      System.out.println("\n--- Validation Error Handling ---");
      bob.setAge(-5); // negative age
      lynne.setGpa(5.0); // GPA out of range
      mrJava.setSalary(-1000); // negative salary
      ima.setYear(9); // year out of range

    } catch (Exception e) {
      System.err.println("Unexpected error in DemoP1: " + e.getMessage());
    }
  }
}
