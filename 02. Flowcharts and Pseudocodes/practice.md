# Flowchart Practice Problems

## Question 1: Flowchart to calculate the area of a circle

**Problem Statement:** Create a flowchart to calculate the area of a circle given its radius.

**Formula:** Area = π × r² (where π ≈ 3.14159)

```mermaid
flowchart TD
    Start([Start]) --> InputRadius[/Enter radius r/]
    InputRadius --> ValidateR{r > 0?}

    ValidateR -->|No| DisplayError[/Display "Radius must be positive"/]
    DisplayError --> End([End])

    ValidateR -->|Yes| CalculateArea[Area = π × r × r]
    CalculateArea --> DisplayResult[/Display Area of Circle/]
    DisplayResult --> End([End])
```

## Question 2: Flowchart to find the greatest from 2 numbers

**Problem Statement:** Create a flowchart to find the greatest number between two given numbers.

```mermaid
flowchart TD
    Start([Start]) --> InputA[/Enter first number A/]
    InputA --> InputB[/Enter second number B/]
    InputB --> Compare{A > B?}

    Compare -->|Yes| DisplayA[/Display "Greatest is A"/]
    Compare -->|No| DisplayB[/Display "Greatest is B"/]

    DisplayA --> End([End])
    DisplayB --> End([End])
```

## Question 3: Flowchart to print the Even numbers between 9 and 100

**Problem Statement:** Create a flowchart to display all even numbers between 9 and 100 (inclusive).

```mermaid
flowchart TD
    Start([Start]) --> Initialize[Set num = 10<br/>(First even number > 9)/]

    Initialize --> CheckRange{num <= 100?}

    CheckRange -->|Yes| DisplayNum[/Display num/]
    DisplayNum --> Increment[Set num = num + 2]
    Increment --> CheckRange

    CheckRange -->|No| End([End])
```

## Question 4: Flowchart for calculating the average from 25 exam scores

**Problem Statement:** Create a flowchart to calculate the average of 25 exam scores entered by the user.

```mermaid
flowchart TD
    Start([Start]) --> Initialize[Set sum = 0<br/>Set count = 1<br/>Set total_students = 25/]

    Initialize --> InputLoop{count <= total_students?}

    InputLoop -->|Yes| InputScore[/Enter score for student/ + count/]
    InputScore --> ValidateScore{score >= 0 and score <= 100?}

    ValidateScore -->|No| DisplayError[/Display "Invalid score. Enter 0-100"/]
    DisplayError --> InputScore

    ValidateScore -->|Yes| AddScore[sum = sum + score]
    AddScore --> IncrementCount[count = count + 1]
    IncrementCount --> InputLoop

    InputLoop -->|No| CalculateAvg[average = sum / total_students]
    CalculateAvg --> DisplayResult[/Display Average Score/]
    DisplayResult --> End([End])
```

---

# Additional Practice Problems

## Question 5: Flowchart to check if a number is positive, negative, or zero

```mermaid
flowchart TD
    Start([Start]) --> InputNum[/Enter a number/]
    InputNum --> CheckZero{number == 0?}

    CheckZero -->|Yes| DisplayZero[/Display "Zero"/]
    CheckZero -->|No| CheckPositive{number > 0?}

    CheckPositive -->|Yes| DisplayPositive[/Display "Positive"/]
    CheckPositive -->|No| DisplayNegative[/Display "Negative"/]

    DisplayZero --> End([End])
    DisplayPositive --> End([End])
    DisplayNegative --> End([End])
```

## Question 6: Flowchart to calculate factorial of a number

```mermaid
flowchart TD
    Start([Start]) --> InputN[/Enter number N/]
    InputN --> ValidateN{N >= 0?}

    ValidateN -->|No| DisplayError[/Display "N must be non-negative"/]
    DisplayError --> End([End])

    ValidateN -->|Yes| CheckZero{N == 0?}

    CheckZero -->|Yes| DisplayOne[/Display "Factorial = 1"/]
    CheckZero -->|No| InitFact[Set factorial = 1<br/>Set i = 1/]

    DisplayOne --> End([End])

    InitFact --> LoopCheck{i <= N?}

    LoopCheck -->|Yes| Multiply[factorial = factorial × i]
    Multiply --> IncrementI[i = i + 1]
    IncrementI --> LoopCheck

    LoopCheck -->|No| DisplayFact[/Display Factorial of N/]
    DisplayFact --> End([End])
```

## Question 7: Flowchart to convert temperature from Celsius to Fahrenheit

```mermaid
flowchart TD
    Start([Start]) --> InputCelsius[/Enter temperature in Celsius/]
    InputCelsius --> Convert[Fahrenheit = (Celsius × 9/5) + 32]
    Convert --> DisplayResult[/Display Temperature in Fahrenheit/]
    DisplayResult --> End([End])
```

## Question 8: Flowchart to check if a year is a leap year

```mermaid
flowchart TD
    Start([Start]) --> InputYear[/Enter year/]
    InputYear --> DivBy4{year % 4 == 0?}

    DivBy4 -->|No| NotLeap[/Display "Not a Leap Year"/]
    DivBy4 -->|Yes| DivBy100{year % 100 == 0?}

    DivBy100 -->|No| IsLeap[/Display "Leap Year"/]
    DivBy100 -->|Yes| DivBy400{year % 400 == 0?}

    DivBy400 -->|Yes| IsLeap[/Display "Leap Year"/]
    DivBy400 -->|No| NotLeap[/Display "Not a Leap Year"/]

    IsLeap --> End([End])
    NotLeap --> End([End])
```

## Question 9: Flowchart to generate multiplication table

```mermaid
flowchart TD
    Start([Start]) --> InputNum[/Enter number for table/]
    InputNum --> InitTable[Set i = 1/]

    InitTable --> LoopCheck{i <= 10?}

    LoopCheck -->|Yes| Calculate[i × number]
    Calculate --> DisplayLine[/Display i × number = result/]
    DisplayLine --> IncrementI[i = i + 1]
    IncrementI --> LoopCheck

    LoopCheck -->|No| End([End])
```

## Question 10: Flowchart to reverse a given number

```mermaid
flowchart TD
    Start([Start]) --> InputNum[/Enter number to reverse/]
    InputNum --> InitReverse[Set reverse = 0<br/>Store original number/]

    InitReverse --> ExtractDigit{original > 0?}

    ExtractDigit -->|Yes| GetLastDigit[digit = original % 10]
    GetLastDigit --> UpdateReverse[reverse = (reverse × 10) + digit]
    UpdateReverse --> RemoveLastDigit[original = original / 10]
    RemoveLastDigit --> ExtractDigit

    ExtractDigit -->|No| DisplayReverse[/Display reversed number/]
    DisplayReverse --> End([End])
```

---

# Solutions and Explanations

## Question 1 Solution: Area of Circle
- **Input**: Radius (r)
- **Process**: Area = π × r²
- **Output**: Display calculated area
- **Edge Cases**: Radius must be positive

## Question 2 Solution: Greatest of Two Numbers
- **Input**: Two numbers (A, B)
- **Process**: Compare A and B
- **Output**: Display the larger number
- **Edge Cases**: Equal numbers (display either)

## Question 3 Solution: Even Numbers 9-100
- **Process**: Start from 10, add 2 each time until 100
- **Output**: Display all even numbers in range
- **Note**: 9 and 100 are odd, so excluded

## Question 4 Solution: Average of 25 Scores
- **Input**: 25 exam scores
- **Process**: Sum all scores and divide by 25
- **Output**: Display average score
- **Edge Cases**: Validate score range (0-100)

## Tips for Creating Flowcharts

1. **Start with clear problem statement**
2. **Identify inputs and outputs**
3. **Break down the logic into steps**
4. **Use appropriate symbols**:
   - Oval: Start/End
   - Parallelogram: Input/Output
   - Rectangle: Process
   - Diamond: Decision
5. **Test your flowchart logic**
6. **Keep it simple and readable**

## Common Flowchart Patterns

- **Sequential**: Step-by-step processes
- **Decision**: If-else branching
- **Loops**: Repetitive operations
- **Input/Output**: Data entry and display

Practice these problems to improve your flowchart design skills and algorithmic thinking!
