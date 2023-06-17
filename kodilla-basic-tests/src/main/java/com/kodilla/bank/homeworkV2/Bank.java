package com.kodilla.bank.homeworkV2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<CashMachine> cashMachines = new ArrayList<>();
    private int size;
    public void add(CashMachine cashMachine) {
        this.cashMachines.add(cashMachine);
    }

    public int withdraws() {
        return cashMachines.size();// -.size();
                //.stream()
                //.mapToInt(m -> m.getTransactionList().size())
    }
}
