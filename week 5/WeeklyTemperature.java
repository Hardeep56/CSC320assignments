
import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        for (String day : days) {
            System.out.print("Enter the average temperature for " + day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }

        while (true) {
            System.out.print("Enter a day of the week to see the temperature or type 'week' to see the weekly average: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("week")) {
                double total = 0;
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + "°C");
                    total += temperatures.get(i);
                }
                double average = total / days.size();
                System.out.println("Weekly Average Temperature: " + average + "°C");
                break;
            } else if (days.contains(input)) {
                int index = days.indexOf(input);
                System.out.println(input + ": " + temperatures.get(index) + "°C");
            } else {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
            }
        }

        scanner.close();
    }
}
