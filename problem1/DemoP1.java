package problem1;

public class DemoP1 {

  public static void main(String[] args) {
    try {
      System.out.println("===============================================");
      System.out.println("           PROBLEM 1: INHERITANCE DEMO");
      System.out.println("===============================================\n");

      Person bob = new Person("Coach Bob", 27, "M");
      Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
      Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
      CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");

      System.out.println("Initial Objects:");
      System.out.println("  " + bob);
      System.out.println("  " + lynne);
      System.out.println("  " + mrJava);
      System.out.println("  " + ima);

      System.out.println("\nModifying Ima's Year and Major:");
      ima.setYear(CollegeStudent.SOPH);
      ima.setMajor("Computer Programming");

      System.out.println("  " + ima);
      System.out.println("\n===============================================");
    } catch (Exception e) {
      System.out.println("Error in DemoP1: " + e.getMessage());
    }
  }
}
