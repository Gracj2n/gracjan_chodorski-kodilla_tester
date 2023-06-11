package com.kodilla.spring.basic.spring_dependency_injection.homework_2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class InpostNotificationService implements NotificationService {
    @Override
    public String success(String address) {
        return "Package delivered to: " + address;
    }
    @Override
    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
