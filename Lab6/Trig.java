package Lab6;

import java.util.*;

public class Trig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter Degree: ");

        // int degree = scanner.nextInt();

        System.out.println("Choose trigonometric function: ");
        System.out.println("1. Sine");
        System.out.println("2. Cosine");
        System.out.println("3. Tangent");
        System.out.println("4. HSine");
        System.out.println("5. HCosine");
        System.out.println("6. HTangent");

        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 6) {
            System.out.print("Enter degrees: ");

            double degree = scanner.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = Math.sin(Math.toRadians(degree));
                    break;
                case 2:
                    result = Math.cos(Math.toRadians(degree));
                    break;
                case 3:
                    result = Math.tan(Math.toRadians(degree));
                    break;
                case 4:
                    result = Math.sinh(Math.toRadians(degree));
                    break;
                case 5:
                    result = Math.cosh(Math.toRadians(degree));
                    break;
                case 6:
                    result = Math.tanh(Math.toRadians(degree));
                    break;
            }

            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();

    }
}
