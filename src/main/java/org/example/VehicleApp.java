package org.example;

import intefaces.Driveable;
import intefaces.Flyable;
import vehicles.Vehicle;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparingInt;

public class VehicleApp {
    public static void printListOfVehiclesNames(List<Vehicle> vehicles) {
        vehicles.forEach(i -> System.out.println(i.getName()));
    }

    public static void printListOfFlyableObjects(List<Flyable> vehicles) {
        vehicles.forEach(System.out::println);
    }

    public static void sortAndPrintDriveableVehiclesBySpeed(List<Driveable> driveables) {
        driveables.sort(SPEEDCOMPARATOR);
        System.out.println(driveables);
    }

    private static final Comparator<Driveable> SPEEDCOMPARATOR =
    comparingInt((Driveable d) -> ((Vehicle) d).getSpeed());

    public static void printPassengerNumbersOnly(Map<Integer, String> passengers) {
        for (int number : passengers.keySet()) {
            System.out.println(number);
        }
    }
}
