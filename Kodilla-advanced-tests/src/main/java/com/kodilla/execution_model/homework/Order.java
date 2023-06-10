package com.kodilla.execution_model.homework;

import java.time.Instant;

public class Order {
    private double value;
    private Instant date;
    private String login;

    public Order(double value, Instant date, String login) {
        this.value = value;
        this.date = date;
        this.login = login;
    }

    public double getValue() {
        return value;
    }

    public Instant getDate() {
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
