package Lab4;

import java.util.*;

public class Pay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee's name : ");
        String name = scanner.nextLine();

        System.out.println("Hours work: ");
        double hours = scanner.nextDouble();

        System.out.println("Pay rate: ");
        double payRate = scanner.nextDouble();

        System.out.print("Federal Tax withholding rate (%): ");
        double federalTaxRate = scanner.nextDouble();

        System.out.print("State tax withholding rate (%): ");
        double stateTaxRate = scanner.nextDouble();

        // Calculate Gross pay
        double grossPay = hours * payRate;

        // Calculate deductions
        double federalWithHolding = grossPay * (federalTaxRate / 100);
        double stateWithHolding = grossPay * (stateTaxRate / 100);
        double totalDeduction = federalWithHolding + stateWithHolding;

        // Calculate Net pay
        double netPay = grossPay - totalDeduction;

        // Display the payroll statement
        System.out.println("\nEmployee's name: " + name);
        System.out.println("Hours worked: " + hours + " hours");
        System.out.println("Pay rate: $" + payRate);
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal withholding (" + federalTaxRate + "%): $" + federalWithHolding);
        System.out.println("  State withholding (" + stateTaxRate + "%): $" + stateWithHolding);
        System.out.println("Total Deduction: $" + totalDeduction);
        System.out.println("Net pay: $" + netPay);

        scanner.close();

    }
}
