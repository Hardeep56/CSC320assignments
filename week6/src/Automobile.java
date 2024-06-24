
public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private boolean isRunning;

    // Constructor
    public Automobile(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.isRunning = false;
    }

    // Method to start the automobile
    public String start() {
        // If the automobile is not already running, start it
        if (!isRunning) {
            isRunning = true;
            return "The automobile has started.";
        } else {
            return "The automobile is already running.";
        }
    }

    // Method to stop the automobile
    public String stop() {
        // If the automobile is running, stop it
        if (isRunning) {
            isRunning = false;
            return "The automobile has stopped.";
        } else {
            return "The automobile is not running.";
        }
    }

    // Method to get the details of the automobile
    public String getDetails() {
        return "Make: " + make + ", Model: " + model + ", Color: " + color + ", Year: " + year;
    }
}
