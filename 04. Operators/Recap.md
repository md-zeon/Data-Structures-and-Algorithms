# Operators in Java - Learning Recap

## Overview

This module covered all types of operators in Java, their precedence, associativity, and practical applications through various examples and practice problems.

## Key Topics Learned

### 1. Arithmetic Operators

#### Binary Arithmetic Operators

- **Addition (`+`)**: Adds two operands
- **Subtraction (`-`)**: Subtracts second operand from first
- **Multiplication (`*`)**: Multiplies two operands
- **Division (`/`)**: Divides first operand by second
- **Modulus (`%`)**: Returns remainder of division

```java
int a = 10, b = 3;
System.out.println(a + b);  // 13
System.out.println(a - b);  // 7
System.out.println(a * b);  // 30
System.out.println(a / b);  // 3 (integer division)
System.out.println(a % b);  // 1 (remainder)
```

#### Unary Arithmetic Operators

- **Increment (`++`)**: Increases value by 1
- **Decrement (`--`)**: Decreases value by 1

**Pre-increment/decrement**: Value is modified before use
**Post-increment/decrement**: Value is used first, then modified

```java
int x = 5;
System.out.println(++x);  // 6 (pre-increment)
System.out.println(x++);  // 6 (post-increment, prints 6 then becomes 7)
```

### 2. Relational Operators

Used for comparison, return boolean values:

| Operator | Description              | Example  |
| -------- | ------------------------ | -------- |
| `==`     | Equal to                 | `a == b` |
| `!=`     | Not equal to             | `a != b` |
| `>`      | Greater than             | `a > b`  |
| `<`      | Less than                | `a < b`  |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to    | `a <= b` |

```java
int a = 10, b = 5;
System.out.println(a > b);   // true
System.out.println(a == b);  // false
System.out.println(a <= b);  // false
```

### 3. Logical Operators

Work with boolean operands:

| Operator | Description | Example                    |
| -------- | ----------- | -------------------------- |
| `&&`     | Logical AND | `true && false` → `false`  |
| `\|\|`   | Logical OR  | `true \|\| false` → `true` |
| `!`      | Logical NOT | `!true` → `false`          |

```java
boolean x = true, y = false;
System.out.println(x && y);  // false
System.out.println(x || y);  // true
System.out.println(!x);      // false
```

### 4. Bitwise Operators

Work at bit level:

| Operator | Description | Example  |
| -------- | ----------- | -------- |
| `&`      | Bitwise AND | `a & b`  |
| `\|`     | Bitwise OR  | `a \| b` |
| `^`      | Bitwise XOR | `a ^ b`  |
| `~`      | Bitwise NOT | `~a`     |
| `<<`     | Left shift  | `a << 1` |
| `>>`     | Right shift | `a >> 1` |

```java
int a = 5;  // Binary: 101
int b = 3;  // Binary: 011
System.out.println(a & b);  // 1 (001)
System.out.println(a | b);  // 7 (111)
System.out.println(a << 1); // 10 (1010)
```

### 5. Assignment Operators

#### Simple Assignment

- **`=`**: Assigns right operand to left operand

#### Compound Assignment

- **`+=`**: Adds and assigns (`a += b` ≡ `a = a + b`)
- **`-=`**: Subtracts and assigns (`a -= b` ≡ `a = a - b`)
- **`*=`**: Multiplies and assigns (`a *= b` ≡ `a = a * b`)
- **`/=`**: Divides and assigns (`a /= b` ≡ `a = a / b`)
- **`%=`**: Modulus and assigns (`a %= b` ≡ `a = a % b`)
- **`&=`**: Bitwise AND and assigns (`a &= b` ≡ `a = a & b`)
- **`\|=`**: Bitwise OR and assigns (`a |= b` ≡ `a = a | b`)
- **`^=`**: Bitwise XOR and assigns (`a ^= b` ≡ `a = a ^ b`)
- **`<<=`**: Left shift and assigns (`a <<= b` ≡ `a = a << b`)
- **`>>=`**: Right shift and assigns (`a >>= b` ≡ `a = a >> b`)

```java
int a = 10;
a += 5;  // a = 15
a *= 2;  // a = 30
a >>= 1; // a = 15 (right shift by 1)
```

## Operator Precedence and Associativity

### Precedence (Highest to Lowest)

1. **Parentheses** `()`
2. **Unary operators** `++`, `--`, `+`, `-`, `!`, `~`
3. **Multiplicative** `*`, `/`, `%`
4. **Additive** `+`, `-`
5. **Shift** `<<`, `>>`, `>>>`
6. **Relational** `<`, `>`, `<=`, `>=`
7. **Equality** `==`, `!=`
8. **Bitwise AND** `&`
9. **Bitwise XOR** `^`
10. **Bitwise OR** `|`
11. **Logical AND** `&&`
12. **Logical OR** `||`
13. **Ternary** `? :`
14. **Assignment** `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`

### Associativity Rules

- **Left Associative**: Most operators (evaluated left to right)
- **Right Associative**: Assignment, unary, ternary operators (evaluated right to left)

## Practical Examples and Edge Cases

### Integer Division Behavior

```java
int a = 10, b = 3;
System.out.println(a / b);  // 3 (not 3.333...)
System.out.println(a % b);  // 1 (remainder)
```

### Complex Expressions

```java
int x = 2, y = 5;
int exp1 = (x * y / x);    // 5 (integer division)
int exp2 = (x * (y / x));  // 4 (different due to parentheses)
```

### Short-Circuit Evaluation

Logical operators use short-circuit evaluation:

```java
boolean result = (condition1()) && (condition2()); // condition2() only called if condition1() is true
boolean result2 = (condition3()) || (condition4()); // condition4() only called if condition3() is false
```

## Common Patterns and Use Cases

### Conditional Expressions

```java
// Ternary operator
int max = (a > b) ? a : b;

// Multiple conditions
if (x > 0 && x < 100 && x % 2 == 0) {
    System.out.println("Even number between 1-99");
}
```

### Bit Manipulation

```java
// Check if number is even
if ((number & 1) == 0) {
    System.out.println("Even");
}

// Multiply by 2 using left shift
int result = number << 1; // Equivalent to number * 2

// Divide by 2 using right shift
int result2 = number >> 1; // Equivalent to number / 2 (for positive numbers)
```

### Increment/Decrement in Loops

```java
// Common loop patterns
for (int i = 0; i < 10; i++) {
    // Use i
}

// Pre-increment in conditions
int count = 0;
while (++count <= 10) {
    // count is incremented before comparison
}
```

## Best Practices

### 1. Use Parentheses for Clarity

```java
// Unclear precedence
int result = a + b * c / d;

// Clear with parentheses
int result = (a + b) * (c / d);
```

### 2. Avoid Side Effects in Expressions

```java
// Avoid this - hard to read
int result = ++a + b++ * --c;

// Better - separate statements
a++;
c--;
int result = a + b * c;
b++;
```

### 3. Use Compound Assignment for Readability

```java
// Less readable
total = total + amount;

// More readable
total += amount;
```

### 4. Be Careful with Integer Division

```java
// For floating point division, use double/float
double ratio = (double)numerator / denominator;
```

## Common Pitfalls

### 1. Assignment vs Equality

```java
// Wrong - assignment instead of comparison
if (a = b) { }

// Correct
if (a == b) { }
```

### 2. Integer Overflow

```java
// Be careful with large numbers
int result = Integer.MAX_VALUE + 1; // Overflow!
```

### 3. Division by Zero

```java
// Runtime error
int result = a / 0; // ArithmeticException
```

### 4. Floating Point Precision

```java
// May not be exactly equal due to precision
double a = 0.1 + 0.2; // 0.30000000000000004
if (a == 0.3) { } // May be false!
```

## Practice Problems Insights

### Expression Evaluation Order

Understanding how complex expressions are evaluated:

```java
int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
```

**Evaluation Steps:**

1. Parentheses evaluated first
2. Multiplication and division (left to right)
3. Addition and subtraction (left to right)

### Compound Assignment Behavior

```java
int x = y = z = 2;
x += y;  // x = x + y = 4
y -= z;  // y = y - z = 0
z /= (x + y); // z = z / (x + y) = 2 / 4 = 0
```

## Summary

Operators are fundamental building blocks of Java programming. Understanding operator precedence, associativity, and proper usage is crucial for writing correct and efficient code. Always use parentheses when in doubt about precedence, and be mindful of edge cases like integer division, overflow, and floating-point precision issues.

Key takeaways:

- **Precedence**: Determines evaluation order
- **Associativity**: Determines grouping when precedence is equal
- **Side effects**: Increment/decrement can cause unexpected behavior
- **Type conversion**: Be aware of automatic type promotion in expressions
- **Readability**: Use parentheses and avoid complex expressions when possible
