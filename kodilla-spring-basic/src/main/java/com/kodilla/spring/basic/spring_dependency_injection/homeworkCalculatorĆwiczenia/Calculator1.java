package com.kodilla.spring.basic.spring_dependency_injection.homeworkCalculatorĆwiczenia;

import org.springframework.stereotype.Component;

@Component
public class Calculator1 {
    Display1 display1;

    public Calculator1(Display1 display1) {
        this.display1 = display1;
    }

    public double add(double a, double b) {
        display1.display(a + b);
        return a + b;
    }

    public double subtract(double a, double b) {
        display1.display(a - b);
        return a - b;
    }

    public double multiply(double a, double b) {
        display1.display(a * b);
        return a * b;
    }

    public double divide(double a, double b) {
        display1.display(a / b);
        return a / b;
    }
}
