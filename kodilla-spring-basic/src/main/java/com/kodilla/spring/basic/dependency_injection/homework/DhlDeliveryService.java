package com.kodilla.spring.basic.dependency_injection.homework;

public class DhlDeliveryService implements DeliveryService {
    @Override
    public void deliverPackage(String address, double weight) {
        System.out.println("Thanks for choose DHL, package sending to" + address);
    }
}
