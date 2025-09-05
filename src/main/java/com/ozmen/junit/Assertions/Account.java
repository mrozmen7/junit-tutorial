package com.ozmen.junit.Assertions;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private List<String> transactions = new ArrayList<>();

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
        transactions.add("Deposit: " + amount);
    }

    public void withdraw(int amount) {
        balance -= amount;
        transactions.add("Withdraw: " + amount);
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }
}