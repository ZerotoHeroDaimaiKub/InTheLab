import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the sides of the triangle:");
            System.out.print("Side 1: ");
            double side1 = sc.nextDouble();
            System.out.print("Side 2: ");
            double side2 = sc.nextDouble();
            System.out.print("Side 3: ");
            double side3 = sc.nextDouble();

            // Create a Triangle object
            Triangle triangle = new Triangle(side1, side2, side3);

            // If no exception is thrown, print information about the triangle
            System.out.println("Triangle information:");
            System.out.println("Side 1: " + triangle.getSide1());
            System.out.println("Side 2: " + triangle.getSide2());
            System.out.println("Side 3: " + triangle.getSide3());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        } catch (IllegalTriangleException e) {
            // If an IllegalTriangleException is caught, print the error message
            System.out.println("Illegal Triangle");
        }
    }
}
