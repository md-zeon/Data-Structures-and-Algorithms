import java.util.*;;

public class Problems {
    public static void main(String[] args) {
        // Problem 1: Print numbers from 1 to 10
        System.out.println("Problem 1: Print numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Problem 2: Print numbers from 1 to n
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter a number n: ");
        n = scanner.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        // Print the sum of first n natural numbers
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);

        // Problem 3: Print Square Pattern
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        System.out.println("Square Pattern:");
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Problem 4: Print reverse of a number
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        int number = n;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversedNumber);


        // Problem 5: Keep taking numbers as input until the user enters a multiple of 10
        
        do {
            System.out.print("Enter a number (multiple of 10 to stop): ");
            n = scanner.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("You entered: " + n);
        } while (true);

        // Problem 6: Check if a number is prime or not
        System.out.print("Enter a number to check if it's prime: ");
        n = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (n <= 1) {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        /*
         * Prime Number Optimization Explanation:
         * To check if a number n is prime, we only need to test for factors up to √n.
         * This is because if n = a * b and both a and b are greater than √n, then a * b would be greater than n.
         * Therefore, at least one of the factors must be less than or equal to √n.
         * By checking divisibility only up to √n, we reduce the number of iterations needed,
         * making the algorithm more efficient, especially for large numbers.
         * This optimization is crucial in applications where performance is a concern.
         *
         * DRY RUN CODE:
         * For n = 29:
         * √n ≈ 5.39, so we check divisibility from 2 to 5.
         * i = 2: 29 % 2 != 0 (isPrime remains true)
         * i = 3: 29 % 3 != 0 (isPrime remains true)
         * i = 4: 29 % 4 != 0 (isPrime remains true)
         * i = 5: 29 % 5 != 0 (isPrime remains true)
         * 
         * Since no divisors were found, 29 is prime.
         * 
         * FOR N = 2;
         * √n = 1.41, so we do not enter the loop.
         * Since n <= 1 condition is false, isPrime remains true.
         * Thus, 2 is prime.
         * 
         * FOR N = 1;
         * √n = 1, so we do not enter the loop.
         * Since n <= 1 condition is true, isPrime is set to false.
         * Thus, 1 is not prime.
         * 
         * FOR N = 113;
         * √n ≈ 10.63, so we check divisibility from 2 to 10.
         * i = 2: 113 % 2 != 0 (isPrime remains true)
         * i = 3: 113 % 3 != 0 (isPrime remains true)
         * i = 4: 113 % 4 != 0 (isPrime remains true)
         * i = 5: 113 % 5 != 0 (isPrime remains true)
         * i = 6: 113 % 6 != 0 (isPrime remains true)
         * i = 7: 113 % 7 != 0 (isPrime remains true)
         * i = 8: 113 % 8 != 0 (isPrime remains true)
         * i = 9: 113 % 9 != 0 (isPrime remains true)
         * i = 10: 113 % 10 != 0 (isPrime remains true)
         *
         * Since no divisors were found, 113 is prime.
         */

        scanner.close();
    }
}
