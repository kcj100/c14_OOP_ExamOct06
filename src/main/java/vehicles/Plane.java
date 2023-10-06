package vehicles;

import intefaces.Flyable;
import org.example.Engine;

public class Plane extends Vehicle implements Flyable {
    public Plane(String name) {
        super(name);
    }

    public Plane(String name, int speed, float price, Engine engine) {
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
    public boolean transportsPassengers() {
        return true;
    }
}
