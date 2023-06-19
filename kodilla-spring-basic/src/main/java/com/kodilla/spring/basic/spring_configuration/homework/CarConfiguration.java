package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Cat;
import com.kodilla.spring.basic.spring_configuration.Dog;
import com.kodilla.spring.basic.spring_configuration.Duck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarConfiguration {
    @Bean
    public Suv setSuv() { return new Suv(); }

    @Bean
    public Sedan setSedan() { return new Sedan(); }

    @Bean
    public Cabriolet setCabriolet() { return new Cabriolet(); }

    @Bean
    public Car whatToChoose(String weather) {
        Car car = null;
        if (weather == "Summer") {
            car = new Cabriolet();
        } else if (weather == "Spring") {
            car = new Suv();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
