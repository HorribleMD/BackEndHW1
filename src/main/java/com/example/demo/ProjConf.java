package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjConf {
    @Bean
    @Primary
    Car car1(){
        var c = new Car();
        c.setName("BMW");
        return c;
    }
    @Bean
    Car car2(){
        var c = new Car();
        c.setName("Volkswagen");
        return c;
    }
    @Bean
    Car car3(){
        var c = new Car();
        c.setName("Toyota");
        return c;
    }
    @Bean
    @Primary
    Country country(){
        var c = new Country("Germany");
        c.addCar(car1(), 150000);
        c.addCar(car2(), 300000);
        return c;
    }
    @Bean
    Country country2(){
        var c = new Country("Japan");
        c.addCar(car3(), 400000);
        return c;
    }
    
}
