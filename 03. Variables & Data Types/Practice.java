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

        // ? Question 2: In a program, input the side of a square. You have to output the area of the square.
        System.out.print("Enter the side of the square: ");
        float side = scanner.nextFloat();
        float area = side * side;
        System.out.println("Area of the square = " + area);

        // ? Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        System.out.print("Enter cost of pencil: ");
        float pencilCost = scanner.nextFloat();
        System.out.print("Enter cost of pen: ");
        float penCost = scanner.nextFloat();
        System.out.print("Enter cost of eraser: ");
        float eraserCost = scanner.nextFloat();

        float totalCost = pencilCost + penCost + eraserCost;
        System.out.println("Total cost = " + totalCost);

        // Adding 18% GST
        float gst = totalCost * 0.18f;
        System.out.println("Total cost after 18% GST = " + (totalCost + gst));

        scanner.close();
    }
}
