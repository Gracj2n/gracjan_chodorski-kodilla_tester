package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1TestSuite {

    private ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    private Calculator bean = context.getBean(Calculator.class);
    @Test
    public void shouldAdd() {
        double numbersAdd = bean.add(10, 5);
        Assertions.assertEquals(15, numbersAdd);
    }

    @Test
    public void shouldSubtract() {
        double numbersSubstract = bean.subtract(10, 5);
        Assertions.assertEquals(5, numbersSubstract);
    }

    @Test
    public void shouldMultiply() {
        double numbersMultiply = bean.multiply(10, 5);
        Assertions.assertEquals(50, numbersMultiply);
    }

    @Test
    public void shouldDivide() {
        double numbersDivide = bean.divide(10, 5);
        Assertions.assertEquals(2, numbersDivide);
    }
}