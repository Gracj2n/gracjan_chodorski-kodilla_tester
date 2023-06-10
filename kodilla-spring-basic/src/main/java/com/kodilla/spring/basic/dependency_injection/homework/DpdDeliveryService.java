package com.kodilla.spring.basic.dependency_injection.homework;

public class DpdDeliveryService implements DeliveryService {
    @Override
    public void deliverPackage(String address, double weight) {
        if(weight < 45) {
            System.out.println("Thanks for choose DPD, package sending to " + address);
        } else {
            System.out.println("Sorry DPD do not send package over 45kg. Your package: " + weight);
        }
    }
}
