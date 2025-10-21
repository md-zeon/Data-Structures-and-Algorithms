public class Practice {
    public static void main(String[] args) {
        // What is the output of the following code snippets?

        // Snippet 1
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.println("Snippet 1:");
        System.out.println("exp1: " + exp1); // Output: 5
        System.out.println("exp2: " + exp2); // Output: 4

        // Snippet 2
        x = 200;
        y = 50;
        int z = 100;

        System.out.println("Snippet 2:");
        if (x > y && y > z) {
            System.out.println("Hello");
        }

        if (x > y && z < x) {
            System.out.println("Java"); // This will print
        }

        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }

        // Snippet 3
        x = y = z = 2;

        x += y;
        y -= z;
        z /= (x + y);
        System.out.println("Snippet 3:");
        System.out.println("x: " + x); // Output: 4
        System.out.println("y: " + y); // Output: 0
        System.out.println("z: " + z); // Output: 0

        // Snippet 4
        x = 9;
        y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
        System.out.println("Snippet 4:");
        System.out.println("exp: " + exp); // Output: 278
        /*
         * Explanation:
         * Step 1: 4 / 3 = 1 (integer division)
         * Step 2: (x + 34) = (9 + 34) = 43
         * Step 3: 1 * 43 = 43
         * Step 4: b * c = 4 * 6 = 24
         * Step 5: a + b * c = 2 + 24 = 26
         * Step 6: 9 * (a + b * c) = 9 * 26 = 234
         * Step 7: y * (2 + a) = 12 * (2 + 2) = 12 * 4 = 48
         * Step 8: 3 + y * (2 + a) = 3 + 48 = 51
         * Step 9: a + b * y = 2 + 4 * 12 = 2 + 48 = 50
         * Step 10: (3 + y * (2 + a)) / (a + b * y) = 51 / 50 = 1 (integer division)
         * Step 11: Final calculation: 43 + 234 + 1 = 278
         * Final Output: 278
         */
    }
}
