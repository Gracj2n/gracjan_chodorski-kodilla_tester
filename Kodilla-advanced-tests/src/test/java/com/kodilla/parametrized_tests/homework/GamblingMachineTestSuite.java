package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();


//    @ParameterizedTest
//    @CsvFileSource(resources = "/stringToGamblingMachine", numLinesToSkip = 1)
    @Test
    public void shouldReturnCount() throws InvalidNumbersException {
        Set<Integer> gra = new HashSet<>();
        gra.add(1);
        gra.add(6);
        gra.add(5);
        gra.add(4);
        gra.add(3);
        gra.add(8);
        gamblingMachine.howManyWins(gra);
    }
}