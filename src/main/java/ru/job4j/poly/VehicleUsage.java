package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle train = new Train();
        Vehicle autobus = new Autobus();
        Vehicle[] vehicles = new Vehicle[]{aircraft, train, autobus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
