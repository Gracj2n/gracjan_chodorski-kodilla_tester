package com.kodilla.spring.basic.spring_dependency_injection.homeworkCalculatorĆwiczenia;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1TestSuite {
    private ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    private Calculator1 bean = context.getBean(Calculator1.class);

    @Test
    void shouldAdd() {
       assertEquals(14, bean.add(7, 7));
    }

    @Test
    void shouldSubtract() {
        assertEquals(10, bean.subtract(20, 10));
    }

    @Test
    void shouldMultiply() {
        assertEquals(40, bean.multiply(5, 8));
    }

    @Test
    void shouldDivide() {
        assertEquals(35, bean.divide(70, 2));
    }
}