# Advanced Patterns in Java - Learning Recap

## Overview

This module covers advanced pattern printing techniques in Java, building upon basic patterns with more complex designs including hollow patterns, rotated patterns, and symmetrical designs. These patterns require understanding of nested loops, space management, and conditional logic for creating visually appealing and mathematically precise designs.

## Key Topics Learned

### 1. Hollow Rectangle Pattern

Creates a rectangle with only the boundary filled:

```text
* * * * *
*       *
*       *
* * * * *
```

**Logic:** Print stars only when on boundary (first/last row or first/last column).

```java
public static void hollow_rectangle(int totalRows, int totalCols) {
    for (int i = 1; i <= totalRows; i++) {
        for (int j = 1; j <= totalCols; j++) {
            if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
```

**Dry Run Example (4×5):**

- Row 1: All 5 stars (boundary)
- Row 2: Star + 3 spaces + Star
- Row 3: Star + 3 spaces + Star
- Row 4: All 5 stars (boundary)

### 2. Inverted and Rotated Half-Pyramid

Creates a right-angled triangle rotated 90 degrees:

```text
      *
    * *
  * * *
* * * *
```

**Logic:** Print spaces first (decreasing), then stars (increasing).

```java
public static void inverted_and_rotated_half_pyramid(int n) {
    int spaces = n - 1;
    int stars = 1;

    for (int line = 1; line <= n; line++) {
        // Print spaces
        for (int i = 1; i <= spaces; i++) {
            System.out.print("  ");
        }
        // Print stars
        for (int i = 1; i <= stars; i++) {
            System.out.print("* ");
        }
        spaces--;
        stars++;
        System.out.println();
    }
}
```

**Dry Run Example (n=4):**

- Line 1: 3 spaces + 1 star
- Line 2: 2 spaces + 2 stars
- Line 3: 1 space + 3 stars
- Line 4: 0 spaces + 4 stars

### 3. Inverted Half-Pyramid with Numbers

Creates a reverse triangle with decrementing numbers:

```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

**Logic:** For each row, print numbers from 1 to (n - line + 1).

```java
public static void inverted_half_pyramid(int n) {
    for (int line = 1; line <= n; line++) {
        for (int num = 1; num <= n - line + 1; num++) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=5):**

- Line 1: Numbers 1 to 5
- Line 2: Numbers 1 to 4
- Line 3: Numbers 1 to 3
- Line 4: Numbers 1 to 2
- Line 5: Number 1

### 4. Floyd's Triangle

Creates a triangle with sequential numbers:

```text
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

**Logic:** Use a counter that increments with each number printed.

```java
public static void floyds_triangle(int n) {
    int counter = 1;

    for (int line = 1; line <= n; line++) {
        for (int num = 1; num <= line; num++) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=5):**

- Line 1: Counter 1 → Print 1, counter = 2
- Line 2: Counter 2,3 → Print 2 3, counter = 4
- Line 3: Counter 4,5,6 → Print 4 5 6, counter = 7
- Line 4: Counter 7,8,9,10 → Print 7 8 9 10, counter = 11
- Line 5: Counter 11,12,13,14,15 → Print 11 12 13 14 15

### 5. Zero-One Triangle (Binary Triangle)

Creates a triangle with alternating 0s and 1s:

```text
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

**Logic:** For each row, alternate between 0 and 1 based on position.

```java
public static void zero_one_triangle(int n) {
    for (int i = 1; i <= n; i++) {
        int binaryNum = i % 2 == 0 ? 0 : 1;
        for (int j = 1; j <= i; j++) {
            System.out.print(binaryNum + " ");
            binaryNum = binaryNum == 0 ? 1 : 0;
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=5):**

- Row 1: Start with 1, print 1
- Row 2: Start with 0, alternate: 0 1
- Row 3: Start with 1, alternate: 1 0 1
- Row 4: Start with 0, alternate: 0 1 0 1
- Row 5: Start with 1, alternate: 1 0 1 0 1

### 6. Butterfly Pattern

Creates a symmetrical butterfly shape:

```text
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
```

**Logic:** Two mirrored triangles with spaces in between.

```java
public static void butterfly_pattern(int n) {
    // Upper half
    for (int i = 1; i <= n; i++) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        // Middle spaces
        for (int k = 1; k <= 2 * (n - i); k++) {
            System.out.print("  ");
        }
        // Right stars
        for (int l = 1; l <= i; l++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Lower half (mirror of upper)
    for (int i = n; i >= 1; i--) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        // Middle spaces
        for (int k = 1; k <= 2 * (n - i); k++) {
            System.out.print("  ");
        }
        // Right stars
        for (int l = 1; l <= i; l++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=4):**

- Upper half: Increasing stars with decreasing spaces
- Middle line: Full width (8 stars for n=4)
- Lower half: Decreasing stars with increasing spaces

### 7. Solid Rhombus

Creates a diamond-like shape filled with stars:

```text
        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *
```

**Logic:** Print spaces first (decreasing), then fixed number of stars.

```java
public static void solid_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Print stars
        for (int k = 1; k <= n; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=5):**

- Row 1: 4 spaces + 5 stars
- Row 2: 3 spaces + 5 stars
- Row 3: 2 spaces + 5 stars
- Row 4: 1 space + 5 stars
- Row 5: 0 spaces + 5 stars

### 8. Hollow Rhombus

Creates a rhombus with only boundary filled:

```text
        * * * * *
      *       *
    *       *
  *       *
* * * * *
```

**Logic:** Combine solid rhombus logic with hollow rectangle boundary conditions.

```java
public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Print stars with hollow logic
        for (int k = 1; k <= n; k++) {
            if (i == 1 || i == n || k == 1 || k == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=5):**

- Row 1: 4 spaces + 5 boundary stars
- Row 2: 3 spaces + star + 3 spaces + star
- Row 3: 2 spaces + star + 3 spaces + star
- Row 4: 1 space + star + 3 spaces + star
- Row 5: 0 spaces + 5 boundary stars

### 9. Diamond Pattern

Creates a full diamond shape:

```text
      *
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      *
```

**Logic:** Upper triangle (increasing) + lower triangle (decreasing).

```java
public static void diamond_pattern(int n) {
    // Upper half
    for (int i = 1; i <= n; i++) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Print stars (2*i - 1)
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Lower half
    for (int i = n; i >= 1; i--) {
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Print stars (2*i - 1)
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

**Dry Run Example (n=4):**

- Upper: 3 spaces + 1 star → 2 spaces + 3 stars → 1 space + 5 stars → 0 spaces + 7 stars
- Lower: Mirror of upper half

## Pattern Analysis and Classification

### Pattern Complexity Levels

#### Level 1: Basic Patterns (Previous Module)

- Simple triangles (increasing/decreasing)
- Basic number and character patterns
- Single nested loop logic

#### Level 2: Intermediate Patterns

- **Hollow patterns**: Boundary-only designs
- **Rotated patterns**: Space-aligned triangles
- **Number sequences**: Floyd's triangle, binary patterns

#### Level 3: Advanced Patterns

- **Symmetrical patterns**: Butterfly, diamond
- **Multi-section patterns**: Rhombus variations
- **Complex spacing**: Multiple space calculations

### Space Management Techniques

#### 1. Leading Spaces (Right Alignment)

```java
// General formula: spaces = n - current_row
for (int i = 1; i <= n; i++) {
    // Print (n - i) spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
    }
    // Print pattern elements
}
```

#### 2. Middle Spaces (Symmetrical Patterns)

```java
// General formula: spaces = 2 * (n - current_row)
for (int i = 1; i <= n; i++) {
    // Left elements
    // Middle spaces: 2 * (n - i)
    // Right elements (mirror of left)
}
```

#### 3. Dynamic Space Calculation

```java
// For complex patterns, calculate spaces based on multiple factors
int leadingSpaces = n - i;
int middleSpaces = 2 * (n - i);
int trailingSpaces = i - 1;
```

## Advanced Pattern Concepts

### 1. Pattern Symmetry

- **Vertical symmetry**: Top-bottom mirror
- **Horizontal symmetry**: Left-right mirror
- **Diagonal symmetry**: Corner-to-corner patterns

### 2. Boundary Conditions

- **Corner detection**: i==1 || i==n || j==1 || j==n
- **Edge detection**: First/last row or column
- **Center calculation**: Middle row/column identification

### 3. Mathematical Progressions

- **Arithmetic sequences**: 1, 2, 3, 4, 5...
- **Geometric sequences**: 1, 2, 4, 8, 16...
- **Binary alternations**: 0, 1, 0, 1, 0, 1...

## Common Pattern Algorithms

### 1. Hollow Pattern Logic

```java
// General hollow pattern structure
if (i == 1 || i == n || j == 1 || j == n) {
    // Print boundary element
} else {
    // Print space or inner element
}
```

### 2. Symmetrical Pattern Construction

```java
// Upper half (increasing)
for (int i = 1; i <= n; i++) {
    // Pattern logic
}

// Lower half (decreasing/mirror)
for (int i = n; i >= 1; i--) {
    // Mirror pattern logic
}
```

### 3. Space-Star Relationship

```java
// In many patterns: spaces + stars = constant
// Example: In rotated pyramid
// spaces = n - i
// stars = i
// Total width = n (constant)
```

## Best Practices for Advanced Patterns

### 1. Variable Naming Convention

```java
// Use descriptive names
for (int row = 1; row <= n; row++) {
    for (int col = 1; col <= n; col++) {
        // Clear indication of purpose
    }
}

// Avoid single letters when possible
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        // Less clear purpose
    }
}
```

### 2. Method Organization

```java
// Separate concerns
public static void printSpaces(int count) {
    for (int i = 1; i <= count; i++) {
        System.out.print("  ");
    }
}

public static void printStars(int count) {
    for (int i = 1; i <= count; i++) {
        System.out.print("* ");
    }
}
```

### 3. Parameter Validation

```java
// Validate input parameters
public static void diamond_pattern(int n) {
    if (n <= 0) {
        System.out.println("Invalid input");
        return;
    }
    // Pattern logic
}
```

## Pattern Design Strategies

### 1. Top-Down Approach

- Start with overall shape
- Break into upper and lower halves
- Implement each section separately

### 2. Boundary-First Method

- Implement boundary/outline first
- Fill interior based on requirements
- Add special conditions for hollow patterns

### 3. Mathematical Modeling

- Identify mathematical relationships
- Use formulas for spaces, stars, numbers
- Verify with small test cases

## Common Pattern Variations

### 1. Number Patterns

```java
// Square number pattern
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        System.out.print((i + j - 1) + " ");
    }
    System.out.println();
}
```

### 2. Character Patterns

```java
// Alphabet diamond
char ch = 'A';
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
    }
    for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(ch + " ");
        ch++;
    }
    System.out.println();
}
```

### 3. Custom Symbol Patterns

```java
// Using different symbols
String[] symbols = {"*", "+", "-", "="};
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(symbols[(i + j) % 4] + " ");
    }
    System.out.println();
}
```

## Debugging Pattern Issues

### 1. Space Alignment Problems

```java
// Wrong - inconsistent spacing
System.out.print("*");  // No space
System.out.print("* ");  // With space

// Correct - consistent spacing
System.out.print("* ");  // Always use space
```

### 2. Loop Boundary Errors

```java
// Wrong - off by one
for (int i = 1; i < n; i++) { // Missing last iteration

// Correct
for (int i = 1; i <= n; i++) { // Includes all iterations
```

### 3. Variable Scope Conflicts

```java
// Wrong - variable name conflict
for (int i = 1; i <= n; i++) {
    for (int i = 1; i <= i; i++) { // Inner i shadows outer i
        // Logic error
    }
}

// Correct - different variable names
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        // Clear logic
    }
}
```

## Performance Considerations

### 1. Loop Optimization

```java
// Less efficient - calculates n-i in every inner loop
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i; j++) {
        // n-i calculated each time
    }
}

// More efficient - pre-calculate
for (int i = 1; i <= n; i++) {
    int spaces = n - i;
    for (int j = 1; j <= spaces; j++) {
        // Use pre-calculated value
    }
}
```

### 2. String Building for Large Patterns

```java
// For very large patterns, use StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        sb.append("* ");
    }
    sb.append("\n");
}
System.out.print(sb.toString());
```

## Pattern Applications

### 1. Visual Data Representation

- **Progress indicators**: Loading bars, completion status
- **Chart elements**: Simple graphs, histograms
- **Game boards**: Chess boards, tic-tac-toe grids
- **ASCII art**: Text-based graphics and logos

### 2. Algorithm Learning

- **Nested loop mastery**: Complex iteration control
- **Mathematical thinking**: Pattern recognition and formulas
- **Debugging skills**: Visual verification of logic
- **Optimization techniques**: Efficient space and time usage

### 3. Interview Preparation

- **Logic building**: Problem decomposition skills
- **Code optimization**: Efficient solution design
- **Pattern recognition**: Common algorithmic patterns
- **Clean code**: Readable and maintainable solutions

## Summary

Advanced pattern printing builds upon basic patterns by introducing:

- **Complex space management** for alignment and symmetry
- **Boundary condition logic** for hollow and filled patterns
- **Mathematical progressions** for number and character sequences
- **Multi-section construction** for symmetrical designs
- **Performance optimization** techniques for large patterns

Key takeaways:

- **Master space calculation** formulas for alignment
- **Understand symmetry** principles for complex patterns
- **Use boundary conditions** effectively for hollow designs
- **Apply mathematical thinking** to pattern construction
- **Consider performance** for large-scale patterns
- **Practice systematic debugging** for complex nested loops

These advanced patterns provide a strong foundation for understanding more complex data structures and algorithms, where similar principles of systematic construction and optimization apply.
