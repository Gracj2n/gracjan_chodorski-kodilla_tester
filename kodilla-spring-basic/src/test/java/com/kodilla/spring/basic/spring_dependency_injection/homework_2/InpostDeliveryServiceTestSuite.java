package com.kodilla.spring.basic.spring_dependency_injection.homework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class InpostDeliveryServiceTestSuite {
    @Test
    public void deliverPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        InpostDeliveryService bean = context.getBean(InpostDeliveryService.class);
        boolean method = bean.deliverPackage("example address", 25);
        Assertions.assertTrue(method);
    }
}