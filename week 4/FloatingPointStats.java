
import java.util.Scanner;

public class FloatingPointStats {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Define variables
        double total = 0;
        int count = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double interestRate = 0.20;

        // While loop to read 5 floating-point values
        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                count++;
                if (count == 1) {
                    max = value;
                    min = value;
                } else {
                    if (value > max) {
                        max = value;
                    }
                    if (value < min) {
                        min = value;
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter a floating-point value.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Calculate average and interest
        double average = total / 5;
        double interest = total * interestRate;

        // Display results
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", max);
        System.out.printf("Minimum: %.2f%n", min);
        System.out.printf("Interest on total at 20%%: %.2f%n", interest);

        // Close the scanner
        scanner.close();
    }
}
