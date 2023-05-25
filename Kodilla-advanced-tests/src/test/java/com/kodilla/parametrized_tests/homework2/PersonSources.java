package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> provideObjectsPersonForTestingGetBmi() {
        return Stream.of(
                Arguments.of(new Person(1.90,87), "Normal (healthy weight)"),
                Arguments.of(new Person(1.50,66), "Overweight"),
                Arguments.of(new Person(1.55,45), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80,75), "Normal (healthy weight)"),
                Arguments.of(new Person(1.87,110), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.87,-200), "Very severely underweight")
        );
    }
}
