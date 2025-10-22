public class Patterns {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        /*
         * ? Pattern 1: Print STAR pattern
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        System.out.println("STAR PATTERN: ");
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * ? Print INVERTED-STAR pattern
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        System.out.println("INVERTED-STAR PATTERN: ");
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*
         * ? Print HALF-PYRAMID pattern
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */
        System.out.println("HALF-PYRAMID PATTERN: ");
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        /*
         * ? Print INVERTED-HALF-PYRAMID pattern
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        System.out.println("INVERTED-HALF-PYRAMID PATTERN: ");
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n - line + 1; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        /*
         ? Print CHARACTER pattern
         A
         B C
         D E F
         G H I J
         K L M N O
        */
        System.out.println("CHARACTER PATTERN: ");
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int character = 1; character <= line; character++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}