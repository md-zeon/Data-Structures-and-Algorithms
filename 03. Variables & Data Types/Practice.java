import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ^ Question 1: In a program, input 3 numbers: A,B and C.You have to output the average of these 3 numbers.
        System.out.print("Enter A: ");
        float A = scanner.nextFloat();
        System.out.print("Enter B: ");
        float B = scanner.nextFloat();
        System.out.print("Enter C: ");
        float C = scanner.nextFloat();
        
        double average = (A + B + C) / 3;

        System.out.println("Average = " + average);
    }
}
