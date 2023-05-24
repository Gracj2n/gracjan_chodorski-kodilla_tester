package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework2.PersonSources#provideStringsForTestingLength")
    public void shouldReturnBMI(Person input, String expected) {
        assertEquals(expected, input.getBMI());
    }
}