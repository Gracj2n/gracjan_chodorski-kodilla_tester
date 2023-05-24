package com.kodilla.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.event.WindowFocusListener;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }
    @Test
    public void shoudlAddItemsToInvoice() {
        //When
        int numberOfItems = invoice.getSize();

        //Then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetItemFromInvoice() {
        //When
        Item result = invoice.getItem(1);

        //Then
        assertEquals("Eggs", result.getName());
        assertEquals(8.00, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //When
        Item result = invoice.getItem(-4);

        //Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //When
        invoice.clear();

        //Then
        assertEquals(0, invoice.getSize());
    }
}