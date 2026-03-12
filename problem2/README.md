# Problem 2 — Inheritance: Point & MovablePoint

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Topic](https://img.shields.io/badge/Topic-Inheritance-blue?style=for-the-badge)
![Package](https://img.shields.io/badge/Package-problem2-9cf?style=for-the-badge)

---

## What This Problem Is About

This problem extends a `Point` class with a `MovablePoint` subclass that adds
speed components and a `move()` method.

The key challenge is that `x` and `y` are **private** in `Point`. This means
`MovablePoint` cannot access them directly — it must use the inherited
`getX()` / `setX()` and `getY()` / `setY()` methods.

The exercise practices:

- Inheritance with private fields
- Calling `super()` constructors
- Using getters/setters from a parent class inside a subclass
- Method chaining (move returns `this`)
- Computing Euclidean distance

---

## Class Hierarchy

```
Point  (private x, y)
└── MovablePoint  (adds xSpeed, ySpeed + move())
```

---

## Files in This Folder

| File                | Role                                                      |
| ------------------- | --------------------------------------------------------- |
| `Point.java`        | Base class — private x/y, getters/setters, distance()     |
| `MovablePoint.java` | Extends Point — adds speed and move() method              |
| `DemoP2.java`       | Main class — tests construction, movement, and edge cases |

> All files belong to the `problem2` package.

---

## How to Compile & Run

Commands are run from the **QAP 3 root folder** (one level above this folder):

```bash
# Compile
javac problem2/*.java

# Run
java -cp . problem2.DemoP2
```

### Expected Output

```
=== Problem 2 — Point / MovablePoint ===

p1: (0, 0)
p2: (3, 4)
Distance p1 → p2: 5.0000
p1 after setX/setY: (1, 1)

--- MovablePoint ---
Initial:       Position: (0, 0)  Speed: (2, 3)
After move #1: Position: (2, 3)  Speed: (2, 3)
After move #2: Position: (4, 6)  Speed: (2, 3)
Speed changed: Position: (4, 6)  Speed: (-1, -2)
After move #3: Position: (3, 4)  Speed: (-1, -2)
```

---

## Key Design Notes

- `x` and `y` are `private` in `Point` — `MovablePoint.move()` uses `setX(getX() + xSpeed)` as required by the assignment hint.
- `move()` returns `this` so calls can be chained if needed.
- Passing `null` to `distance()` is caught gracefully with a printed error.

---

_QAP 3 — Advanced Programming (Java) | Keyin College, Winter 2026_
