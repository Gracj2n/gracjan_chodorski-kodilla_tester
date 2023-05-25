package com.kodilla.exception.homework;

import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testIsOrderInUse() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0001/25.05.2023"));
        // when
        List<Order> isOrderInUse = warehouse.getOrder("0001/25.05.2023");
        List<Order> expectedOrder = new ArrayList<>();
        expectedOrder.add(new Order("0001/25.05.2023"));
        // then
        assertEquals(expectedOrder, isOrderInUse);
    }

    @Test
    public void testIsOrderInUse_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0001/24.05.2023"));
        // when

        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0002/24.05.2023"));
    }

}