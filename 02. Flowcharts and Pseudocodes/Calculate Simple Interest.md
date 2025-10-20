# Calculate Simple Interest

## Problem Statement
Create a program that calculates Simple Interest using the formula: **SI = (P × R × T) / 100**

Where:
- **P** = Principal amount (initial amount of money)
- **R** = Rate of interest (percentage per annum)
- **T** = Time period (in years)

## Flowchart

```mermaid
flowchart TD
    Start([Start]) --> InputP[/Enter Principal Amount P/]
    InputP --> InputR[/Enter Rate of Interest R/]
    InputR --> InputT[/Enter Time Period T/]
    InputT --> ValidateInputs{All inputs > 0?}

    ValidateInputs -->|No| DisplayError[/Display "Invalid input: All values must be positive"/]
    DisplayError --> End([End])

    ValidateInputs -->|Yes| CalculateSI[SI = (P × R × T) / 100]
    CalculateSI --> DisplayResult[/Display Simple Interest = SI/]
    DisplayResult --> End([End])
```

## Pseudocode

```
BEGIN
    DECLARE principal, rate, time, simpleInterest

    DISPLAY "Enter Principal amount (P): "
    READ principal

    DISPLAY "Enter Rate of interest (R): "
    READ rate

    DISPLAY "Enter Time period in years (T): "
    READ time

    // Input validation
    IF principal <= 0 OR rate <= 0 OR time <= 0 THEN
        DISPLAY "Error: All values must be positive numbers"
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

## Alternative Pseudocode (Function-based)

```
Function CalculateSimpleInterest(principal, rate, time)
    // Input validation
    IF principal <= 0 THEN
        RETURN "Error: Principal must be positive"
    END IF

    IF rate <= 0 THEN
        RETURN "Error: Rate must be positive"
    END IF

    IF time <= 0 THEN
        RETURN "Error: Time must be positive"
    END IF

    // Calculate Simple Interest using formula: SI = (P × R × T) / 100
    simpleInterest = (principal * rate * time) / 100

    RETURN simpleInterest
End Function

// Main program
Start Program
    DECLARE P, R, T, SI

    DISPLAY "=== Simple Interest Calculator ==="
    READ P, R, T

    SET SI = CalculateSimpleInterest(P, R, T)

    IF SI is a number THEN
        DISPLAY "Simple Interest: " + SI
        DISPLAY "Total Amount: " + (P + SI)
    ELSE
        DISPLAY SI  // Display error message
    END IF

End Program
```

## Step-by-Step Explanation

1. **Start**: Program execution begins
2. **Input Collection**: Get three values from user
   - Principal amount (P)
   - Rate of interest (R) in percentage
   - Time period (T) in years
3. **Input Validation**: Check if all inputs are positive numbers
4. **Calculation**: Apply formula SI = (P × R × T) / 100
5. **Output**: Display the calculated simple interest and total amount
6. **End**: Program terminates

## Variables Used

| Variable | Data Type | Purpose |
|----------|-----------|---------|
| principal (P) | Number | The initial amount of money invested or borrowed |
| rate (R) | Number | The annual interest rate as percentage |
| time (T) | Number | The time period in years |
| simpleInterest (SI) | Number | The calculated simple interest amount |

## Simple Interest Formula

**SI = (P × R × T) / 100**

Where:
- **SI** = Simple Interest
- **P** = Principal amount
- **R** = Rate of interest per annum (in %)
- **T** = Time period in years

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
**SI = (10000 × 8 × 2) / 100**
**SI = (160000) / 100**
**SI = 1600**

**Total Amount = Principal + Simple Interest = 10000 + 1600 = 11600**

## Edge Cases to Consider

- **Zero values**: Principal, rate, or time cannot be zero or negative
- **Decimal values**: Should handle fractional amounts and rates
- **Large numbers**: Should handle large principal amounts
- **Different time units**: Ensure time is always in years (convert if necessary)
- **Rate formats**: Handle rate as decimal (0.08) or percentage (8%)

## Implementation Notes

- **Input validation**: Always check for positive values
- **Data types**: Use floating-point numbers for decimal calculations
- **Rounding**: Consider rounding to appropriate decimal places
- **Currency formatting**: Format monetary values appropriately
- **Time conversion**: Convert months to years if needed (months ÷ 12)

## Common Applications

- **Banking**: Savings account interest calculation
- **Loans**: Personal loan interest computation
- **Investments**: Fixed deposit interest calculation
- **Financial planning**: Interest income projections

## Extended Formula Variations

**For monthly calculations:**
- Monthly SI = (P × R × T) / (100 × 12)

**For daily calculations:**
- Daily SI = (P × R × T) / (100 × 365)

**For quarterly calculations:**
- Quarterly SI = (P × R × T) / (100 × 4)
