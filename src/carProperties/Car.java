package carProperties;

public class Car {
    private static final String brand = "Toyota";
    private static String model;
    private final int power;


    public Car(String model, int power) {
        Car.model = model;
        this.power = power;
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    public static void brake() {
        System.out.println("The vehicle is braking.");
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }
}
