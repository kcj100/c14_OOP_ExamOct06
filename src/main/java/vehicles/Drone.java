package vehicles;

import intefaces.Flyable;

public class Drone implements Flyable {
    private String name;

    public Drone(String name) {
        this.name = name;
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name + '\'' +
                ", transportsPassengers=" + transportsPassengers() +
                '}';
    }
}
