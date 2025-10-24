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

    public static void main(String[] args) {
        //? Print HOLLOW RECTANGLE pattern
        /*
         * * * * *
         *       *
         *       *
         * * * * *
        */

        hollow_rectangle(4, 5);
    }
}
