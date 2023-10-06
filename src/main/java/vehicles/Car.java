package vehicles;

import intefaces.Driveable;
import org.example.Engine;

public class Car extends Vehicle implements Driveable {
    private int numberOfDoors;
    private final float extraTax = .05f;

    public Car(String name, int numberOfDoors) {
        super(name);
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String name, int speed, float price, Engine engine, int numberOfDoors) {
        super(name, speed, price, engine);
        this.numberOfDoors = numberOfDoors;
    }

    public void printNumberOfDoors() {
        System.out.println("Number of doors: " + this.numberOfDoors);
    }

    @Override
    public void printSpeed() {
        System.out.println("Speed: " + getSpeed());
    }

    @Override
    public void printVehicleType() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public float getPriceAfterTax() {
        return getPrice() - (getPrice() * (getTAX_AMT() + this.extraTax));
    }
}
