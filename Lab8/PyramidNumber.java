package Lab8;

import java.util.*;

public class PyramidNumber {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("   ");
            }

            // Print numbers in the pyramid
            for (int j = 1; j <= i; j++) {
                int power = (int) Math.pow(2, j - 1);
                System.out.printf("%4d", power);
            }

            // Print numbers in reverse order
            for (int j = i - 1; j >= 1; j--) {
                int power = (int) Math.pow(2, j - 1);
                System.out.printf("%4d", power);
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }
}
