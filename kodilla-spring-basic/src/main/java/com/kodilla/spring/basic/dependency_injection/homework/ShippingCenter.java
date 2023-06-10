package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendPackage(String address, double weight) {
        if(weight < 30.0) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
