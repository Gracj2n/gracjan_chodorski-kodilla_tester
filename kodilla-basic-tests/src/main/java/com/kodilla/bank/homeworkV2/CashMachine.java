package com.kodilla.bank.homeworkV2;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private List<Transaction> transactionList = new ArrayList<>();

    public List<Transaction> addTransaction(Transaction transaction) {
        transactionList.add(transaction);
        return transactionList;
    }

    public double showSaldo() {
        return transactionList
                .stream()
                .mapToDouble(n -> n.getValue())
                .sum();
    }

    public int getTransactionList() {
        return transactionList.size();
    }
}