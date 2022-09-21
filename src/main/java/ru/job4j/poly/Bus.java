package ru.job4j.poly;

import java.util.concurrent.atomic.AtomicInteger;

public class Bus implements Transport {

    @Override
    public void drive() {

    }

    @Override
    public void passengers(int passengers) {
        String numberOfPassengers = "In the bus " + passengers + " passengers";
        System.out.println(numberOfPassengers);
    }

    @Override
    public int refuel(int fuel) {
        int price = 47;
        int refuelingCost = fuel * price;
        return refuelingCost;
    }
}
