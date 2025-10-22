# Loops in Java - Learning Recap

## Overview

This module covered all types of loops in Java, which are fundamental control structures that allow repeated execution of code blocks. Loops help avoid code repetition and handle iterative tasks efficiently.

## Key Topics Learned

### 1. For Loop

Used when the number of iterations is known beforehand:

```java
for (initialization; condition; update) {
    // code to be executed
}
```

**Example:**

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```

**Components:**

- **Initialization**: Executed once at the beginning (`int i = 1`)
- **Condition**: Checked before each iteration (`i <= 5`)
- **Update**: Executed after each iteration (`i++`)
- **Body**: Code executed if condition is true

### 2. While Loop

Used when the number of iterations depends on a condition:

```java
while (condition) {
    // code to be executed
}
```

**Example:**

```java
int j = 1;
while (j <= 5) {
    System.out.println("Iteration: " + j);
    j++;
}
```

**Important Notes:**

- Condition is checked **before** each iteration
- Loop may not execute at all if condition is initially false
- Must ensure loop variable is updated to avoid infinite loops

### 3. Do-While Loop

Guarantees at least one execution before checking the condition:

```java
do {
    // code to be executed
} while (condition);
```

**Example:**

```java
int k = 1;
do {
    System.out.println("Iteration: " + k);
    k++;
} while (k <= 5);
```

**Key Difference:**

- **while loop**: Check condition → Execute (may not execute)
- **do-while loop**: Execute → Check condition (executes at least once)

## Loop Control Statements

### Break Statement

Exits the loop prematurely:

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // exits loop when i is 5
    }
    System.out.println(i);
}
// Output: 1 2 3 4
```

### Continue Statement

Skips current iteration and moves to next:

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // skips even numbers
    }
    System.out.println(i);
}
// Output: 1 3 5 7 9
```

## Practical Applications and Examples

### 1. Sum of Even and Odd Numbers

```java
Scanner scanner = new Scanner(System.in);
int sumEven = 0, sumOdd = 0;

while (true) {
    String input = scanner.nextLine();
    if (input.equalsIgnoreCase("exit")) {
        break;
    }

    if (input.matches("-?\\d+")) {
        int number = Integer.parseInt(input);
        if (number % 2 == 0) {
            sumEven += number;
        } else {
            sumOdd += number;
        }
    }
}
```

### 2. Factorial Calculation

```java
long factorial = 1;
for (int i = 1; i <= num; i++) {
    factorial *= i;
}
```

### 3. Multiplication Table

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
}
```

### 4. Sum of First N Natural Numbers

```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

### 5. Number Reversal

```java
int reversedNumber = 0;
while (number > 0) {
    int lastDigit = number % 10;
    reversedNumber = reversedNumber * 10 + lastDigit;
    number /= 10;
}
```

### 6. Prime Number Check (Optimized)

```java
boolean isPrime = true;
for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
        isPrime = false;
        break;
    }
}
```

### 7. Pattern Printing (Square)

```java
for (int line = 1; line <= n; line++) {
    for (int star = 1; star <= n; star++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

## Variable Scope in Loops

### Local Variables

- Variables declared inside loops are **local** to that loop
- Cannot be accessed outside the loop block

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i); // i is accessible here
}
// System.out.println(i); // ERROR: i is not defined here
```

### Block Scope

- Variables declared in a block are only accessible within that block
- Helps prevent variable name conflicts and improves code organization

## Infinite Loops

### Causes and Prevention

```java
// Infinite loop - condition never becomes false
while (true) {
    // code that runs forever
}

// Prevention: Ensure loop variable is updated
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++; // This ensures condition will eventually be false
}
```

### Common Infinite Loop Scenarios

1. **Missing increment**: `for (int i = 1; i <= 10; )`
2. **Wrong condition**: `while (i > 0)` when i is always positive
3. **Break condition never met**: `while (x != 0)` when x never changes

## Best Practices

### 1. Choose the Right Loop Type

- **For loop**: Known number of iterations
- **While loop**: Condition-based iterations
- **Do-while loop**: At least one execution required

### 2. Initialize Loop Variables Properly

```java
// Good
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}

// Avoid - using uninitialized variables
int sum; // Not initialized
for (int i = 1; i <= n; i++) {
    sum += i; // Unpredictable behavior
}
```

### 3. Use Meaningful Variable Names

```java
// Better readability
for (int studentCount = 1; studentCount <= numStudents; studentCount++) {
    // process student
}

// Avoid single letters (except in simple cases)
for (int i = 1; i <= 10; i++) {
    // acceptable for simple loops
}
```

### 4. Limit Loop Scope

```java
// Declare variables in smallest scope possible
if (condition) {
    int temp = calculateValue();
    for (int i = 0; i < temp; i++) {
        // use i and temp
    }
    // temp and i not accessible here
}
```

## Performance Optimizations

### 1. Prime Number Check Optimization

```java
// Inefficient - checks up to n-1
for (int i = 2; i < n; i++) {
    if (n % i == 0) return false;
}

// Optimized - checks up to √n
for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) return false;
}
```

### 2. Minimize Operations Inside Loops

```java
// Less efficient
for (int i = 0; i < array.length; i++) {
    result += array[i] * array[i]; // multiplication in every iteration
}

// More efficient
int length = array.length;
for (int i = 0; i < length; i++) {
    result += array[i] * array[i];
}
```

## Common Patterns

### 1. Input Until Condition

```java
Scanner scanner = new Scanner(System.in);
while (true) {
    System.out.print("Enter number (0 to stop): ");
    int num = scanner.nextInt();
    if (num == 0) {
        break;
    }
    System.out.println("You entered: " + num);
}
```

### 2. Nested Loops for Patterns

```java
// Triangle pattern
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### 3. Loop with Multiple Conditions

```java
// Process until condition or limit reached
int count = 0;
while (count < 100 && !isFinished()) {
    processData();
    count++;
}
```

## Common Pitfalls

### 1. Off-by-One Errors

```java
// Wrong - loops 0 to 9 (10 times) instead of 1 to 10
for (int i = 0; i < 10; i++) {
    System.out.println(i + 1);
}

// Correct
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### 2. Infinite Loops

```java
// Wrong - missing increment
int i = 1;
while (i <= 10) {
    System.out.println(i);
    // i is never incremented!
}

// Wrong - condition always true
boolean flag = true;
while (flag) {
    // flag never changes!
}
```

### 3. Variable Scope Issues

```java
// Wrong - i not accessible outside loop
for (int i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
System.out.println("Final value: " + i); // ERROR

// Correct - declare outside if needed
int i;
for (i = 1; i <= 5; i++) {
    System.out.print(i + " ");
}
System.out.println("Final value: " + i);
```

### 4. Floating Point Loop Variables

```java
// Unreliable due to precision issues
for (double d = 0.0; d <= 1.0; d += 0.1) {
    System.out.println(d);
}

// Better - use integer counter
for (int i = 0; i <= 10; i++) {
    double d = i / 10.0;
    System.out.println(d);
}
```

## Advanced Loop Techniques

### 1. Labeled Breaks and Continues

```java
outerLoop:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
            break outerLoop; // breaks outer loop
        }
        System.out.println(i + " " + j);
    }
}
```

### 2. Loop with Collections

```java
// Enhanced for loop (for-each)
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println("Hello " + name);
}

// Traditional for loop for index access
for (int i = 0; i < names.length; i++) {
    System.out.println("Index " + i + ": " + names[i]);
}
```

### 3. Loop with Conditional Logic

```java
// Find first multiple of 7 in range
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        System.out.println("First multiple of 7: " + i);
        break;
    }
}
```

## Summary

Loops are essential for repetitive tasks and form the backbone of algorithmic problem-solving. Understanding the differences between loop types, proper variable scoping, and optimization techniques is crucial for writing efficient and bug-free code.

Key takeaways:

- **Choose appropriate loop type** based on requirements
- **Ensure termination conditions** to prevent infinite loops
- **Use break and continue judiciously** for control flow
- **Be mindful of variable scope** and initialization
- **Optimize loops** for better performance, especially for large datasets
- **Test edge cases** like empty ranges, negative numbers, and boundary conditions

Mastering loops provides the foundation for more complex programming concepts like arrays, collections, and algorithm implementation.
