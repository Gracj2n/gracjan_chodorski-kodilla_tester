package com.kodilla.bank.homeworkV2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();
    Transaction transaction1 = new Transaction(1500);
    Transaction transaction2 = new Transaction(-2500);

    @BeforeEach
    public void setup() {
        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);
    }
    @Test
    public void shouldAddTransaction() {
        int expectedAmoutOfTransactions = List.of(transaction1, transaction2).size();
        assertEquals(expectedAmoutOfTransactions, cashMachine.getTransactionList());
    }

    @Test
    public void shoulShowSaldo() {
        assertEquals(-1000, cashMachine.showSaldo());
    }
}