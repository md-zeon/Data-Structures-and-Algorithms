# Functions and Methods in Java - Learning Recap

## Overview

This module covered the fundamentals of functions and methods in Java, including method definition, parameter passing, return types, function overloading, variable scope, and practical applications. Functions/methods are essential for code organization, reusability, and modular programming.

## Key Topics Learned

### 1. Method Definition and Syntax

#### Basic Method Structure

```java
accessModifier static/nonStatic returnType methodName(parameterType parameterName) {
    // method body
    return value; // if returnType is not void
}
```

**Example:**

```java
public static int add(int a, int b) {
    return a + b;
}
```

#### Method Components

- **Access Modifier**: `public`, `private`, `protected`, or default
- **Static/Non-static**: Static methods belong to class, non-static to objects
- **Return Type**: Data type of value returned, or `void` if no return
- **Method Name**: Identifier following Java naming conventions
- **Parameters**: Input values (can be zero or more)
- **Method Body**: Code that executes when method is called

### 2. Method Types Based on Return Type

#### Void Methods (No Return Value)

```java
public static void printHello() {
    System.out.println("Hello, World!");
}

// Calling void method
printHello(); // No assignment needed
```

#### Non-Void Methods (Return Value)

```java
public static int calculateSum(int a, int b) {
    return a + b;
}

// Calling method with return value
int result = calculateSum(5, 10);
```

### 3. Parameter Passing

#### Pass by Value (Primitive Types)

```java
public static void modifyValue(int num) {
    num = num + 10; // Changes local copy only
}

int x = 5;
modifyValue(x); // x remains 5, not 15
```

#### Pass by Reference (Objects)

```java
public static void modifyObject(Person person) {
    person.name = "Modified"; // Changes original object
}

Person p = new Person("Original");
modifyObject(p); // p.name is now "Modified"
```

### 4. Function Overloading

#### Method Overloading Rules

- Same method name
- Different parameter list (type, number, or order)
- Return type can be same or different

```java
// Different parameter count
public static int sum(int a, int b) {
    return a + b;
}

public static int sum(int a, int b, int c) {
    return a + b + c;
}

// Different parameter types
public static double sum(double a, double b) {
    return a + b;
}

public static String sum(String a, String b) {
    return a + b;
}
```

### 5. Variable Scope

#### Local Variables

- Declared inside methods
- Only accessible within that method
- Memory allocated when method called, deallocated when method ends

```java
public static void example() {
    int localVar = 10; // Local scope
    System.out.println(localVar); // Accessible here
}
// System.out.println(localVar); // ERROR: Not accessible here
```

#### Instance Variables

- Declared in class (non-static)
- Accessible by all methods in the class
- Tied to specific object instance

#### Static Variables

- Declared in class with `static` keyword
- Shared among all instances of the class
- Accessible using class name

## Practical Applications and Examples

### 1. Basic Mathematical Operations

```java
// Method to calculate product
public static int multiply(int a, int b) {
    return a * b;
}

// Method to calculate factorial
public static int factorial(int n) {
    if (n < 0) {
        System.out.println("Invalid input");
        return -1;
    }

    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
```

### 2. Number System Conversions

#### Binary to Decimal

```java
public static void binaryToDecimal(int binaryNum) {
    int decimal = 0, pow = 0;

    while (binaryNum > 0) {
        int lastDigit = binaryNum % 10;
        decimal += lastDigit * (int) Math.pow(2, pow);
        pow++;
        binaryNum /= 10;
    }

    System.out.println("Decimal: " + decimal);
}
```

#### Decimal to Binary

```java
public static void decimalToBinary(int decimalNum) {
    int binary = 0, pow = 0;

    while (decimalNum > 0) {
        int remainder = decimalNum % 2;
        binary += remainder * (int) Math.pow(10, pow);
        pow++;
        decimalNum /= 2;
    }

    System.out.println("Binary: " + binary);
}
```

### 3. Prime Number Operations

#### Check Prime

```java
public static boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}
```

#### Print Primes in Range

```java
public static void printPrimesInRange(int start, int end) {
    for (int num = start; num <= end; num++) {
        if (isPrime(num)) {
            System.out.print(num + " ");
        }
    }
    System.out.println();
}
```

### 4. Number Analysis

#### Palindrome Check

```java
public static boolean isPalindrome(int num) {
    int original = num;
    int reversed = 0;

    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;
}
```

#### Sum of Digits

```java
public static int computeDigitSum(int num) {
    int sum = 0;
    while (num != 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
```

### 5. Statistical Operations

#### Average Calculation

```java
public static double computeAverage(double a, double b, double c) {
    return (a + b + c) / 3;
}
```

#### Even/Odd Check

```java
public static boolean isEven(int num) {
    return num % 2 == 0;
}
```

## Math Class Methods

### Commonly Used Math Methods

| Method            | Description         | Example                   |
| ----------------- | ------------------- | ------------------------- |
| `Math.abs(x)`     | Absolute value      | `Math.abs(-5)` → `5`      |
| `Math.ceil(x)`    | Round up            | `Math.ceil(4.3)` → `5.0`  |
| `Math.floor(x)`   | Round down          | `Math.floor(4.7)` → `4.0` |
| `Math.max(a,b)`   | Maximum value       | `Math.max(3,7)` → `7`     |
| `Math.min(a,b)`   | Minimum value       | `Math.min(3,7)` → `3`     |
| `Math.pow(a,b)`   | Power function      | `Math.pow(2,3)` → `8.0`   |
| `Math.sqrt(x)`    | Square root         | `Math.sqrt(16)` → `4.0`   |
| `Math.random()`   | Random number (0-1) | `Math.random()` → `0.123` |
| `Math.round(x)`   | Round to nearest    | `Math.round(4.6)` → `5`   |
| `Math.cbrt(x)`    | Cube root           | `Math.cbrt(27)` → `3.0`   |
| `Math.hypot(a,b)` | Hypotenuse          | `Math.hypot(3,4)` → `5.0` |

## Advanced Method Concepts

### 1. Method Overloading Examples

#### Arithmetic Operations

```java
public static int add(int a, int b) { return a + b; }
public static int add(int a, int b, int c) { return a + b + c; }
public static double add(double a, double b) { return a + b; }
public static String add(String a, String b) { return a + b; }
```

#### Print Methods

```java
public static void printValue(int a) {
    System.out.println("Integer: " + a);
}

public static void printValue(double a) {
    System.out.println("Double: " + a);
}

public static void printValue(String a) {
    System.out.println("String: " + a);
}
```

### 2. Recursive Methods

```java
public static int factorialRecursive(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * factorialRecursive(n - 1);
}
```

### 3. Method Chaining

```java
public static int add(int a, int b) {
    return a + b;
}

public static int multiply(int a, int b) {
    return a * b;
}

// Usage
int result = multiply(add(2, 3), add(4, 1)); // (2+3) * (4+1) = 25
```

## Memory Management in Methods

### Call Stack

1. **Method Call**: New stack frame created
2. **Parameter Passing**: Arguments copied to parameters
3. **Local Variables**: Memory allocated in stack frame
4. **Method Execution**: Code executes using local memory
5. **Return**: Stack frame destroyed, control returns to caller

### Memory Allocation Example

```java
public static int computeSum(int a, int b) {
    int localVar = a + b; // Local variable
    return localVar;
}

int x = 5, y = 10;
int result = computeSum(x, y);
// Memory: x=5, y=10, result=15
// Stack frame for computeSum destroyed after return
```

## Best Practices

### 1. Method Naming Conventions

```java
// Good - descriptive names
public static boolean isUserValid(String username) { }
public static double calculateTotalPrice(double price, double tax) { }

// Avoid - unclear names
public static boolean check(String s) { }
public static double calc(double p, double t) { }
```

### 2. Method Length and Complexity

```java
// Good - single responsibility
public static boolean isValidEmail(String email) {
    return email.contains("@") && email.contains(".");
}

public static void sendWelcomeEmail(String email) {
    // Send email logic
}

// Avoid - multiple responsibilities
public static void validateAndSendEmail(String email) {
    // Validation + sending logic mixed
}
```

### 3. Parameter Validation

```java
// Good - input validation
public static int factorial(int n) {
    if (n < 0) {
        System.out.println("Invalid input");
        return -1;
    }
    // Rest of logic
}

// Avoid - no validation
public static int divide(int a, int b) {
    return a / b; // May cause ArithmeticException
}
```

### 4. Return Value Handling

```java
// Good - handle all return paths
public static String getGrade(int marks) {
    if (marks >= 90) return "A";
    else if (marks >= 80) return "B";
    else if (marks >= 70) return "C";
    else if (marks >= 60) return "D";
    else return "F";
}

// Avoid - missing return statement
public static String getGrade(int marks) {
    if (marks >= 90) return "A";
    else if (marks >= 80) return "B";
    // Missing return for other cases
}
```

## Common Patterns

### 1. Utility Methods

```java
public static class MathUtils {
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
```

### 2. Validation Methods

```java
public static boolean isValidAge(int age) {
    return age >= 0 && age <= 150;
}

public static boolean isValidEmail(String email) {
    return email != null && email.contains("@");
}

public static boolean isStrongPassword(String password) {
    return password != null && password.length() >= 8;
}
```

### 3. Conversion Methods

```java
public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}

public static int feetToInches(int feet) {
    return feet * 12;
}

public static String numberToWords(int num) {
    // Complex conversion logic
    return words;
}
```

## Common Pitfalls

### 1. Variable Shadowing

```java
// Wrong - parameter shadows instance variable
public static void setValue(int value) {
    int value = 10; // This creates local variable
    // Original value parameter is shadowed
}

// Correct
public static void setValue(int value) {
    this.value = value; // Use this for instance variable
}
```

### 2. Side Effects in Methods

```java
// Avoid - modifies external state unexpectedly
public static int getSum(int a, int b) {
    globalCounter++; // Unexpected side effect
    return a + b;
}

// Better - make side effects explicit
public static int getSumAndIncrementCounter(int a, int b) {
    globalCounter++; // Explicit side effect
    return a + b;
}
```

### 3. Null Parameter Handling

```java
// Wrong - NullPointerException risk
public static int getLength(String str) {
    return str.length(); // Throws NPE if str is null
}

// Correct - null check
public static int getLength(String str) {
    if (str == null) return 0;
    return str.length();
}
```

### 4. Method Signature Confusion

```java
// Wrong - same signature, different return type
public static int add(int a, int b) { return a + b; }
public static double add(int a, int b) { return a + b; } // Compile error

// Correct - different parameter types
public static int add(int a, int b) { return a + b; }
public static double add(double a, double b) { return a + b; }
```

## Performance Considerations

### 1. Avoid Repeated Calculations

```java
// Less efficient - calculates Math.sqrt(n) multiple times
for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) return false;
}

// More efficient - calculate once
int sqrtN = (int) Math.sqrt(n);
for (int i = 2; i <= sqrtN; i++) {
    if (n % i == 0) return false;
}
```

### 2. Use Appropriate Data Types

```java
// For large numbers, use long instead of int
public static long factorial(int n) {
    long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
```

### 3. Minimize Object Creation in Loops

```java
// Less efficient - creates new object each iteration
for (int i = 0; i < 1000; i++) {
    StringBuilder sb = new StringBuilder(); // New object each time
    sb.append("Value: ").append(i);
}

// More efficient - reuse object
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.setLength(0); // Clear previous content
    sb.append("Value: ").append(i);
}
```

## Summary

Functions and methods are the building blocks of modular programming in Java. They enable:

- **Code reusability** - Write once, use multiple times
- **Code organization** - Break complex problems into smaller parts
- **Maintainability** - Easier to debug and modify individual components
- **Readability** - Self-documenting code with meaningful method names
- **Testing** - Individual methods can be tested in isolation

Key takeaways:

- **Choose descriptive names** for methods and parameters
- **Validate inputs** and handle edge cases
- **Use overloading** to provide multiple interfaces for similar operations
- **Understand scope** and avoid variable shadowing
- **Handle return values** appropriately
- **Consider performance** implications of method design
- **Follow single responsibility principle** - each method should do one thing well

Mastering methods is essential for writing clean, maintainable, and efficient Java code. They form the foundation for object-oriented programming concepts like encapsulation and polymorphism.
