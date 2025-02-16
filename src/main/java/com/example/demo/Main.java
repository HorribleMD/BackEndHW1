package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjConf.class);

        Car car = context.getBean(Car.class); 

        Country country = context.getBean(Country.class);

        System.out.println("Country: " + country.getName());

        System.out.println("Car: " + car.getName());

        country.printCars();
    }
    
}
