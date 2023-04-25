package com.kodilla.basic_assertion;

import com.kodilla.basic_asseration.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator testSum = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = testSum.sum(a, b);
        assertEquals(13, sumResult, 0.1);

        Calculator testSubstract = new Calculator();
        int a1 = 5;
        int b1 = 7;
        int substractResult = testSubstract.substract(a1, b1);
        assertEquals(-2, substractResult, 0.1);

        Calculator testSquared = new Calculator();
        int a2 = -5;
        int sumSquared = testSquared.squared(a2);
        assertEquals(-25, sumSquared, 0.1);
        assertEquals(0, sumSquared, 0.1);
        assertEquals(25, sumSquared, 0.1);

    }
}