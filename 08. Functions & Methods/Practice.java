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

        // Problem 2: Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
        System.out.print("Enter an integer: ");
        int testNum = scanner.nextInt();
        boolean isEven = isEven(testNum);
        System.out.println("Is " + testNum + " even? " + isEven);

        
        scanner.close();
    }

    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
