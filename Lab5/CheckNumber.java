package Lab5;

import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println("The first number is greater than the second.");
        } else if (firstNum < secondNum) {
            System.out.println("The first number is no greater than the second");
        } else {
            System.out.println("These two number are equal");
        }

        scanner.close();
    }
}
