package com.kodilla.bank.homeworkV2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    public void shouldAddTransaction() {
        CashMachine cashMachine = new CashMachine();
        Transaction transaction1 = new Transaction(1500);
        Transaction transaction2 = new Transaction(2500);

        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);

        List<Transaction> expectedList = List.of(transaction1, transaction2);
        assertEquals(cashMachine.getTransactionList(), expectedList);
//        int expectedValueTransaction1 = transaction1.getValue();
//        assertEquals(1500, expectedValueTransaction1);
//
//        int expectedValueOfTwoTransaction = transaction1.getValue() + transaction2.getValue();
//        assertEquals(4000, expectedValueOfTwoTransaction);
    }

    @Test
    public void shoulShowSaldo() {
        CashMachine cashMachine = new CashMachine();
        Transaction transaction1 = new Transaction(1500);
        Transaction transaction2 = new Transaction(-2500);

        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);

        assertEquals(-1000, cashMachine.showSaldo());
    }
}