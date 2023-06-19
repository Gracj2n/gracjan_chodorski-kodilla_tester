package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        Car car;
        if (weather == "Summer") {
            //car = new Cabriolet();
            return setCabriolet();
        } else if (weather == "Winter"){
            //car = new Suv();
            return setSuv();
        } else {
            //car = new Sedan();
            return setSedan();
        }
        //return car;
    }
}
