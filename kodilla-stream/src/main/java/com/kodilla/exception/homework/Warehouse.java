package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> getOrder(String number) {
        List<Order> filteredOrdersByNumber = orders
                .stream()
                .filter(n -> n.equals(orders.get(Integer.parseInt(number))))
                .collect(Collectors.toList());
        return filteredOrdersByNumber;
    }
}
