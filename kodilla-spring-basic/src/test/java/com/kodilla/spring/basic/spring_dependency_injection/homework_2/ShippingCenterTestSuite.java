package com.kodilla.spring.basic.spring_dependency_injection.homework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTestSuite {
    @Test
    public void shouldSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String method = bean.sendPackage("example address", 25);
        Assertions.assertEquals("Package delivered to: example address", method);
    }
    @Test
    public void shouldNotSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String method = bean.sendPackage("example address", 37);
        Assertions.assertEquals("Package not delivered to: example address", method);
    }

}