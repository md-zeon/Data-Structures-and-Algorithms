public class Loops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);

    }
}

/*
 * Loops in Java
 * ==========================================
 * Loops are used to execute a block of code repeatedly until a certain condition is met.
 * Java provides three types of loops:
 * 1. For Loop
 * 2. While Loop
 * 3. Do-While Loop
 * =========================================
 * 1. For Loop:
 *    - Syntax:
 *      for (initialization; condition; update) {
 *          // code to be executed
 *      }
 *   - Note: The for loop is typically used when the number of iterations is known beforehand.
 * =========================================
 * 2. While Loop:
 *    - Syntax:
 *      while (condition) {
 *          // code to be executed
 *      }
 *   - Note: The while loop is used when the number of iterations is not known and depends on a condition.
 * =========================================
 * 3. Do-While Loop:
 *    - Syntax:
 *      do {
 *          // code to be executed
 *      } while (condition);
 *   - Note: The do-while loop guarantees that the code block is executed at least once before checking the condition.
 * =========================================
 * Key Points:
 * - Use loops to avoid code repetition and to handle repetitive tasks efficiently.
 * - Always ensure that the loop has a terminating condition to prevent infinite loops.
 * =========================================
 * Infinite Loops:
 * - An infinite loop occurs when the terminating condition is never met. This can happen if the loop's condition always evaluates to true.
 * - Example of an infinite loop:
 *   while (true) {
 *       // code that runs forever
 *   }
 * - To avoid infinite loops, ensure that the loop's condition will eventually evaluate to false.
 * ========================================= 
 */
