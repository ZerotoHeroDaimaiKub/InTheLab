package Lab6;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y: ");
        int y = scanner.nextInt();

        System.out.println("Please Select the Operator: ");
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.print("Enter: ");

        double anwser = 0;

        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                anwser = x + y;
                System.out.println("Anwser is " + anwser);
                break;
            case 2:
                anwser = x - y;
                System.out.println("Anwser is " + anwser);
                break;
            case 3:
                anwser = x * y;
                System.out.println("Anwser is " + anwser);
            case 4:
                anwser = x / y;
                System.out.println("Anwser is " + anwser);

            default:
                System.out.println("Invalid choice");
                break;
        }

        scanner.close();

    }
}
