package Lab8;

import java.util.*;

public class FactorialCalculator {
    public static void main(String[] args) {
        int fact = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++)
            fact = fact * i;

        System.out.println("Factorial number of " + number + " is " + fact);
    }
}
