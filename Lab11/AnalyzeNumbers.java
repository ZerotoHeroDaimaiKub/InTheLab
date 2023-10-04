package Lab11;

import java.util.*;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0; // the number of elements above average
        double max = numbers[0]; // initialize max with the first element
        double min = numbers[0]; // initialize min with the first element

        System.out.println("Entered numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]); // Display all entered numbers

            if (numbers[i] > average) {
                count++;
            }

            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger value is found
            }

            if (numbers[i] < min) {
                min = numbers[i]; // Update min if a smaller value is found
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
        System.out.println("Maximum value is " + max);
        System.out.println("Minimum value is " + min);

        input.close();
    }
}
