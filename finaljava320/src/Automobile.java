import java.io.FileWriter;
import java.io.IOException;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    // Default constructor
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    // Parameterized constructor
    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    // Method to add a new vehicle
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }

    // Method to list vehicle information
    public String[] listVehicle() {
        try {
            return new String[]{
                    "Make: " + this.make,
                    "Model: " + this.model,
                    "Color: " + this.color,
                    "Year: " + this.year,
                    "Mileage: " + this.mileage
            };
        } catch (Exception e) {
            return new String[]{"Failed to list vehicle information: " + e.getMessage()};
        }
    }

    // Method to remove a vehicle
    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    // Method to update vehicle attributes
    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }

    // Method to print vehicle information to a file
    public String printToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Make: " + this.make + "\n");
            writer.write("Model: " + this.model + "\n");
            writer.write("Color: " + this.color + "\n");
            writer.write("Year: " + this.year + "\n");
            writer.write("Mileage: " + this.mileage + "\n");
            return "Information printed to file successfully.";
        } catch (IOException e) {
            return "Failed to print to file: " + e.getMessage();
        }
    }
}
