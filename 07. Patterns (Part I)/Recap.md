# Patterns in Java - Learning Recap

## Overview

This module introduces pattern printing in Java using nested loops. Patterns are visual representations created by systematically printing characters or numbers in specific arrangements. Understanding patterns helps develop logic for nested loops and provides a foundation for more complex data structure visualizations.

## Key Topics Learned

### 1. Star Pattern (Right Triangle)

Creates a right-angled triangle pattern using asterisks:

```text
*
* *
* * *
* * * *
* * * * *
```

**Code Implementation:**

```java
for (int line = 1; line <= n; line++) {
    for (int star = 1; star <= line; star++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Logic:**

- **Outer loop** (`line`): Controls number of rows (1 to n)
- **Inner loop** (`star`): Controls number of stars in each row (1 to current line number)
- **Pattern**: Each row contains as many stars as the row number

### 2. Inverted Star Pattern (Reverse Right Triangle)

Creates an inverted right triangle pattern:

```text
* * * * *
* * * *
* * *
* *
*
```

**Code Implementation:**

```java
for (int line = 1; line <= n; line++) {
    for (int star = 1; star <= n - line + 1; star++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

**Logic:**

- **Outer loop** (`line`): Controls rows (1 to n)
- **Inner loop** (`star`): Prints stars from 1 to (n - line + 1)
- **Pattern**: Each row has decreasing number of stars

### 3. Half-Pyramid Pattern (Number Triangle)

Creates a triangle pattern using incrementing numbers:

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

**Code Implementation:**

```java
for (int line = 1; line <= n; line++) {
    for (int number = 1; number <= line; number++) {
        System.out.print(number + " ");
    }
    System.out.println();
}
```

**Logic:**

- **Outer loop** (`line`): Controls rows (1 to n)
- **Inner loop** (`number`): Prints numbers from 1 to current line number
- **Pattern**: Each row displays consecutive numbers starting from 1

### 4. Inverted Half-Pyramid Pattern (Reverse Number Triangle)

Creates an inverted triangle with decrementing numbers:

```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

**Code Implementation:**

```java
for (int line = 1; line <= n; line++) {
    for (int number = 1; number <= n - line + 1; number++) {
        System.out.print(number + " ");
    }
    System.out.println();
}
```

**Logic:**

- **Outer loop** (`line`): Controls rows (1 to n)
- **Inner loop** (`number`): Prints numbers from 1 to (n - line + 1)
- **Pattern**: Each row has decreasing consecutive numbers

### 5. Character Pattern (Alphabet Triangle)

Creates a triangle pattern using alphabet letters:

```text
A
B C
D E F
G H I J
K L M N O
```

**Code Implementation:**

```java
char ch = 'A';
for (int line = 1; line <= n; line++) {
    for (int character = 1; character <= line; character++) {
        System.out.print(ch + " ");
        ch++;
    }
    System.out.println();
}
```

**Logic:**

- **Character initialization**: Start with 'A'
- **Outer loop** (`line`): Controls rows (1 to n)
- **Inner loop** (`character`): Prints characters for current row
- **Character increment**: Each printed character moves to next letter

## Pattern Analysis and Variations

### Pattern Characteristics

| Pattern               | Shape                   | Row Count  | Stars/Numbers per Row |
| --------------------- | ----------------------- | ---------- | --------------------- |
| Star                  | Right Triangle          | Increasing | 1 to n                |
| Inverted Star         | Reverse Triangle        | Decreasing | n to 1                |
| Half-Pyramid          | Number Triangle         | Increasing | 1 to n                |
| Inverted Half-Pyramid | Reverse Number Triangle | Decreasing | n to 1                |
| Character             | Letter Triangle         | Increasing | 1 to n                |

### Common Pattern Logic

#### Increasing Patterns (Type 1)

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* "); // or numbers or characters
    }
    System.out.println();
}
```

#### Decreasing Patterns (Type 2)

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* "); // or numbers or characters
    }
    System.out.println();
}
```

## Advanced Pattern Concepts

### 1. Pattern Symmetry

```java
// Diamond Pattern (combines increasing and decreasing)
for (int i = 1; i <= n; i++) {
    // Print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    // Print stars
    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

### 2. Hollow Patterns

```java
// Hollow Square Pattern
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
```

### 3. Number Patterns with Logic

```java
// Binary Triangle Pattern
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
    }
    System.out.println();
}
```

## Pattern Design Principles

### 1. Identify Pattern Type

- **Rectangular**: Same number of elements in each row
- **Triangular**: Increasing or decreasing elements per row
- **Pyramidal**: Centered patterns with spaces

### 2. Determine Loop Structure

- **Outer loop**: Usually controls rows/lines
- **Inner loop(s)**: Control elements within each row
- **Additional loops**: For spaces, borders, or complex patterns

### 3. Element Calculation

- **Row number**: Current iteration of outer loop
- **Element count**: Depends on pattern type and position
- **Element value**: May be constant, incremental, or calculated

## Common Pattern Algorithms

### 1. Space Management

```java
// Right-aligned triangle
for (int i = 1; i <= n; i++) {
    // Print spaces
    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    // Print stars
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 2. Border Patterns

```java
// Hollow triangle
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        if (j == 1 || j == i || i == n) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
```

### 3. Floyd's Triangle (Number Pattern)

```java
int num = 1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}
```

## Best Practices for Pattern Printing

### 1. Use Descriptive Variable Names

```java
// Good
for (int row = 1; row <= n; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print("* ");
    }
    System.out.println();
}

// Avoid
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 2. Separate Pattern Logic

```java
// Create methods for different patterns
public static void printStarTriangle(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
```

### 3. Handle Edge Cases

```java
// Validate input
if (n <= 0) {
    System.out.println("Invalid input");
    return;
}

// Handle n = 1 case
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

## Pattern Complexity Levels

### Level 1: Basic Patterns

- Simple star and number triangles
- Single nested loop patterns
- Basic increasing/decreasing sequences

### Level 2: Intermediate Patterns

- Space-aligned patterns
- Hollow patterns
- Multiple character patterns
- Binary and special number patterns

### Level 3: Advanced Patterns

- Diamond patterns
- Spiral patterns
- Custom character patterns
- Complex nested logic patterns

## Common Pattern Variations

### 1. Square Patterns

```java
// Solid square
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 2. Rectangle Patterns

```java
// Rectangle with different row and column counts
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 3. Checkerboard Patterns

```java
// Alternating pattern
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        if ((i + j) % 2 == 0) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
```

## Debugging Pattern Issues

### 1. Off-by-One Errors

```java
// Wrong - prints n+1 rows
for (int i = 1; i <= n; i++) // Should be i < n or i <= n-1

// Correct
for (int i = 0; i < n; i++) // 0-based indexing
```

### 2. Spacing Issues

```java
// Inconsistent spacing
System.out.print("*");  // No space
System.out.print("* ");  // With space

// Consistent approach
System.out.print("* ");  // Always use space after element
```

### 3. Loop Variable Conflicts

```java
// Wrong - variable name conflict
for (int i = 1; i <= n; i++) {
    for (int i = 1; i <= i; i++) { // Inner i shadows outer i
        System.out.print("* ");
    }
}

// Correct - use different variable names
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
}
```

## Performance Considerations

### 1. Loop Efficiency

```java
// Less efficient - calculates n-i+1 in every inner loop iteration
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n - i + 1; j++) {
        // n-i+1 calculated every time
    }
}

// More efficient - pre-calculate if possible
for (int i = 1; i <= n; i++) {
    int stars = n - i + 1;
    for (int j = 1; j <= stars; j++) {
        // use pre-calculated value
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

- Progress bars
- Chart visualization
- Game boards
- ASCII art

### 2. Algorithm Learning

- Understanding nested loops
- Loop optimization techniques
- Debugging complex iterations

### 3. Interview Preparation

- Common programming interview questions
- Logic building exercises
- Code optimization problems

## Summary

Pattern printing is an excellent way to practice nested loops and understand algorithmic thinking. The patterns covered in this module provide a foundation for:

- **Nested loop control** and variable management
- **Pattern recognition** and logic development
- **Code optimization** techniques
- **Debugging skills** for complex iterations

Key takeaways:

- **Identify pattern structure** before coding
- **Use appropriate loop variables** and scope
- **Handle spacing and alignment** carefully
- **Consider edge cases** and input validation
- **Practice different pattern types** to build logic skills

Mastering these fundamental patterns prepares you for more complex pattern variations and advanced algorithmic problems.
