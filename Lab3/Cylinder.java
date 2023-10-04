package Lab3;

import java.util.*;

public class Cylinder {
    public static void main(String[] args) {
        final double pi = 3.1428;
        double radius, length, area, volume;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        System.out.print("Enter length: ");
        length = input.nextDouble();

        area = radius * radius * pi;
        volume = area * length;

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
