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
}
