package vehicles;

import org.example.Engine;
import org.example.Product;

public abstract class Vehicle extends Product {
    private int speed;
    private float price;
    private Engine engine;
    protected final float TAX_AMT = 0.10f;

    public Vehicle(String name) {
        super(name);
    }

    public Vehicle(String name, int speed, float price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }

    public abstract void printVehicleType();

    public abstract float getPriceAfterTax();

    public int getSpeed() {
        return speed;
    }

    public float getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public float getTAX_AMT() {
        return TAX_AMT;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{speed=" + speed +
                ", price=" + price +
                ", engine=" + engine +
                ", TAX_AMT=" + TAX_AMT +
                '\'' +
                "} ";
    }
}
