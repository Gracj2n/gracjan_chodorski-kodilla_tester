package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite2 {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework2.PersonSources2#provideObjectsPersonForTestingGetBmi2")
    public void shouldReturnBMI2(Person input, String expected) {
        assertEquals(expected, input.getBMI());
    }
}