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
       Set<Integer> toLittleNumbers = new HashSet<>();
       toLittleNumbers.add(-1);
       toLittleNumbers.add(2);
       toLittleNumbers.add(50);

       Set<Integer> toManyNumbers = new HashSet<>();
       toManyNumbers.add(-1);
       toManyNumbers.add(2);
       toManyNumbers.add(50);
       toManyNumbers.add(16);
       toManyNumbers.add(30);
       toManyNumbers.add(20);
       toManyNumbers.add(12);

       Set<Integer> oneWrongNumber = new HashSet<>();
       oneWrongNumber.add(-1);
       oneWrongNumber.add(5);
       oneWrongNumber.add(34);
       oneWrongNumber.add(46);
       oneWrongNumber.add(44);
       oneWrongNumber.add(10);

       Set<Integer> zeroInNumbersSet = new HashSet<>();
       zeroInNumbersSet.add(0);
       zeroInNumbersSet.add(5);
       zeroInNumbersSet.add(34);
       zeroInNumbersSet.add(46);
       zeroInNumbersSet.add(44);
       zeroInNumbersSet.add(10);

       return Stream.of(
               Arguments.of(toLittleNumbers),   //za mało liczb
               Arguments.of(toManyNumbers),     //za dużo liczb
               Arguments.of(oneWrongNumber),    //jedna zła liczba
               Arguments.of(zeroInNumbersSet)   //liczba 0 w zbiorze
       );
   }

    @ParameterizedTest
    @MethodSource(value = "provideSetsForTesting")
    public void shouldThrowInvalidNumberException(Set<Integer> numbers) {
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));

    }
}