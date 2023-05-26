package com.kodilla.execution_model.homework;

import java.util.ArrayList;

public class ShopApplication {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Order order1 = new Order(350, 2021, "kkowal123");
        Order order2 = new Order(3920, 2020, "kkowal123");
        Order order3 = new Order(6320, 2023, "kkowal123");
        Order order4 = new Order(900, 2022, "kkowal123");
        Order order5 = new Order(765, 2013, "kkowal123");
        Order order6 = new Order(1240, 2023, "kkowal123");
        Order order7 = new Order(3504, 2019, "kkowal123");
        Order order8 = new Order(1502, 2018, "kkowal123");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        shop.addOrder(order8);

        System.out.println();
        System.out.println("Number of all orders: " + shop.getNumberOfOrders());

        System.out.println("Sum of all orders: " + shop.sumValueOfOrders());

        System.out.println("Order list: " + shop.getOrderListPastYear(2021));

        System.out.println("Sorted order list by Value:" + shop.getOrderByValue(500, 2500));
    }
}
