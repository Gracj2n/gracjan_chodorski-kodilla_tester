package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService;
    public ShippingCenter(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendPackage(String address, double weight) {
        deliveryService.deliverPackage(address, weight);
    }
}
