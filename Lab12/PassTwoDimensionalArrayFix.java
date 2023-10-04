package Lab12;

import java.util.*;

public class PassTwoDimensionalArrayFix {
    public static void main(String[] args) {
        int[][] m = getArray(); // Get an array

        // Display all numbers in the array
        displayArray(m);

        // Display the sum of elements
        System.out.println("Sum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Enter array values
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                m[i][j] = input.nextInt();

        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                total += m[row][column];
            }
        }

        return total;
    }

    public static void displayArray(int[][] m) {
        System.out.println("The numbers in the array are:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}