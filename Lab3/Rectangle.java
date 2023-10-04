package Lab3;

import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        double length, width, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextDouble();
        System.out.print("Enter width: ");
        width = input.nextDouble();
        area = length * width;
        System.out.println("The are of rectangle is " + area);
    }
}
