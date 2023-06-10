package com.kodilla.spring.basic.dependency_injection.homework;

public class DhlDeliveryService implements DeliveryService {
    @Override
    public void deliverPackage(String address, double weight) {
        if(weight < 30) {
        System.out.println("Thanks for choose DHL, package sending to " + address);
        } else {
            System.out.println("Sorry DHL do not send package over 30kg. Your package: " + weight);
        }
    }
}
