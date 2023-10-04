package Lab9;

import java.util.*;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = distance(x1, y1, x2, y2);

        System.out.println("Coordinates: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
        System.out.println("Distance between two points: " + distance);

        scanner.close();
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        return distance;
    }
}
