# Conditional Statements in Java - Learning Recap

## Overview

This module covered all types of conditional statements in Java, which allow programs to make decisions and execute different code paths based on conditions. Conditional statements are fundamental to controlling program flow and implementing business logic.

## Key Topics Learned

### 1. If Statement

The basic conditional statement that executes code only if a condition is true:

```java
if (condition) {
    // code to be executed if condition is true
}
```

**Example:**

```java
int number = 10;
if (number > 0) {
    System.out.println("Number is positive");
}
```

### 2. If-Else Statement

Executes one block of code if condition is true, another if false:

```java
if (condition) {
    // code executed if condition is true
} else {
    // code executed if condition is false
}
```

**Example:**

```java
int number = -5;
if (number >= 0) {
    System.out.println(number + " is positive");
} else {
    System.out.println(number + " is negative");
}
```

### 3. Else-If Ladder (If-Else-If Chain)

Tests multiple conditions in sequence:

```java
if (condition1) {
    // code for condition1
} else if (condition2) {
    // code for condition2
} else if (condition3) {
    // code for condition3
} else {
    // code if none of the conditions are true
}
```

**Example - Grade Calculator:**

```java
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 75) {
    System.out.println("Grade: B");
} else if (marks >= 60) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

### 4. Switch Statement

Multi-way branch statement that tests a variable against multiple values:

```java
switch (variable) {
    case value1:
        // code to execute if variable == value1
        break;
    case value2:
        // code to execute if variable == value2
        break;
    case value3:
        // code to execute if variable == value3
        break;
    default:
        // code to execute if variable doesn't match any case
        break;
}
```

**Example - Day of Week:**

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Invalid day");
        break;
}
```

**Important Notes:**

- **break statement** is crucial - prevents fall-through to next cases
- **default case** is optional but recommended for handling unexpected values
- Works with `byte`, `short`, `int`, `char`, `String` (Java 7+), and `enum` types

### 5. Ternary Operator (Conditional Expression)

Compact alternative to if-else statement:

```java
variable = (condition) ? value_if_true : value_if_false;
```

**Example:**

```java
int age = 20;
String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
System.out.println(eligibility);
```

## Practical Applications and Examples

### 1. Number Classification

```java
// Positive/Negative check
int number = -10;
if (number >= 0) {
    System.out.println("Positive");
} else {
    System.out.println("Negative");
}

// Even/Odd check
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### 2. Temperature Check

```java
double temperature = 103.5;
if (temperature > 100) {
    System.out.println("You have a fever");
} else {
    System.out.println("You don't have a fever");
}
```

### 3. Leap Year Calculation

```java
int year = 2020;
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " is a leap year");
} else {
    System.out.println(year + " is not a leap year");
}
```

**Leap Year Logic:**

- Divisible by 4 AND not divisible by 100, OR
- Divisible by 400

### 4. Traffic Light System

```java
String lightColor = "Yellow";
switch (lightColor) {
    case "Red":
        System.out.println("Stop");
        break;
    case "Yellow":
        System.out.println("Get Ready");
        break;
    case "Green":
        System.out.println("Go");
        break;
    default:
        System.out.println("Invalid color");
        break;
}
```

### 5. Complex Conditional Logic

```java
// Multiple conditions with logical operators
int age = 25;
boolean hasLicense = true;
boolean ownsCar = false;

if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
    if (ownsCar) {
        System.out.println("Can drive own car");
    } else {
        System.out.println("Needs to rent/borrow car");
    }
} else {
    System.out.println("Cannot drive legally");
}
```

## Nested Conditionals

### Nested If Statements

```java
int score = 85;
String grade;

if (score >= 60) {
    if (score >= 90) {
        grade = "A";
    } else if (score >= 80) {
        grade = "B";
    } else {
        grade = "C";
    }
} else {
    grade = "F";
}
```

### Switch in If-Else

```java
String choice = "menu";
if (choice.equals("menu")) {
    int option = 2;
    switch (option) {
        case 1:
            System.out.println("View profile");
            break;
        case 2:
            System.out.println("Settings");
            break;
        case 3:
            System.out.println("Logout");
            break;
        default:
            System.out.println("Invalid option");
            break;
    }
}
```

## Best Practices

### 1. Use Braces Even for Single Statements

```java
// Good practice
if (condition) {
    System.out.println("Single statement");
}

// Avoid (can lead to bugs)
if (condition)
    System.out.println("Single statement");
```

### 2. Keep Conditions Simple and Readable

```java
// Complex condition - hard to read
if (age >= 18 && hasLicense == true && !suspended && vehicleType.equals("car")) {
    // drive
}

// Better - break into variables or helper methods
boolean isAdult = age >= 18;
boolean isLicensed = hasLicense && !suspended;
boolean canDriveCar = isAdult && isLicensed && vehicleType.equals("car");

if (canDriveCar) {
    // drive
}
```

### 3. Use Switch for Multiple Related Conditions

```java
// Instead of multiple if-else
if (day == 1) {
    System.out.println("Monday");
} else if (day == 2) {
    System.out.println("Tuesday");
} // ... many more

// Use switch
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    // ...
}
```

### 4. Avoid Switch Fall-Through Bugs

```java
// Bug - missing break
switch (option) {
    case 1:
        System.out.println("Option 1");
    case 2:  // This will also execute after case 1
        System.out.println("Option 2");
        break;
}

// Correct
switch (option) {
    case 1:
        System.out.println("Option 1");
        break;
    case 2:
        System.out.println("Option 2");
        break;
}
```

## Common Pitfalls

### 1. Assignment vs Comparison

```java
// Wrong - assignment instead of comparison
if (x = 5) { }  // Always true, assigns 5 to x

// Correct
if (x == 5) { }  // Compares x with 5
```

### 2. Semicolon After If

```java
// Bug - empty if body due to semicolon
if (condition);
{
    System.out.println("This always executes");
}

// Correct
if (condition) {
    System.out.println("This executes only if condition is true");
}
```

### 3. Missing Break in Switch

```java
// Bug - fall through
switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");  // Executes for both 1 and 2
        break;
}
```

### 4. String Comparison in Switch

```java
// Wrong - using == for String comparison
switch (day) {
    case "Monday":  // This won't work as expected
        break;
}

// For older Java versions, use if-else or enums
// For Java 7+, String is supported in switch
```

### 5. Floating Point Comparison

```java
// Unreliable due to floating point precision
double temp = 100.0;
if (temp == 100.0) { }  // May be false due to precision issues

// Better
double temp = 100.0;
if (Math.abs(temp - 100.0) < 0.0001) { }  // Use epsilon comparison
```

## Performance Considerations

### 1. Order of Conditions

```java
// Place most likely conditions first
if (isCommonCase) {
    // handle common case
} else if (isRareCase) {
    // handle rare case
} else {
    // handle other cases
}
```

### 2. Switch vs If-Else Performance

- **Switch** is generally faster for many conditions (uses jump table)
- **If-else** is more flexible but can be slower for many conditions
- Use **switch** when checking a single variable against multiple constants

### 3. Short-Circuit Evaluation

```java
// Second condition not evaluated if first is false
if (isValidUser && user.hasPermission()) {
    // access granted
}

// Second condition not evaluated if first is true
if (isAdmin || user.hasPermission()) {
    // access granted
}
```

## Advanced Patterns

### 1. Early Return Pattern

```java
public String getGrade(int marks) {
    if (marks < 0 || marks > 100) {
        return "Invalid marks";
    }

    if (marks >= 90) return "A";
    if (marks >= 80) return "B";
    if (marks >= 70) return "C";
    if (marks >= 60) return "D";

    return "F";
}
```

### 2. Guard Clauses

```java
public void processOrder(Order order) {
    if (order == null) {
        throw new IllegalArgumentException("Order cannot be null");
    }

    if (order.getItems().isEmpty()) {
        throw new IllegalArgumentException("Order must have items");
    }

    // Main processing logic here
}
```

### 3. Ternary Chain (Limited Use)

```java
// For simple cases only
String status = (age < 13) ? "Child" :
                (age < 20) ? "Teenager" :
                (age < 65) ? "Adult" : "Senior";
```

## Summary

Conditional statements are the backbone of decision-making in programming. They allow programs to:

- **Execute different code paths** based on conditions
- **Validate input data** before processing
- **Implement business rules** and logic
- **Control program flow** and handle different scenarios

Key takeaways:

- **if-else** for binary or multiple conditions
- **switch** for checking single variable against multiple constants
- **ternary operator** for simple conditional assignments
- **Always use braces** for code blocks
- **Include break statements** in switch cases
- **Order conditions** from most likely to least likely
- **Keep conditions simple** and readable

Understanding conditional statements is crucial for writing programs that can make decisions and handle different situations appropriately.
