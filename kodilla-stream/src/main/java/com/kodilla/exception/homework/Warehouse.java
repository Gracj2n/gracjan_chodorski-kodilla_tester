package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Warehouse {
    //private List<Order> orders;
    public Order addOrder(Order order) {
//        List<Order> orders = new ArrayList<>();
//        orders.get(1);
        System.out.println("Dodano zamówienie: " + order.getNumber());
        return order;
    }
    public Order getOrder(String number) {



        return null;
    }
}
