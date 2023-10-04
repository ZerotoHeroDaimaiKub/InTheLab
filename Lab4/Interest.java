package Lab4;

import java.util.*;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");

        double investmentAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate: ");

        double annualRate = scanner.nextDouble();

        System.out.print("Enter years: ");

        int years = scanner.nextInt();

        // Calculate monthly interest rate
        double monthlyInterestRate = annualRate / 12 / 100;

        double futureInvestment = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        System.out.println("Future investment value is " + futureInvestment);

        scanner.close();

    }
}
