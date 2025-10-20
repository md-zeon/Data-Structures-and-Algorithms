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
    }
}