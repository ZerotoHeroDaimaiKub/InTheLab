package Lab3;

import java.util.*;

public class ConvertMoney {
    public static void main(String[] args) {
        final double usd = 31.8245;
        double thb, sum;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter US Dollars: ");
        thb = input.nextDouble();
        sum = thb * usd;

        System.out.println(sum + " THB");
    }
}
