package problem1;

public class Person {

  private String name;
  private int age;
  private String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public void setName(String name) {
    try {
      if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or empty");
      }
      this.name = name;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting name: " + e.getMessage());
    }
  }

  public void setAge(int age) {
    try {
      if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
      }
      this.age = age;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting age: " + e.getMessage());
    }
  }

  public void setGender(String gender) {
    try {
      if (gender == null || gender.trim().isEmpty()) {
        throw new IllegalArgumentException("Gender cannot be null or empty");
      }
      this.gender = gender;
    } catch (IllegalArgumentException e) {
      System.out.println("Error setting gender: " + e.getMessage());
    }
  }

  @Override
  public String toString() {
    return name + ", age: " + age + ", gender: " + gender;
  }
}
