package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public List<Order> getOrder(String number) throws OrderDoesntExistException {
        List<Order> filteredOrdersByNumber = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());
        if(filteredOrdersByNumber.size() == 0) {
            throw new OrderDoesntExistException();
        }
        return filteredOrdersByNumber;
    }
}
