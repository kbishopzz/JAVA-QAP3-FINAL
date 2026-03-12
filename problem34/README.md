# Problem 3 & 4 — Abstract Classes & Interfaces: Shapes

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Topic](https://img.shields.io/badge/Topic-Abstract%20Classes-blue?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Interfaces-purple?style=for-the-badge)
![Package](https://img.shields.io/badge/Package-problem34-9cf?style=for-the-badge)

---

## What These Problems Are About

**Problem 3** builds a shape hierarchy using an **abstract class**.
Every shape shares a name, area, and perimeter — but each computes them
differently. The abstract `Shape` class defines the contract; subclasses
implement it.

**Problem 4** adds the `Scalable` interface to the same hierarchy.
`Shape` implements `Scalable` (without providing `scale()` — since it's
abstract), and each concrete shape overrides `scale()` to resize its
own instance variables. A static `scaleAll()` method demonstrates
working with an array of the interface type.

---

## Class Hierarchy

```
«interface»
Scalable
  └── void scale(double factor)
        ▲
Shape  (abstract)  ← implements Scalable
├── Circle
├── Ellipse
└── Triangle
    └── EquilateralTriangle
```

---

## Files in This Folder

| File                       | Role                                                        |
| -------------------------- | ----------------------------------------------------------- |
| `Scalable.java`            | Interface — defines `scale(double)`                         |
| `Shape.java`               | Abstract base class — name, area(), perimeter(), toString() |
| `Circle.java`              | Extends Shape — radius, π·r² formula                        |
| `Ellipse.java`             | Extends Shape — major/minor axes, Ramanujan perimeter       |
| `Triangle.java`            | Extends Shape — Heron's area, triangle inequality guard     |
| `EquilateralTriangle.java` | Extends Triangle — exact area formula (√3/4)·s²             |
| `DemoP3.java`              | Problem 3 main — Shape array + polymorphic toString         |
| `DemoP4.java`              | Problem 4 main — scaleAll() static method, before/after     |

> All files belong to the `problem34` package.

---

## Shape Formulas

| Shape               | Area            | Perimeter                  |
| ------------------- | --------------- | -------------------------- |
| Circle              | π · r²          | 2π · r                     |
| Ellipse             | π · a · b       | π · √(2(a²+b²) − (a−b)²/2) |
| Triangle            | Heron's formula | a + b + c                  |
| EquilateralTriangle | (√3 / 4) · s²   | 3 · s                      |

---

## How to Compile & Run

Commands are run from the **QAP 3 root folder** (one level above this folder):

```bash
# Compile all files in this folder
javac problem34/*.java

# Run Problem 3 demo
java -cp . problem34.DemoP3

# Run Problem 4 demo
java -cp . problem34.DemoP4
```

> **Note:** `DemoP3` intentionally exits after testing an invalid triangle
> (`Triangle(1, 2, 10)`). This is expected behaviour — the program guards
> against impossible shapes.

### Expected Output — Problem 3 (excerpt)

```
Circle               | Area:    78.5398 | Perimeter:    31.4159  [radius=5.0000]
Ellipse              | Area:    75.3982 | Perimeter:    31.7285  [a=6.0000, b=4.0000]
Triangle             | Area:     6.0000 | Perimeter:    12.0000  [sides=3.0000, 4.0000, 5.0000]
EquilateralTriangle  | Area:    15.5885 | Perimeter:    18.0000  [sides=6.0000, 6.0000, 6.0000]
```

### Expected Output — Problem 4 (excerpt)

```
--- Before Scaling ---
Circle   | Area:    78.5398 | Perimeter:   31.4159  [radius=5.0000]

--- After Scaling by factor 2.0 ---
Circle   | Area:   314.1593 | Perimeter:   62.8319  [radius=10.0000]
```

---

## Key Design Notes

- `Shape` is `abstract` and cannot be instantiated directly.
- `Shape` declares `implements Scalable` but leaves `scale()` abstract (subclasses must implement it).
- `DemoP4.scaleAll()` accepts a `Scalable[]` — it works with any scalable object, not just shapes.
- The triangle inequality check uses `System.exit(1)` as required by the assignment spec.

---

_QAP 3 — Advanced Programming (Java) | Keyin College, Winter 2026_
