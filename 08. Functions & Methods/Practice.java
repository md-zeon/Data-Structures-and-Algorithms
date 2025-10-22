import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Problem 1: Write a method to compute the average of 3 numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double average = computeAverage(num1, num2, num3);
        System.out.println("The average is: " + average);

        // Problem 2: Write a method named isEven that accepts an int argument. The
        // method should return true if the argument is even, or false otherwise. Also
        // write a program to test your method.
        System.out.print("Enter an integer: ");
        int testNum = scanner.nextInt();
        boolean isEven = isEven(testNum);
        System.out.println("Is " + testNum + " even? " + isEven);

        /*
        ? Problem 3:
         * Write a Java method to check if a number is a palindrome in Java?(121 is a palindrome, 321
         * is not) A number is called a palindrome if the number is equal to the reverse of a number e.g.,
         * 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand,
         * 321 is not a palindrome because the reverse of 321 is 123, which is not equal to
         * 321
         */

        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = scanner.nextInt();
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);

        /*
         * Math Class Methods in Java:
         * 1. Math.abs(): Returns the absolute value of a number.
         * 2. Math.ceil(): Rounds a number up to the nearest integer.
         * 3. Math.floor(): Rounds a number down to the nearest integer.
         * 4. Math.max(): Returns the larger of two values.
         * 5. Math.min(): Returns the smaller of two values.
         * 6. Math.pow(): Raises a number to the power of another number.
         * 7. Math.sqrt(): Returns the square root of a number.
         * 8. Math.random(): Returns a random number between 0.0 and 1.0.
         * 9. Math.round(): Rounds a floating-point number to the nearest integer.
         * 10. Math.log(): Returns the natural logarithm (base e) of a number. 
         * 11. Math.exp(): Returns e raised to the power of a given number.
         * 12. Math.sin(), Math.cos(), Math.tan(): Trigonometric functions that return the sine, cosine, and tangent of an angle (in radians), respectively.
         * 13. Math.toDegrees() and Math.toRadians(): Convert angles between degrees and radians.
         * 14. Math.cbrt(): Returns the cube root of a number.
         * etc.
         */
        // Practice using some Math class methods
        double value = -25.7;
        System.out.println("Absolute value of " + value + " is: " + Math.abs(value));
        System.out.println("Ceiling of " + value + " is: " + Math.ceil(value));
        System.out.println("Floor of " + value + " is: " + Math.floor(value));
        System.out.println("Square root of 16 is: " + Math.sqrt(16));
        System.out.println("2 raised to the power of 3 is: " + Math.pow(2, 3));
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());
        System.out.println("Hypotenuse of a right triangle with sides 3 and 4 is: " + Math.hypot(3, 4));
        System.out.println("Cube root of 27 is: " + Math.cbrt(27));

        // Problem 4: Write a Java method to compute the sum of the digits in an integer.
        System.out.print("Enter an integer to compute the sum of its digits: ");
        int digitSumNum = scanner.nextInt();
        int digitSum = computeDigitSum(digitSumNum);
        System.out.println("The sum of the digits in " + digitSumNum + " is: " + digitSum);

        scanner.close();
    }

    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static int computeDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
