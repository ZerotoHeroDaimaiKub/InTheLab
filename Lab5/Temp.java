package Lab5;

import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversion formula: ");
        System.out.println("C - Fahrenheit to Celcius");
        System.out.println("F - Celcius to Fahrenheit");
        System.out.print("Enter your choice: ");

        char choice = scanner.next().toUpperCase().charAt(0);

        double result;

        if (choice == 'C') {
            System.out.print("Enter Fahrenheit: ");
            double fah = scanner.nextDouble();
            result = (fah - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + result + " °C");
        } else if (choice == 'F') {
            System.out.print("Enter celcius: ");
            double cel = scanner.nextDouble();
            result = (9 * cel / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + result + " °F");
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
