package com.kodilla.bank.homeworkV2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<CashMachine> cashMachinesList = new ArrayList<>();

    public List<CashMachine> addCashMachineToBank(CashMachine cashMachine) {
        cashMachinesList.add(cashMachine);
        return cashMachinesList;
    }

    public int showAmountOfBankTransactions() {
        int numberOfAllTransactions = 0;
        for(int i = 0; i < cashMachinesList.size(); i++) {
            numberOfAllTransactions += cashMachinesList.get(i).getTransactionList();
        }
        return numberOfAllTransactions;
    }

    public int getSizeOfCashMachinesInBank() {
        return cashMachinesList.size();
    }

    public double showTotalSaldo() {
        double totalSaldo = 0;
        for(int i = 0; i <cashMachinesList.size(); i++) {
            totalSaldo += cashMachinesList.get(i).showSaldo();
        }
        return totalSaldo;
    }

    public int sumOfDeposits() {
        return cashMachinesList
                .stream()
                .mapToInt(n -> n.sumOfDeposits())
                .sum();
    }

    public int sumOfWithdrawls() {
        return cashMachinesList
                .stream()
                .mapToInt(n -> n.sumOfWithdrawls())
                .sum();
    }

    public double averageOfDeposits() {
        return cashMachinesList
                .stream()
                .flatMap(n -> n.getTransactions().stream())
                .filter(n -> n.getValue() > 0)
                .mapToDouble(n -> n.getValue())
                .average()
                .getAsDouble();
    }

    public double averageOfWithdrawls() {
        return cashMachinesList
                .stream()
                .flatMap(n -> n.getTransactions().stream())
                .filter(n -> n.getValue() < 0)
                .mapToDouble(n -> n.getValue())
                .average()
                .getAsDouble();
    }
}