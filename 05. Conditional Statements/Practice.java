public class Practice {
    public static void main(String[] args) {
        // ? Question 1: Write a Java program to get a number from the user and print whether it is positive or negative.
        int number = -10; // Example input
        if (number >= 0) {
            System.out.println(number + " is positive.");
        } else {
            System.out.println(number + " is negative.");
        }

        // ? Question 2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }


        // ? Question 3: Write a Java program to input week number (1-7) and print day of week name using switch case.
        int weekNumber = 3; // Example input
        switch (weekNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week number.");
                break;
        }

        // ? Question 4: What will be the value of x & y in the following program:
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false; // x will be false
        int y = (a > b) ? a : b; // y will be 63
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);

        // ? Question 5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        int year = 2020; // Example input
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        /*
         * Explanation for Question 5:
         * A year is a leap year if it is divisible by 4. However, if the year is divisible by 100,
         * it is not a leap year unless it is also divisible by 400. This means:
         * - Years like 2020 and 2016 are leap years (divisible by 4 but not by 100).
         * - Years like 1900 are not leap years (divisible by 100 but not by 400).
         * - Years like 2000 are leap years (divisible by 400).
         * This rule helps to keep our calendar year synchronized with the astronomical year.
         */

        //  ? Question 6: Write a Java program implementing a traffic light system using switch case.
        String trafficLight = "Yellow"; // Example input
        switch (trafficLight) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid traffic light color.");
                break;  
        }

    }
}