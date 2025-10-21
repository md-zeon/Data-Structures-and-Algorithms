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

        // ? Question 4: Find out the output of the following code snippet:
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println("Output of the code snippet = " + result);
        /*
         * Explanation:
         * f * b = 3.14 * 4 = 12.56
         * i / c = 1000 / 97 (ASCII value of 'a') = 10.309278350515464
         * d * s = 99.9954 * 512 = 51197.3248
         * Therefore, result = 12.56 + 10.309278350515464 - 51197.3248 = -51174.45552164948454
         */

        // ? Question 5: Will the following code snippet give any error? If yes, why?

        int $ = 24;
        System.out.println("$ = " + $);
        // No error will occur. In Java, variable names can start with a letter, underscore (_), or dollar sign ($).


        scanner.close();
    }
}
