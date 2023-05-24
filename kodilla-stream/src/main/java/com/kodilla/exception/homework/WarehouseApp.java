package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1/1"));
        warehouse.addOrder(new Order("2/2"));
        warehouse.addOrder(new Order("3/3"));
        warehouse.addOrder(new Order("4/4"));

        System.out.println(warehouse.getOrder("4/4"));
    }
}
