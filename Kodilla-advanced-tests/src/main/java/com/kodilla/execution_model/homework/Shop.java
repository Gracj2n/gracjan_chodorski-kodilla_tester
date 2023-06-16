package com.kodilla.execution_model.homework;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }


    public List<Order> getOrderListFromToDate(Instant minDate, Instant maxDate) {
        return orders
                .stream()
                .filter(order -> order.getDate().isAfter(minDate))
                .filter(order -> order.getDate().isBefore(maxDate))
                .toList();
    }
    public List<Order> getOrderByValue(double minValue, double maxValue) {
        return orders
                .stream()
                .filter(n -> n.getValue() > minValue)
                .filter(m -> m.getValue() < maxValue)
                .sorted(Comparator.comparingDouble(Order::getValue))
                .toList();
    }
    public int getNumberOfOrders() {
        return orders.size();
    }
    public double sumValueOfOrders() {
//        double sum = 0;
//        for(Order order : orders) {
//            sum = sum + order.getValue();
//        }
//        return sum;
        return orders
                .stream()
                .mapToDouble(n -> n.getValue())
                .sum();
    }

}
