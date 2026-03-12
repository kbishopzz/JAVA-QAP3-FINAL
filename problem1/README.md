# Problem 1 — Inheritance: High School Application

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Topic](https://img.shields.io/badge/Topic-Inheritance-blue?style=for-the-badge)
![Package](https://img.shields.io/badge/Package-problem1-9cf?style=for-the-badge)

---

## What This Problem Is About

This problem builds a small **High School** application using **Java inheritance**.
You start with a provided `Person` base class and `Student` subclass, then write
two new classes — `Teacher` and `CollegeStudent` — that extend them.

The exercise practices:

- Extending a superclass with `extends`
- Calling a parent class constructor with `super()`
- Writing getters and setters with validation
- Overriding `toString()` using `super.toString()`

---

## Class Hierarchy

```
Person
├── Student
│   └── CollegeStudent
└── Teacher
```

---

## Files in This Folder

| File                  | Role                                               |
| --------------------- | -------------------------------------------------- |
| `Person.java`         | Base class — name, age, gender                     |
| `Student.java`        | Extends Person — adds student ID and GPA           |
| `Teacher.java`        | Extends Person — adds subject and salary           |
| `CollegeStudent.java` | Extends Student — adds year level and major        |
| `DemoP1.java`         | Main class — constructs all types and tests output |

> All files belong to the `problem1` package.

---

## How to Compile & Run

Commands are run from the **QAP 3 root folder** (one level above this folder):

```bash
# Compile
javac problem1/*.java

# Run the demo
java -cp . problem1.DemoP1
```

### Expected Output (excerpt)

```
=== Problem 1 — High School Inheritance ===

Coach Bob, age: 27, gender: M
Lynne Brooke, age: 16, gender: F, ID: HS95129, GPA: 3.5
Duke Java, age: 34, gender: M, Subject: Computer Science, Salary: $50000.0
Ima Frosh, age: 18, gender: F, ID: UCB123, GPA: 4.0, Year: Freshman (1), Major: English
```

---

## Key Design Notes

- **`super()`** is called in every constructor to pass inherited fields to the parent class.
- **Inline try-catch** in every setter prints a clear error and keeps the program running if bad data is passed in.
- `CollegeStudent` has year-level constants (`FROSH = 1`, `SOPH = 2`, etc.) so callers don't need to use magic numbers.

---

_QAP 3 — Advanced Programming (Java) | Keyin College, Winter 2026_
