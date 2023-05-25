package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources2 {
    public static Stream<Arguments> provideObjectsPersonForTestingGetBmi2() {
        return Stream.of(
                Arguments.of(new Person(1.65, 45), "Underweight")
        );
    }

}
