public class PatternPrint {
    public static void main(String[] args) {
        int rows = 10; // Number of rows in the pattern

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            int num = i;

            // Print the first number in the row
            System.out.print(num + " ");

            // Inner loop for columns
            for (int j = 1; j <= 9; j++) {
                if (j <= 9) {
                    // Print the next number in the row
                    num += 10;
                    System.out.print(num + " ");
                } else {
                    // Print spaces to align the numbers
                    System.out.print("  ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}