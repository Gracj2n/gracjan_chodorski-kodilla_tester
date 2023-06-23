package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CarConfigurationTestSuite {

//    @Test
//    public void shouldCreateSuv() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        Sedan sedan = context.getBean(Sedan.class);
//
//        String expected = sedan.getCarType();
//
//        assertEquals("Sedan", expected);
//    }
    @Test
    public void whatToChooseForSummer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        //CarConfiguration carConfiguration = (CarConfiguration) context.getBean("whatToChoose");
        Car car = context.getBean(Car.class);
        System.out.println(car);

        assertEquals(car.getCarType(),"Cabriolet");

        assertEquals(car.hasHeadlightsTurnedOn(), true);
    }

}