# Prime Number Checker

## Problem Statement
Create a program that checks whether a given number is a prime number or not. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

## Flowchart

```mermaid
flowchart TD
    Start([Start]) --> InputNum[/Enter a number N/]
    InputNum --> CheckSmall{Is N <= 1?}

    CheckSmall -->|Yes| NotPrime[/Display "Not Prime"/]
    NotPrime --> End([End])

    CheckSmall -->|No| CheckEven{Is N even<br/>and N != 2?}

    CheckEven -->|Yes| NotPrime2[/Display "Not Prime"/]
    NotPrime2 --> End

    CheckEven -->|No| InitI[Set i = 3]

    InitI --> LoopCheck{i <= sqrt(N)?}

    LoopCheck -->|Yes| CheckDiv{N % i == 0?}
    CheckDiv -->|Yes| NotPrime3[/Display "Not Prime"/]
    NotPrime3 --> End

    CheckDiv -->|No| IncrementI[Set i = i + 2]
    IncrementI --> LoopCheck

    LoopCheck -->|No| IsPrime[/Display "Prime Number"/]
    IsPrime --> End
```

## Optimized Flowchart (Trial Division)

```mermaid
flowchart TD
    Start([Start]) --> InputNum[/Enter number to check/]
    InputNum --> BasicCheck{N <= 1?}

    BasicCheck -->|Yes| NotPrime[/Not Prime<br/>(Numbers <= 1 are not prime)/]
    NotPrime --> End([End])

    BasicCheck -->|No| CheckTwo{N == 2?}

    CheckTwo -->|Yes| Prime[/Prime Number<br/>(2 is the only even prime)/]
    Prime --> End

    CheckTwo -->|No| CheckEven{N % 2 == 0?}

    CheckEven -->|Yes| NotPrime2[/Not Prime<br/>(Even numbers > 2 are not prime)/]
    NotPrime2 --> End

    CheckEven -->|No| TrialDiv[Check divisibility from 3 to √N<br/>in steps of 2]

    TrialDiv --> DivCheck{i > √N?}

    DivCheck -->|No| CheckDivides{N % i == 0?}
    CheckDivides -->|Yes| NotPrime3[/Not Prime<br/>(Divisible by i)/]
    NotPrime3 --> End

    CheckDivides -->|No| NextI[Set i = i + 2]
    NextI --> DivCheck

    DivCheck -->|Yes| Prime2[/Prime Number<br/>(No divisors found)/]
    Prime2 --> End
```

## Pseudocode

```
BEGIN
    DECLARE number, i, isPrime

    DISPLAY "Enter a number to check: "
    READ number

    // Basic checks
    IF number <= 1 THEN
        DISPLAY number + " is not a prime number"
    ELSE IF number == 2 THEN
        DISPLAY number + " is a prime number"
    ELSE IF number % 2 == 0 THEN
        DISPLAY number + " is not a prime number"
    ELSE
        // Check for factors from 3 to sqrt(number)
        SET isPrime = true
        SET i = 3

        WHILE i * i <= number DO
            IF number % i == 0 THEN
                SET isPrime = false
                BREAK
            END IF
            SET i = i + 2
        END WHILE

        IF isPrime == true THEN
            DISPLAY number + " is a prime number"
        ELSE
            DISPLAY number + " is not a prime number"
        END IF
    END IF

END
```

## Function-based Pseudocode

```
Function IsPrime(number)
    // Handle edge cases
    IF number <= 1 THEN
        RETURN false
    END IF

    IF number == 2 THEN
        RETURN true
    END IF

    IF number % 2 == 0 THEN
        RETURN false
    END IF

    // Check odd factors up to square root
    DECLARE i = 3
    WHILE i * i <= number DO
        IF number % i == 0 THEN
            RETURN false
        END IF
        SET i = i + 2
    END WHILE

    RETURN true
End Function

// Main program
Start Program
    DECLARE num
    DECLARE result

    DISPLAY "Enter a number:"
    READ num

    SET result = IsPrime(num)

    IF result == true THEN
        DISPLAY num + " is a prime number"
    ELSE
        DISPLAY num + " is not a prime number"
    END IF

End Program
```

## Step-by-Step Explanation

1. **Start**: Program execution begins
2. **Input**: Get a number from the user
3. **Basic Validation**:
   - Numbers ≤ 1 are not prime
   - 2 is the only even prime number
   - Even numbers > 2 are not prime
4. **Trial Division**:
   - Check divisibility from 3 to √N in steps of 2
   - If any number divides evenly, it's not prime
   - If no divisors found, it's prime
5. **Output**: Display whether the number is prime or not
6. **End**: Program terminates

## Prime Number Definition

A prime number is:
- A natural number greater than 1
- Has no positive divisors other than 1 and itself
- Cannot be formed by multiplying two smaller natural numbers

## Algorithm Explanation

### Trial Division Method
```
For a number N:
1. If N ≤ 1: Not prime
2. If N = 2: Prime (special case)
3. If N is even and N ≠ 2: Not prime
4. Check divisibility by odd numbers from 3 to √N
5. If any odd number divides N evenly: Not prime
6. If no divisors found: Prime
```

### Why Check Up to √N?
- If N has a factor larger than √N, it must have a corresponding factor smaller than √N
- Example: For 35, √35 ≈ 5.9, so we check up to 5
- 35 = 5 × 7, where 5 ≤ 5.9 and 7 > 5.9
- We find 5 as a divisor, so no need to check 7

## Variables Used

| Variable | Data Type | Purpose |
|----------|-----------|---------|
| number/num | Integer | The number to be checked for primality |
| i | Integer | Loop counter for checking divisibility |
| isPrime/result | Boolean | Flag to track if number is prime |

## Sample Input/Output

**Input 1:**
```
Enter a number to check: 17
```

**Output 1:**
```
17 is a prime number
```

**Input 2:**
```
Enter a number to check: 25
```

**Output 2:**
```
25 is not a prime number
```

**Input 3:**
```
Enter a number to check: 2
```

**Output 3:**
```
2 is a prime number
```

## Manual Checking Examples

**Example 1: 17 (Prime)**
```
Check divisibility by: 3, 5, 7, 11, 13
17 ÷ 3 = 5.666 (not integer)
17 ÷ 5 = 3.4 (not integer)
17 ÷ 7 = 2.428 (not integer)
17 ÷ 11 = 1.545 (not integer)
17 ÷ 13 = 1.307 (not integer)
No divisors found → Prime
```

**Example 2: 25 (Not Prime)**
```
Check divisibility by: 3, 5
25 ÷ 3 = 8.333 (not integer)
25 ÷ 5 = 5 (integer)
5 × 5 = 25 → Not Prime
```

**Example 3: 1 (Not Prime)**
```
1 ≤ 1 → Not Prime
```

## Edge Cases to Consider

- **Number = 1**: Not prime (smallest natural number)
- **Number = 2**: Prime (only even prime)
- **Negative numbers**: Not prime (prime numbers are defined as positive)
- **Number = 0**: Not prime
- **Even numbers > 2**: Not prime
- **Perfect squares**: Usually not prime (except 1)
- **Large prime numbers**: Should handle efficiently

## Performance Optimizations

### Basic Optimizations Applied
- Skip even numbers after checking 2
- Only check up to √N instead of N/2
- Check in steps of 2 (odd numbers only)

### Further Optimizations
- **6k ± 1 optimization**: Check divisibility by numbers of form 6k ± 1
- **Pre-computed primes**: Use Sieve of Eratosthenes for multiple checks
- **Miller-Rabin test**: Probabilistic test for very large numbers

## Prime Numbers List (First 20)

| Prime Numbers | | | |
|---------------|-|-|-|
| 2 | 3 | 5 | 7 |
| 11 | 13 | 17 | 19 |
| 23 | 29 | 31 | 37 |
| 41 | 43 | 47 | 53 |
| 59 | 61 | 67 | 71 |

## Common Applications

- **Cryptography**: RSA algorithm, public-key encryption
- **Hash tables**: Prime numbers as hash table sizes
- **Computer security**: Password hashing, digital signatures
- **Number theory**: Prime factorization, primality testing
- **Gaming**: Random number generation, procedural content

## Implementation Notes

- **Input validation**: Handle non-integer inputs gracefully
- **Large numbers**: Consider using BigInteger for very large numbers
- **Efficiency**: Algorithm should be efficient for reasonable input sizes
- **User feedback**: Provide clear output messages
- **Error handling**: Handle edge cases and invalid inputs

## Testing Recommendations

Test with various inputs:
- Small prime numbers (2, 3, 5, 7, 11)
- Small composite numbers (4, 6, 8, 9, 10, 12)
- Edge cases (0, 1, 2, negative numbers)
- Perfect squares (9, 25, 49, 121)
- Large prime numbers
- Numbers close to powers of 10

## Time Complexity

- **Best case**: O(1) for numbers ≤ 2
- **Average case**: O(√N) for prime numbers
- **Worst case**: O(√N) for prime numbers (when we check all the way to √N)

## Mathematical Properties

- There are infinitely many prime numbers (Euclid's theorem)
- Prime distribution follows Prime Number Theorem
- Largest known prime: 2^82,589,933 - 1 (as of 2023)
- Twin primes: Prime pairs that differ by 2 (3-5, 5-7, 11-13, etc.)
