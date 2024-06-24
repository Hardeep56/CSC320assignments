
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Automobile
        Automobile myCar = new Automobile("Toyota", "Corolla", "Red", 2021);

        // Starting the car
        System.out.println(myCar.start());

        // Trying to start the car again
        System.out.println(myCar.start());

        // Getting the details of the car
        System.out.println(myCar.getDetails());

        // Stopping the car
        System.out.println(myCar.stop());

        // Trying to stop the car again
        System.out.println(myCar.stop());
    }
}
