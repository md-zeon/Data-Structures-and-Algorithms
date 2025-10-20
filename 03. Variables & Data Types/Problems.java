import java.util.*;
public class Problems {
    public static void main(String[] args) {
        //  Problem 1: Calculate the sum of two integers
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        /*
         ^ NOTE: Memory Allocation:
         * - 'a' and 'b' are allocated memory to store integer values 5 and 10 respectively.
         * - 'sum' is allocated memory to store the result of the addition of 'a' and 'b'.
         * - The values are stored in the stack memory as they are primitive data types.
         * - When the program ends, the memory allocated for these variables is released.
        */

        // Problem 2: Calculate the sum of two integers using user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        int userSum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + userSum);
        

        // Calculate the Product of two floating-point numbers
        System.out.print("Enter first floating-point number: ");
        float floatNum1 = scanner.nextFloat();
        System.out.print("Enter second floating-point number: ");
        float floatNum2 = scanner.nextFloat();
        float product = floatNum1 * floatNum2;
        System.out.println("Product of " + floatNum1 + " and " + floatNum2 + " is: " + product);
        
        scanner.close();
    }
}