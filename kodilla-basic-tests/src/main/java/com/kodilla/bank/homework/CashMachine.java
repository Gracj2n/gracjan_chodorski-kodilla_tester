package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transacions;
    private int saldo;
    private int size; //liczba transakcji

    public CashMachine() {
        this.transacions = new int[0];
    }
    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transacions, 0, newTab, 0, transacions.length);
        newTab[this.size - 1] = transaction;
        this.transacions = newTab;
        this.saldo = saldo + transaction;
    }
    public int getSaldo() {
        return saldo;
    }
    public int[] getTransacions() {
        return transacions;
    }
}
