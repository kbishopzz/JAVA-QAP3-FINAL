package problem1;

/**
 * Represents a person with a name, age, and gender. This is the base class for the Problem 1
 * inheritance hierarchy.
 */
public class Person {

  protected String myName;
  protected int myAge;
  protected String myGender; // "M" for male, "F" for female

  /**
   * Constructs a new Person.
   *
   * @param name the person's full name
   * @param age the person's age (must be non-negative)
   * @param gender "M" for male, "F" for female
   */
  public Person(String name, int age, String gender) {
    try {
      this.myName = (name != null && !name.isEmpty()) ? name : "Unknown";
      this.myAge = (age >= 0) ? age : 0;
      this.myGender = (gender != null) ? gender : "U";
    } catch (Exception e) {
      System.err.println("Error initializing Person: " + e.getMessage());
    }
  }

  /**
   * @return the person's name
   */
  public String getName() {
    return myName;
  }

  /**
   * @return the person's age
   */
  public int getAge() {
    return myAge;
  }

  /**
   * @return the person's gender
   */
  public String getGender() {
    return myGender;
  }

  /**
   * Sets the person's name.
   *
   * @param name the new name (cannot be null or empty)
   */
  public void setName(String name) {
    try {
      if (name == null || name.isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or empty.");
      }
      this.myName = name;
    } catch (IllegalArgumentException e) {
      System.err.println("setName error: " + e.getMessage());
    }
  }

  /**
   * Sets the person's age.
   *
   * @param age the new age (must be 0 or greater)
   */
  public void setAge(int age) {
    try {
      if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative.");
      }
      this.myAge = age;
    } catch (IllegalArgumentException e) {
      System.err.println("setAge error: " + e.getMessage());
    }
  }

  /**
   * Sets the person's gender.
   *
   * @param gender the new gender (cannot be null)
   */
  public void setGender(String gender) {
    try {
      if (gender == null) {
        throw new IllegalArgumentException("Gender cannot be null.");
      }
      this.myGender = gender;
    } catch (IllegalArgumentException e) {
      System.err.println("setGender error: " + e.getMessage());
    }
  }

  /**
   * Returns a formatted string for this Person.
   *
   * @return name, age, and gender as a readable string
   */
  @Override
  public String toString() {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }
}
