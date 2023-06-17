package com.kodilla.bank.homeworkV2;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
    private List<Transaction> transactionList = new ArrayList<>();

    public List<Transaction> addTransaction(Transaction transaction) {
       transactionList.add(transaction);
       return transactionList;
    }

    public int showSaldo() {
        return transactionList
                .stream()
                .mapToInt(n -> n.getValue())
                .sum();
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}
