package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.Instant.parse;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    @Test
    public void shouldAddOrder() {
        Shop shop = new Shop();

        Order order = new Order(1150, Instant.now(), "exampleLogin");

        shop.addOrder(order);

        Assertions.assertNotNull(order);
    }

    @Test
    public void shouldReturnOrderFromToDate() {
        Shop shop = new Shop();

        Order order1 = new Order(1150, Instant.parse("2020"), "exampleLogin");
        Order order2 = new Order(1150, Instant.parse("2022"), "exampleLogin");
        Order order3 = new Order(1150, Instant.parse("2023"), "exampleLogin");
        Order order4 = new Order(1150, Instant.parse("2024"), "exampleLogin");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        //shop.getOrderListFromToDate(Instant.parse("2020"), Instant.parse("2023"));
        //jaka aseracja?
    }

    @Test
    public void shouldGetOrderByValue() {
        Shop shop = new Shop();

        Order order1 = new Order(50, Instant.now(), "exampleLogin");
        Order order2 = new Order(550, Instant.now(), "exampleLogin");
        Order order3 = new Order(2150, Instant.now(), "exampleLogin");
        Order order4 = new Order(5700, Instant.now(), "exampleLogin");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        List<Order> orders = shop.getOrderByValue(350, 3000);
        //System.out.println(orders);
        //jaka aseracja?

    }
    @Test
    public void shouldReturnSumValueOfOrders() {
        Shop shop = new Shop();

        Order order1 = new Order(1150, Instant.now(), "exampleLogin");
        Order order2 = new Order(3500, Instant.now(), "exampleLogin");
        Order order3 = new Order(1100, Instant.now(), "exampleLogin");
        Order order4 = new Order(6950, Instant.now(), "exampleLogin");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        shop.sumValueOfOrders();

        assertEquals(12700, shop.sumValueOfOrders());
    }
}