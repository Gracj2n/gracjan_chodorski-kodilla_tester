package com.kodilla.bank.homeworkV2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTestSuite {
    Bank bank = new Bank();
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    Transaction transaction1forCM1 = new Transaction(3500);
    Transaction transaction2forCM1 = new Transaction(2500);
    Transaction transaction3forCM1 = new Transaction(-2500);
    Transaction transaction1forCM2 = new Transaction(3500);
    Transaction transaction2forCM2 = new Transaction(3500);
    Transaction transaction3forCM2 = new Transaction(-5500);

    @BeforeEach
    public void setup() {
        bank.addCashMachineToBank(cashMachine1);
        bank.addCashMachineToBank(cashMachine2);

        cashMachine1.addTransaction(transaction1forCM1);
        cashMachine1.addTransaction(transaction2forCM1);
        cashMachine1.addTransaction(transaction3forCM1);
        cashMachine2.addTransaction(transaction1forCM2);
        cashMachine2.addTransaction(transaction2forCM2);
        cashMachine2.addTransaction(transaction3forCM2);
    }
    @Test
    public void shouldAddCashMachineToBank() {
        Assertions.assertEquals(2, bank.getSizeOfCashMachinesInBank());
    }

    @Test
    public void shouldShowAmountOfBankTransactions() {
        Assertions.assertEquals(6, bank.showAmountOfBankTransactions());
    }

    @Test
    public void shouldShowTotalSaldo() {
        Assertions.assertEquals(5000, bank.showTotalSaldo());
    }

    @Test
    public void shouldReturnSumOfDeposits() {
        Assertions.assertEquals(4, bank.sumOfDeposits());
    }

    @Test
    public void shouldReturnSumOfWithdrawls() {
        Assertions.assertEquals(2, bank.sumOfWithdrawls());
    }

    @Test
    public void shouldReturnAverageOfDeposits() {
        Assertions.assertEquals(3250, bank.averageOfDeposits());
    }

    @Test
    public void shouldReturnAverageOfWithdrawls() {
        Assertions.assertEquals(-4000, bank.averageOfWithdrawls());
    }
}