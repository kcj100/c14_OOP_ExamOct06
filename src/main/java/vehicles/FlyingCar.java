package vehicles;

import intefaces.Driveable;
import intefaces.Flyable;
import org.example.Engine;

public class FlyingCar extends Vehicle implements Driveable, Flyable {
    private final float extraTax = .05f;
    public FlyingCar(String name) {
        super(name);
    }

    public FlyingCar(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public float getPriceAfterTax() {
        return getPrice() - (getPrice() * (getTAX_AMT() + this.extraTax));
    }

    @Override
    public void printSpeed() {
        System.out.println("Speed: " + getSpeed());
    }

    @Override
    public boolean transportsPassengers() {
        return true;
    }
}
