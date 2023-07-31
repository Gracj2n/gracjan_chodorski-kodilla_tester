package com.kodilla.bank.homeworkV2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();
    Transaction transaction1 = new Transaction(1500);
    Transaction transaction2 = new Transaction(-2500);
    Transaction transaction3 = new Transaction(16500);
    Transaction transaction4 = new Transaction(3700);
    Transaction transaction5 = new Transaction(-500);

    @BeforeEach
    public void setup() {
        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);
        cashMachine.addTransaction(transaction3);
        cashMachine.addTransaction(transaction4);
        cashMachine.addTransaction(transaction5);
    }

    @Test
    public void shouldAddTransaction() {
        int expectedAmoutOfTransactions = List.of(transaction1, transaction2, transaction3, transaction4, transaction5).size();
        assertEquals(expectedAmoutOfTransactions, cashMachine.getTransactionList());
    }

    @Test
    public void shoulShowSaldo() {
        assertEquals(18700, cashMachine.showSaldo());
    }

    @Test
    public void shouldReturnSumOfDeposits() {
        assertEquals(3, cashMachine.sumOfDeposits());
    }

    @Test
    public void shouldReturnSumOfWithdrawls() {
        assertEquals(2, cashMachine.sumOfWithdrawls());
    }
}