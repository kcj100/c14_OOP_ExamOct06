package vehicles;

import intefaces.Driveable;
import intefaces.Flyable;
import org.example.Engine;

public class Boat extends Vehicle implements Driveable {
    private boolean hasGPS;
    public Boat(String name) {
        super(name);
    }

    @Override
    public void printVehicleType() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public float getPriceAfterTax() {
        return getPrice() - (getPrice() - getTAX_AMT());
    }

    public Boat(String name, int speed, float price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    public void printGpsInfo() {
        System.out.println("Has GPS: " + hasGPS);
    }

    @Override
    public void printSpeed() {
        System.out.println("Speed: " + getSpeed());
    }

}
