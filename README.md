# QAP 3 Java Project

![Java](https://img.shields.io/badge/Java-Project-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Course](https://img.shields.io/badge/Course-Advanced%20Programming-blue?style=flat-square)
![Semester](https://img.shields.io/badge/Semester-3-green?style=flat-square)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=flat-square)

## Project Overview

This repository contains my QAP 3 Java assignment for Advanced Programming.

The project covers:

- inheritance with `Person`, `Student`, `Teacher`, and `CollegeStudent`
- inheritance with `Point` and `MovablePoint`
- abstract classes and interfaces with shapes and `Scalable`
- simple `try-catch` handling in the demo programs and selected class methods

## Folder Summary

- `problem1` contains Problem 1 classes and demo
- `problem2` contains Problem 2 classes and demo
- `problem34` contains Problems 3 and 4 classes and demos
- `JOURNAL.md` contains the journal template for submission

## Main Classes

### Problem 1

- `Person`
- `Student`
- `Teacher`
- `CollegeStudent`
- `DemoP1`

### Problem 2

- `Point`
- `MovablePoint`
- `DemoP2`

### Problems 3 and 4

- `Shape`
- `Circle`
- `Ellipse`
- `Triangle`
- `EquilateralTriangle`
- `Scalable`
- `DemoP3`
- `DemoP4`

## How to Compile and Run

Run these commands from the project root folder:

```bash
javac problem1/*.java
java -cp . problem1.DemoP1

javac problem2/*.java
java -cp . problem2.DemoP2

javac problem34/*.java
java -cp . problem34.DemoP3
java -cp . problem34.DemoP4
```

## Notes for Instructor

- All Java files are organized by package folder.
- Demo files are included for each problem.
- The code was kept simple and readable.
- Basic `try-catch` blocks were added where they make sense for this assignment.
- `problem34` includes the abstract class and interface requirements.

## Environment

- Language: Java
- Project type: Console application
- Recommended: Java 8 or newer

This project was created for Semester 3 Advanced Programming.
