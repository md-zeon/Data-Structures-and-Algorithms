public class Patterns {

    public static void hollow_rectangle(int totalRows, int totalCols) {
        // outer loop
        for (int i = 1; i <= totalRows; i++) {
            // inner - columns
            for (int j = 1; j <= totalCols; j++) {
                // cell - (i, j)
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    // boundary cells
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_and_rotated_half_pyramid(int n) {
        int spaces = n - 1;
        int stars = 1;
        for (int line = 1; line <= n; line++) {
            // spaces 
            for (int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }
            // stars
            for (int i = 1; i <= stars; i++) {
                System.out.print("* ");
            }
            spaces--;
            stars++;
            System.out.println();
        }
    }

    public static void inverted_half_pyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= n - line + 1; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int line = 1; line <= n; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            int binaryNum = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(binaryNum+" ");
                binaryNum = binaryNum == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }


    public static void butterfly_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // stars
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            // stars
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //? Print HOLLOW RECTANGLE pattern
        /*
         * * * * *
         *       *
         *       *
         * * * * *
        */
        // hollow_rectangle(4, 5);

        //? Inverted & Rotated Half-Pyramid
        /*
              *
            * *
          * * *
        * * * * 
        */

        // inverted_and_rotated_half_pyramid(4);

        //? Inverted HALF-PYRAMID with numbers
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */ 
        // inverted_half_pyramid(5);

        //? FLOYD'S Triangle
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */ 
        // floyds_triangle(5);

        // 0 - 1 Triangle
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1 
        */
        // zero_one_triangle(5);

        //? Butterfly Pattern
        /*

         *             *
         * *         * *
         * * *     * * *
         * * * * * * * *
         * * * * * * * *
         * * *     * * *
         * *         * *
         *             *

        */

        butterfly_pattern(5);
    }
}
