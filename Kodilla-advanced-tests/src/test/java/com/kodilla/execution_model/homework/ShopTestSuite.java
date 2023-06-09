package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    public void shouldAddOrder() {
        Order order = new Order(1150, Instant.now(), "exampleLogin");

        shop.addOrder(order);

        Assertions.assertNotNull(order);
    }

    @Test
    public void shouldReturnOrderFromToDate() {
        Order order1 = new Order(1150, Instant.parse("2020-06-16T18:06:00.00Z"), "exampleLogin");
        Order order2 = new Order(1150, Instant.parse("2023-06-16T18:06:00.00Z"), "exampleLogin");
        Order order3 = new Order(1150, Instant.parse("2022-06-16T18:06:00.00Z"), "exampleLogin");
        Order order4 = new Order(1150, Instant.parse("2023-06-16T18:06:00.00Z"), "exampleLogin");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        List<Order> actualList = List.of(order2, order3, order4);
        List<Order> expectedList = shop.getOrderListFromToDate(Instant.parse("2022-01-01T00:00:00.00Z"), Instant.parse("2024-01-01T00:00:00.00Z"));

        Assertions.assertEquals(expectedList.size(), 3);
        Assertions.assertEquals(expectedList, actualList);
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

        List<Order> expectedList = shop.getOrderByValue(350, 3000);
        List<Order> actualList = List.of(order2, order3);

        Assertions.assertEquals(expectedList.size(), 2);
        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    public void shouldReturnSumValueOfOrders() {
        Order order1 = new Order(1150, Instant.now(), "exampleLogin");
        Order order2 = new Order(3500, Instant.now(), "exampleLogin");
        Order order3 = new Order(1100, Instant.now(), "exampleLogin");
        Order order4 = new Order(6950, Instant.now(), "exampleLogin");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);

        assertEquals(12700, shop.sumValueOfOrders());
    }
}