package com.kodilla.execution_model.homework;

public class Order {
    private double value;
    private int date;
    private String login;

    public Order(double value, int date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public int getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "  ||Value: " + value + " Date: " + date + " User: " + login + "||  ";

    }
}
