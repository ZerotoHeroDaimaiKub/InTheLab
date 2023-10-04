package Lab9;

import java.util.*;

public class FahtoCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Temperature Converter ---------");
        System.out.println("1. Fah -> Cel");
        System.out.println("2. Cel -> Fah");
        System.out.print("Choose f, c, or exit : ");

        String input = scanner.nextLine();

        if (input.equals("f")) {
            System.out.print("Enter Fahrenheit: ");
            var temp = scanner.nextDouble();
            var ftoH = FahtoCel(temp);
            System.out.println("Convert Fahrenheit to Celcius : " + ftoH);
        } else if (input.equals("c")) {
            System.out.print("Enter Celcius: ");
            var temp = scanner.nextDouble();
            var ctoF = CeltoFah(temp);
            System.out.println("Convert Celcius to Fahrenheit : " + ctoF);

        } else if (input.equals("exit")) {
            System.out.println("Exit..");
            System.exit(0);
        } else {
            System.out.println("Incorrect Input !");
        }

        scanner.close();
    }

    public static double FahtoCel(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public static double CeltoFah(double temp) {
        return (9 * temp / 5) + 32;
    }

}
