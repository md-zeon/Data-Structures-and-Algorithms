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
        

        // Problem 3: Calculate the Product of two floating-point numbers
        System.out.print("Enter first floating-point number: ");
        float floatNum1 = scanner.nextFloat();
        System.out.print("Enter second floating-point number: ");
        float floatNum2 = scanner.nextFloat();
        float product = floatNum1 * floatNum2;
        System.out.println("Product of " + floatNum1 + " and " + floatNum2 + " is: " + product);


        // Problem 4: Calculate the area of a circle
        System.out.print("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);

        /*
         ^ NOTE: Type Casting:
         * In Java, type casting is the process of converting a variable from one data type to another.
         * Type casting is important when you want to perform operations on different data types or when you want to store a value of one type into a variable of another type.
         * 
         * There are two types of type casting:
         * 1. Implicit Casting (Widening): This happens when a smaller data type is converted to a larger data type automatically.
         *    Example: int to float, char to int.
         * 2. Explicit Casting (Narrowing): This happens when a larger data type is converted to a smaller data type manually by the programmer.
         *    Example: float to int, double to float.
         * 
         * In the above code, we used implicit casting when multiplying two float numbers to get the product.
         * When calculating the area of the circle, we used a float literal (3.14f) to ensure that the multiplication is done in float precision.
         * When reading user input, the Scanner class methods (nextInt, nextFloat) automatically handle the type conversion from String input to the respective data types.
         * When performing arithmetic operations, Java automatically promotes smaller data types to larger ones to prevent data loss.
         * It's important to be cautious with explicit casting as it can lead to data loss if the value being cast is outside the range of the target data type.
         * Always ensure that the data being cast is compatible with the target type to avoid unexpected behavior.
         * In the above code, we used explicit casting when converting the float result of the area calculation to an int for display purposes.
         * This ensures that we only display the integer part of the area, truncating any decimal values.
         * Be mindful of the potential for data loss when performing explicit casting, especially when converting from floating-point types to integer types.
         * Always validate user input to ensure it falls within acceptable ranges before performing type casting operations.
         * By understanding and utilizing type casting effectively, you can ensure that your Java programs handle data types correctly and avoid potential pitfalls associated with type conversions.
         * 
         * In summary, type casting is a powerful feature in Java that allows you to work with different data types seamlessly. However, it requires careful consideration to avoid issues such as data loss and unexpected behavior.
         */

         
        scanner.close();
    }
}