package Lab4;

import java.util.*;

public class Area {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        final double radius = 2.57;
        final double pi = 3.1416;

        double volume = (4 / 3 * pi) * Math.pow(radius, 3);
        double surface = (4 * pi) * Math.pow(radius, 2);

        System.out.println("Sphere with radius " + radius + " inches:");
        System.out.println("Volume: " + volume + " cubic inches");
        System.out.println("Surface: " + surface + " square inches");

    }
}
