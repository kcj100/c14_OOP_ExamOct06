package vehicles;

import intefaces.Driveable;
import org.example.Engine;

public class Truck extends Vehicle implements Driveable {
    public Truck(String name) {
        super(name);
    }

    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public float getPriceAfterTax() {
        return getPrice() - (getPrice() * getTAX_AMT());
    }

    @Override
    public void printSpeed() {
        System.out.println("Speed: " + getSpeed());
    }
}
