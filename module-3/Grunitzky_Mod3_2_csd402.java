/*
    Xavier Grunitzky
    Module 3.2 Assignment
    1/25/26
    This program uses nested loops to display the output shown.
 */
public class Main {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            //Loop for leading spaces (alignment)
            // Adjust the multiplier (3) based on the largest number's width
            for (int j = 0; j < (rows - i - 1) * 3; j++) {
                System.out.print(" ");
            }

            //Loop for increasing powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Loop for decreasing powers of 2
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            // Align and print the "@" symbol
            // The spacing here ensures the @ stays in a vertical column
            for (int j = 0; j < (rows - i - 1) * 3; j++) {
                System.out.print("");
            }
            System.out.println("@");
        }
    }
}
