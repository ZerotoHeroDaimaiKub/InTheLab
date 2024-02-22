package Lab7;

import java.util.*;

public class inchToCenti {
    public static void main(String[] args) {
        // Constants
        final double Inches_To_CM = 2.54;
        int startInch = 1;
        int endInch = 199;
        int step = 2;

        // Print the table header
        System.out.println("Inches\tCentimeters");

        // Loop to display the table
        while (startInch <= endInch) {
            double centimeters = startInch * Inches_To_CM;
            System.out.printf("%d\t%.2f%n", startInch, centimeters);
            startInch += step;
        }
    }
}
