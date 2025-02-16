package com.example.demo;

import java.util.HashMap;
import java.util.Map;


public class Country {
    private String name;
    private Map<Car, Integer> cars;

    public Country(String name) {
        this.name = name;
        this.cars = new HashMap<>();
    }

    public void addCar(Car car, int prod) {
        cars.put(car, prod);
    }

    public int getCarProd(Car car) {
        return cars.get(car);
    }

    public Map<Car, Integer> getCars() {
        return new HashMap<>(cars);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printCars() {
        int total = 0;
        System.out.println("Car Production in " + name + ":");
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            total += entry.getValue();
            System.out.println("Producer: " + entry.getKey().getName() + ", Yearly Production: " + entry.getValue());
        }
        System.out.println("Total Production: " + total);
    }
}