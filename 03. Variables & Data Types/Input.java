import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");
        System.out.print("Enter your weight in kilograms (e.g., 70.5): ");
        float weight = scanner.nextFloat();
        System.out.println("Your weight is " + weight + " kilograms.");
        System.out.print("Enter your student ID (long integer): ");
        long studentId = scanner.nextLong();
        System.out.println("Your student ID is " + studentId + ".");
        System.out.print("Enter your grade (byte value): ");
        byte grade = scanner.nextByte();
        System.out.println("Your grade is " + grade + ".");
        System.out.print("Enter the number of courses you are taking (short value): ");
        short courses = scanner.nextShort();
        System.out.println("You are taking " + courses + " courses.");
        System.out.print("Do you enjoy programming? (true/false): ");
        boolean enjoysProgramming = scanner.nextBoolean();
        System.out.println("Enjoys programming: " + enjoysProgramming);
        scanner.close();
    }
}

/*
 * Input in Java refers to the process of receiving data from the user or another source during the execution of a program.
 * This is typically done using classes from the java.util package, such as Scanner, or through command-line arguments.
 *
 * Common methods of input include:
 *
 * 1. Scanner Class: Allows reading of various data types (int, double, String, etc.) from standard input (keyboard).
 * 2. BufferedReader Class: Used for reading text from an input stream, often more efficient for larger inputs.
 * 3. Command-Line Arguments: Data passed to the program at the time of execution via the main method's String array parameter.
 * 4. JOptionPane Class: Provides a graphical user interface for input through dialog boxes.
 * 
 * Example using Scanner:
 * 
 * import java.util.Scanner;
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Enter an integer: ");
 * int userInput = scanner.nextInt();
 * System.out.println("You entered: " + userInput);
 * scanner.close();
 * 
 * Scanner methods include:
 * 
 * - next(): Reads a single word (up to whitespace).
 * - nextLine(): Reads a line of text.
 * - nextInt(): Reads an integer value.
 * - nextByte(): Reads a byte value.
 * - nextShort(): Reads a short value.
 * - nextLong(): Reads a long value.
 * - nextFloat(): Reads a float value.
 * - nextDouble(): Reads a double value.
 * - hasNext(): Checks if there is another token in the input.
 * - close(): Closes the scanner and releases associated resources.
 * 
 * Memory Allocation:
 * 
 * - When using input methods, memory is allocated dynamically to store the data received from the user.
 * - The data is typically stored in the heap memory, especially for objects like Strings.
 * - Primitive data types (int, byte, etc.) are stored in stack memory when declared as variables.
 * - It is important to close the input stream (like Scanner) to free up system resources after use.
 * - Proper handling of input (like checking for valid data types) is crucial to avoid runtime errors.
 * 
 */