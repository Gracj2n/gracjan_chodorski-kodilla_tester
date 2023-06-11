package com.kodilla.spring.basic.spring_dependency_injection.homework_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTestSuite {
    @Test
    public void shouldInpostDeliveryPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        InpostDeliveryService bean = context.getBean(InpostDeliveryService.class);
        boolean method = bean.deliverPackage("example address", 25);
        Assertions.assertTrue(method);
    }
    @Test
    public void shouldShowInpostNotificationSucces() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        InpostNotificationService bean = context.getBean(InpostNotificationService.class);
        String method = bean.success("example address");
        Assertions.assertEquals("Package delivered to: example address", method);
    }
    @Test
    public void shouldShowInpostNotificationFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        InpostNotificationService bean = context.getBean(InpostNotificationService.class);
        String method = bean.fail("example address");
        Assertions.assertEquals("Package not delivered to: example address", method);
    }
}