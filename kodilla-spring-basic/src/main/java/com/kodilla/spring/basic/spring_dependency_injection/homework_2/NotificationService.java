package com.kodilla.spring.basic.spring_dependency_injection.homework_2;

public interface NotificationService {

    String success(String address);
        //return "Package delivered to: " + address;
    String fail(String address);
        //return "Package not delivered to: " + address;
}