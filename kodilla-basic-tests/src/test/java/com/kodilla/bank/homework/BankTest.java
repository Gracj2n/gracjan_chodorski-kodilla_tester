package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    public void shouldAddTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1000);
        cashMachine.add(-500);

        Bank bank = new Bank();
        bank.add(cashMachine);
        int result = bank.withdrawals();
        assertEquals(1, result);
    }
}