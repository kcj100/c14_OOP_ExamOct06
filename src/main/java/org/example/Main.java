package org.example;

import intefaces.Flyable;
import vehicles.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Engine largeEngine = new Engine(Size.LARGE);
        Engine mediumEngine = new Engine(Size.MEDIUM);
        Engine smallEngine = new Engine(Size.SMALL);
        Car car1 = new Car("Lamborghini", 200, 200000.00f, largeEngine, 2);
        Boat boat1 = new Boat("Yacht", 130, 120000.00f, mediumEngine, true);
        FlyingCar flyingCar1 = new FlyingCar("Delorean", 80, 500000.00f, smallEngine);
        Plane plane1 = new Plane("Blackbird", 3000, 10000000, largeEngine);
        Truck truck1 = new Truck("Silverado", 110, 50000, largeEngine);
        Drone drone = new Drone("Dji mini 3");

        Vehicle[] vehicleArray = new Vehicle[]{car1, boat1, flyingCar1, plane1, truck1};
        ArrayList<Vehicle> vehicles = new ArrayList<>(Arrays.asList(vehicleArray));

        VehicleApp.printListOfVehiclesNames(vehicles);

        Flyable[] flyableArray = new Flyable[]{plane1, drone, flyingCar1};
        ArrayList<Flyable> flyables = new ArrayList<>(Arrays.asList(flyableArray));
        System.out.println();

        VehicleApp.printListOfFlyableObjects(flyables);

        Passenger passengers = new Passenger();
        passengers.info.put(57, "wesley snipes");
        passengers.info.put(007, "james bond");
        for (Map.Entry<Integer, String> entry : passengers.info.entrySet()) {
            System.out.println(entry.getKey());
        }

        System.out.println(car1.getPriceAfterTax());
        System.out.println(formattedPriceAfterTax(car1.getPriceAfterTax()));

    }

    public static String formattedPriceAfterTax(float price) {
        return String.format("%.2f", price);
    }
}