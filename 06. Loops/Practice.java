import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        // Write a program that reads a set of integers and then prints the sum of the even and odd integers.
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter integers (type 'exit' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            int number;
            if (input.matches("-?\\d+")) {
                number = Integer.parseInt(input);
            } else {
                System.out.println("Invalid input. Please enter an integer or 'exit' to finish.");
                continue;
            }


            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);


        // Write a program to find the factorial of a given number.
        System.out.println("Enter a number to find its factorial:");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);

        // Write a program to print the multiplication table of a given number.
        System.out.println("Enter a number to print its multiplication table:");
        int tableNum = scanner.nextInt();
        System.out.println("Multiplication table of " + tableNum + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // System.out.println(i); // This would cause a compilation error since 'i' is not defined in this scope.

        scanner.close();
    }
}

/*
 * Explanation of Variable Scopes in Java:
 * In Java, variable scope refers to the context within which a variable is accessible. The main types of variable scopes are:
 * 1. Local Variables: Variables declared within a method, constructor, or block. They are only accessible within that method, constructor, or block.
 * 2. Instance Variables: Variables declared within a class but outside any method. They are accessible by all methods in the class and are tied to the instance of the class.
 * 3. Static Variables: Variables declared with the static keyword within a class but outside any method. They are shared among all instances of the class and can be accessed without creating an instance of the class.
 * 4. Block Scope: Variables declared within a block (e.g., within curly braces {}) are only accessible within that block.
 */