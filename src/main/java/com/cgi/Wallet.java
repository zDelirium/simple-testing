package com.cgi;

public class Wallet {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if ((balance + amount) < 0) throw new IllegalArgumentException("The result will end up negative try again");
        if (amount < 0) throw new IllegalArgumentException("Negative values not allowed");
        this.balance = amount;
    }

    public void withdrawal(int amount) {
        if (amount < 0) throw new IllegalArgumentException("You cannot withdrawal a negative value");
        if ((balance - amount) < 0) throw new IllegalArgumentException("The result will end up negative try again");
        this.balance -= amount;
    }
}