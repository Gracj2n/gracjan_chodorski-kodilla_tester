package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;
    public Bank() {
        this.cashMachines = new CashMachine[0];
    }
    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }
    public int withdrawals() {
        int transactionNumbers = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            CashMachine current = cashMachines[i];
            for (int j = 0; j < current.getTransacions().length; j++ ) {
                int tx = current.getTransacions()[j];
                if (tx < 0) {
                    transactionNumbers++;
                }
            }
        }
        return transactionNumbers;
    }
}
