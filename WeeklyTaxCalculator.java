
import java.util.Scanner;

public class WeeklyTaxCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for their weekly income
        System.out.print("Enter your weekly income: ");
        double weeklyIncome = scanner.nextDouble();

        // Calculate the tax rate based on the income
        double taxRate;
        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculate the tax
        double tax = weeklyIncome * taxRate;

        // Display the calculated tax
        System.out.printf("The weekly tax withholding is: $%.2f%n", tax);

        // Close the scanner
        scanner.close();
    }
}
