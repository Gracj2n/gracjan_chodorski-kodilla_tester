package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("0001/24.05.2023"));
        warehouse.addOrder(new Order("0002/24.05.2023"));
        warehouse.addOrder(new Order("0003/24.05.2023"));
        warehouse.addOrder(new Order("0004/24.05.2023"));
        warehouse.addOrder(new Order("0005/24.05.2023"));
        warehouse.addOrder(new Order("0006/24.05.2023"));
        warehouse.addOrder(new Order("0007/24.05.2023"));

        System.out.println(warehouse.getOrder("0003/24.05.2023"));
        System.out.println(warehouse.getOrder("1008/24.05.2023")); //Wyjątek
    }
}
