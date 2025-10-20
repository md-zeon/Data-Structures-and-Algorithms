# Calculate Simple Interest

## Problem Statement

Create a program that calculates Simple Interest using the formula: **SI = (P × R × T) / 100**

Where:

* **P** = Principal amount (initial amount of money)
* **R** = Rate of interest (percentage per annum)
* **T** = Time period (in years)

## Flowchart

```mermaid
flowchart TD
Start([Start]) --> InputP[/Enter Principal Amount P/]
InputP --> InputR[/Enter Rate of Interest R/]
InputR --> InputT[/Enter Time Period T/]
InputT --> ValidateInputs{Are all inputs positive numbers?}


ValidateInputs -->|No| DisplayError[/Display "Error: All values must be positive"/]
DisplayError --> End([End])


ValidateInputs -->|Yes| CalculateSI([Calculate SI = (P × R × T) / 100])
CalculateSI --> DisplayResult[/Display Simple Interest and Total Amount/]
DisplayResult --> End([End])
```

## Pseudocode

```
BEGIN
    DECLARE principal, rate, time, simpleInterest

    DISPLAY "Enter Principal amount (P): "
    READ principal

    DISPLAY "Enter Rate of interest (R) in %: "
    READ rate

    DISPLAY "Enter Time period in years (T): "
    READ time

    // Input validation
    IF principal <= 0 THEN
        DISPLAY "Error: Principal must be positive"
    ELSE IF rate <= 0 THEN
        DISPLAY "Error: Rate must be positive"
    ELSE IF time <= 0 THEN
        DISPLAY "Error: Time must be positive"
    ELSE
        // Calculate Simple Interest
        SET simpleInterest = (principal * rate * time) / 100

        // Display results
        DISPLAY "Principal Amount: " + principal
        DISPLAY "Rate of Interest: " + rate + "%"
        DISPLAY "Time Period: " + time + " years"
        DISPLAY "Simple Interest: " + simpleInterest
        DISPLAY "Total Amount: " + (principal + simpleInterest)
    END IF
END
```

## Function-Based Pseudocode

```
Function CalculateSimpleInterest(principal, rate, time)
    // Input validation
    IF principal <= 0 THEN
        RETURN null
    END IF

    IF rate <= 0 THEN
        RETURN null
    END IF

    IF time <= 0 THEN
        RETURN null
    END IF

    // Calculate Simple Interest using formula: SI = (P × R × T) / 100
    simpleInterest = (principal * rate * time) / 100

    RETURN simpleInterest
End Function

// Main program
Start Program
    DECLARE P, R, T, SI

    DISPLAY "=== Simple Interest Calculator ==="
    DISPLAY "Enter Principal amount:"
    READ P
    DISPLAY "Enter Rate of interest in %:"
    READ R
    DISPLAY "Enter Time period in years:"
    READ T

    SET SI = CalculateSimpleInterest(P, R, T)

    IF SI is not null THEN
        DISPLAY "Simple Interest: " + SI
        DISPLAY "Total Amount: " + (P + SI)
    ELSE
        DISPLAY "Error: Invalid input. All values must be positive numbers."
    END IF
End Program
```

## Step-by-Step Explanation

1. **Start**: Program execution begins.
2. **Input Collection**: Get three values from the user:

   * Principal amount (P)
   * Rate of interest (R) in percentage
   * Time period (T) in years
3. **Input Validation**: Check if all inputs are positive numbers.
4. **Calculation**: Apply the formula SI = (P × R × T) / 100.
5. **Output**: Display the calculated simple interest and total amount.
6. **End**: Program terminates.

## Variables Used

| Variable            | Data Type | Purpose                                          |
| ------------------- | --------- | ------------------------------------------------ |
| principal (P)       | Number    | The initial amount of money invested or borrowed |
| rate (R)            | Number    | The annual interest rate as percentage           |
| time (T)            | Number    | The time period in years                         |
| simpleInterest (SI) | Number    | The calculated simple interest amount            |

## Sample Input/Output

**Input:**

```
Enter Principal amount (P): 10000
Enter Rate of interest (R): 8
Enter Time period in years (T): 2
```

**Output:**

```
Principal Amount: 10000
Rate of Interest: 8%
Time Period: 2 years
Simple Interest: 1600
Total Amount: 11600
```

## Manual Calculation Verification

**SI = (P × R × T) / 100**
**SI = (10000 × 8 × 2) / 100 = 1600**

**Total Amount = Principal + Simple Interest = 10000 + 1600 = 11600**

## Edge Cases to Consider

* **Zero or negative values**: Principal, rate, or time cannot be zero or negative.
* **Decimal values**: Handle fractional amounts and rates.
* **Large numbers**: Ensure calculation supports large amounts.
* **Time units**: Ensure time is in years (convert months or days if needed).
* **Rate formats**: Ensure rate is entered as percentage (8%) and not decimal (0.08) unless converted.

## Implementation Notes

* Always validate inputs to be positive numbers.
* Use floating-point numbers for decimal calculations.
* Consider rounding results to 2 decimal places for currency.
* Format monetary outputs properly (e.g., 11,600.00).

## Common Applications

* Banking: Savings account interest calculation.
* Loans: Personal loan interest computation.
* Investments: Fixed deposit interest calculation.
* Financial planning: Interest income projections.

## Extended Formula Variations

* **Monthly calculations:** SI = (P × R × T) / (100 × 12)
* **Daily calculations:** SI = (P × R × T) / (100 × 365)
* **Quarterly calculations:** SI = (P × R × T) / (100 × 4)
