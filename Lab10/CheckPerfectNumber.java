package Lab10;

import java.util.*;

public class CheckPerfectNumber {

    // Returns true if n is perfect
    public static boolean isPerfect(int n) {
        // 1 is not a perfect number
        if (n == 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        if (isPerfect(number))
            System.out.println(number + " is a perfect number");
        else
            System.out.println(number + " is not a perfect number");

        scanner.close();
    }
}
