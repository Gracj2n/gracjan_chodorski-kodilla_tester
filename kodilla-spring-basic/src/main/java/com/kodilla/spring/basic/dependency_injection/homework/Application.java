package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService DhlDeliveryService = new DhlDeliveryService();
        DeliveryService DpdDeliverService = new DpdDeliveryService();

        ShippingCenter shippingCenter1 = new ShippingCenter(DhlDeliveryService);
        ShippingCenter shippingCenter2 = new ShippingCenter(DpdDeliverService);

        shippingCenter1.sendPackage("Hill Street 11, New York", 25.0);
        shippingCenter2.sendPackage("Duck Street 45C,  New York", 27.5);
    }
}

