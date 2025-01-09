import java.util.Scanner;

public class demo020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Monthly gross salary, HRA, and PF
        System.out.print("Enter your monthly gross salary (Rs): ");
        double monthlyGrossSalary = scanner.nextDouble();

        System.out.print("Enter your monthly HRA (Rs): ");
        double monthlyHRA = scanner.nextDouble();

        System.out.print("Enter your monthly PF (Rs): ");
        double monthlyPF = scanner.nextDouble();

        // Calculate annual salary and deductions
        double annualSalary = monthlyGrossSalary * 12;
        double annualHRA = monthlyHRA * 12;
        double annualPF = monthlyPF * 12;

        double deductions = annualHRA + annualPF;
        double taxableIncome = annualSalary - deductions;

        // Calculate tax
        double tax = 0;

        if (taxableIncome <= 500000) {
            tax = 0.10 * taxableIncome;
        } else if (taxableIncome <= 1000000) {
            tax = (0.10 * 500000) + (0.20 * (taxableIncome - 500000));
        } else {
            tax = (0.10 * 500000) + (0.20 * 500000) + (0.30 * (taxableIncome - 1000000));
        }

        // Display results
        System.out.println("\n=== Annual Tax Calculation ===");
        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Annual Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Annual Income Tax: Rs " + tax);

        scanner.close();
    }
}
