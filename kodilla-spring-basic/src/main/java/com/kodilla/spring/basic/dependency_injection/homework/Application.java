package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService DhlDeliveryService = new DhlDeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(DhlDeliveryService);
        shippingCenter.sendPackage("Hill Street 11, New York", 25.0);
    }
}

