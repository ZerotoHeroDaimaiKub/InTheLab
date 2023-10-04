package Lab5;

import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");

        int hours = scanner.nextInt();
        int pay;

        if (hours <= 40) {
            pay = hours * 8;
        } else {
            pay = 320 + (hours - 40) * 12;
        }

        System.out.println("Pay: " + pay);
    }
}
