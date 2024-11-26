package carProperties;

public class CarsApp {
    public static void main(String[] args) {
        System.out.println("Program started.");


        Car car1 = new Car("Corolla", 150);
        Car car2 = new Car("Yaris", 110);

        // Display information about car1
        System.out.println("Brand: " + Car.getBrand());
        System.out.println("Model: " + Car.getModel());
        System.out.println("Power of car1: " + car1.getPower() + " HP");

        // Display information about car2
        System.out.println("\nAnother car instance:");
        System.out.println("Brand: " + Car.getBrand());
        System.out.println("Model: " + Car.getModel());
        System.out.println("Power of car2: " + car2.getPower() + " HP");


        car1.accelerate();
        Car.brake();

        System.out.println("Program ended.");
    }
}
