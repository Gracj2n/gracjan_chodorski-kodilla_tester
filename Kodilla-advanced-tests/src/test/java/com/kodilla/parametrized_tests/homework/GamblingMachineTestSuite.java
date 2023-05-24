package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

   private static Stream<Arguments> provideSetsForTesting() {
       Set<Integer> zaMaloLiczb = new HashSet<>();
       zaMaloLiczb.add(-1);
       zaMaloLiczb.add(2);
       zaMaloLiczb.add(50);

       Set<Integer> zaDuzoLiczb = new HashSet<>();
       zaDuzoLiczb.add(-1);
       zaDuzoLiczb.add(2);
       zaDuzoLiczb.add(50);
       zaDuzoLiczb.add(16);
       zaDuzoLiczb.add(30);
       zaDuzoLiczb.add(20);
       zaDuzoLiczb.add(12);
       return Stream.of(
               Arguments.of(zaMaloLiczb),   //za mało liczb
               Arguments.of(zaDuzoLiczb)   //za dużo liczb

       );
   }

    @ParameterizedTest
    @MethodSource(value = "provideSetsForTesting")
    public void shouldThrowInvalidNumberException(Set<Integer> numbers) {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));

    }
}