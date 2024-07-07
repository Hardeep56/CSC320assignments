import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Automobile auto = new Automobile("Toyota", "Camry", "Blue", 2020, 15000);

        try {
            // List the values
            System.out.println("Listing vehicle:");
            printVehicle(auto.listVehicle());

            // Remove the vehicle
            System.out.println("\nRemoving vehicle:");
            System.out.println(auto.removeVehicle());

            // Add a new vehicle
            System.out.println("\nAdding a new vehicle:");
            System.out.println(auto.addVehicle("Honda", "Civic", "Red", 2021, 10000));

            // List the new vehicle information
            System.out.println("\nListing new vehicle:");
            printVehicle(auto.listVehicle());

            // Update the vehicle
            System.out.println("\nUpdating vehicle:");
            System.out.println(auto.updateVehicle("Ford", "Mustang", "Black", 2022, 5000));

            // List the updated vehicle information
            System.out.println("\nListing updated vehicle:");
            printVehicle(auto.listVehicle());

            // Ask the user if they want to print the information to a file
            System.out.print("\nDo you want to print the vehicle information to a file? (Y/N): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                System.out.println(auto.printToFile("C:\\Temp\\Autos.txt"));
            } else {
                System.out.println("Information will not be printed to a file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }

    // Helper method to print vehicle information
    public static void printVehicle(String[] vehicleInfo) {
        for (String info : vehicleInfo) {
            System.out.println(info);
        }
    }
}

