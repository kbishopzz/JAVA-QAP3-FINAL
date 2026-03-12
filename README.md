# QAP 3 — Advanced Programming (Java)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)
![Course](https://img.shields.io/badge/Course-Advanced%20Programming-blue?style=for-the-badge)
![Semester](https://img.shields.io/badge/Semester%203-Winter%202026-9cf?style=for-the-badge)

> **Quantitative Assessment Practice 3** — Keyin College | Due: March 16, 2026

---

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Problem 1 — Inheritance (High School)](#problem-1--inheritance-high-school)
- [Problem 2 — Inheritance (Point / MovablePoint)](#problem-2--inheritance-point--movablepoint)
- [Problem 3 & 4 — Abstract Classes + Interfaces](#problem-3--4--abstract-classes--interfaces)
- [How to Compile & Run](#how-to-compile--run)

---

## Overview

This project covers four core object-oriented programming concepts in Java, organized into three problem folders:

| Folder         | Package     | Topic                   | Key Concept                                      |
| -------------- | ----------- | ----------------------- | ------------------------------------------------ |
| `Problem 1/`   | `problem1`  | High School Application | Inheritance, super constructors, getters/setters |
| `Problem 2/`   | `problem2`  | Point / MovablePoint    | Inheritance, private fields, method chaining     |
| `Problem 3-4/` | `problem34` | Shapes + Scalable       | Abstract classes, interfaces, polymorphism       |

Each problem uses inline try-catch for error handling and includes basic Javadocs.

---

## Project Structure

```
QAP 3/
│
├── Problem 1/                    ← package problem1
│   ├── Person.java               ← base class
│   ├── Student.java              ← extends Person
│   ├── Teacher.java              ← extends Person
│   ├── CollegeStudent.java       ← extends Student
│   ├── DemoP1.java               ← main / demo class
│   └── README.md
│
├── Problem 2/                    ← package problem2
│   ├── Point.java                ← base class (private x, y)
│   ├── MovablePoint.java         ← extends Point
│   ├── DemoP2.java               ← main / demo class
│   └── README.md
│
├── Problem 3-4/                  ← package problem34
│   ├── Scalable.java             ← interface
│   ├── Shape.java                ← abstract base class (implements Scalable)
│   ├── Circle.java               ← extends Shape
│   ├── Ellipse.java              ← extends Shape
│   ├── Triangle.java             ← extends Shape
│   ├── EquilateralTriangle.java  ← extends Triangle
│   ├── DemoP3.java               ← polymorphic shape array demo
│   ├── DemoP4.java               ← scaleAll() interface demo
│   └── README.md
│
├── README.md                     ← this file
└── JOURNAL.md                    ← completion log
```

---

## Problem 1 — Inheritance (High School)

> See [`Problem 1/README.md`](Problem%201/README.md) for full details.

### Class Hierarchy

```
Person
├── Student
│   └── CollegeStudent
└── Teacher
```

| Class            | New Fields                    | Key Methods                                                             |
| ---------------- | ----------------------------- | ----------------------------------------------------------------------- |
| `Person`         | `myName`, `myAge`, `myGender` | `getName/setName`, `getAge/setAge`, `getGender/setGender`, `toString()` |
| `Student`        | `myIdNum`, `myGPA`            | `getIdNum/setIdNum`, `getGPA/setGPA`, `toString()`                      |
| `Teacher`        | `mySubject`, `mySalary`       | `getSubject/setSubject`, `getSalary/setSalary`, `toString()`            |
| `CollegeStudent` | `myYear`, `myMajor`           | `getYear/setYear`, `getMajor/setMajor`, `toString()`                    |

### Sample Output

```
Coach Bob, age: 27, gender: M
Lynne Brooke, age: 16, gender: F, ID: HS95129, GPA: 3.5
Duke Java, age: 34, gender: M, Subject: Computer Science, Salary: $50000.0
Ima Frosh, age: 18, gender: F, ID: UCB123, GPA: 4.0, Year: Freshman (1), Major: English
```

---

## Problem 2 — Inheritance (Point / MovablePoint)

> See [`Problem 2/README.md`](Problem%202/README.md) for full details.

### Class Hierarchy

```
Point  (private x, y)
└── MovablePoint  (adds xSpeed, ySpeed)
```

> **Key design note:** `x` and `y` are `private` in `Point`, so `MovablePoint.move()`
> must call `setX(getX() + xSpeed)` instead of directly accessing `x`.

| Class          | Fields             | Key Methods                                                          |
| -------------- | ------------------ | -------------------------------------------------------------------- |
| `Point`        | `x`, `y` (private) | `getX/setX`, `getY/setY`, `distance(Point)`, `toString()`            |
| `MovablePoint` | `xSpeed`, `ySpeed` | `getXSpeed/setXSpeed`, `getYSpeed/setYSpeed`, `move()`, `toString()` |

### Sample Output

```
Initial:       Position: (0, 0)  Speed: (2, 3)
After move #1: Position: (2, 3)  Speed: (2, 3)
After move #2: Position: (4, 6)  Speed: (2, 3)
```

---

## Problem 3 & 4 — Abstract Classes + Interfaces

> See [`Problem 3-4/README.md`](Problem%203-4/README.md) for full details.

### Class / Interface Hierarchy

```
«interface» Scalable
      ▲
Shape (abstract — implements Scalable)
├── Circle               scale(): radius *= factor
├── Ellipse              scale(): a *= factor, b *= factor
└── Triangle             scale(): all sides *= factor
    └── EquilateralTriangle
```

| Shape               | Formula — Area  | Formula — Perimeter        |
| ------------------- | --------------- | -------------------------- |
| Circle              | π · r²          | 2π · r                     |
| Ellipse             | π · a · b       | π · √(2(a²+b²) − (a−b)²/2) |
| Triangle            | Heron's formula | a + b + c                  |
| EquilateralTriangle | (√3/4) · s²     | 3 · s                      |

> **Triangle guard:** If the sides fail the triangle inequality the constructor prints an error and calls `System.exit(1)`.

A static `scaleAll(Scalable[], double)` helper in `DemoP4` applies a scale factor to any array of `Scalable` objects.

### Sample Output (DemoP4)

```
--- Before Scaling ---
Circle               | Area:    78.5398 | Perimeter:    31.4159
Ellipse              | Area:    75.3982 | Perimeter:    31.7285
Triangle             | Area:     6.0000 | Perimeter:    12.0000
EquilateralTriangle  | Area:    15.5885 | Perimeter:    18.0000

--- After Scaling by factor 2.0 ---
Circle               | Area:   314.1593 | Perimeter:    62.8319
```

---

## How to Compile & Run

Source files live directly in their package directories. Compile from the **`QAP 3/`** root:

```bash
# Problem 1
javac problem1/*.java
java -cp . problem1.DemoP1

# Problem 2
javac problem2/*.java
java -cp . problem2.DemoP2

# Problem 3-4
javac problem34/*.java
java -cp . problem34.DemoP3   # polymorphic shape array (exits after invalid triangle test)
java -cp . problem34.DemoP4   # scaleAll() Scalable interface demo
```

> Requires **Java 8** or newer.

---

_Keyin College of Arts, Technology & Business — Software Developer Program_
