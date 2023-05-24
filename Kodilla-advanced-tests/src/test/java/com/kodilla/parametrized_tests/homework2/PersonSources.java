package com.kodilla.parametrized_tests.homework2;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of(new Person(1.90,87), "asd")
        );
    }
}
