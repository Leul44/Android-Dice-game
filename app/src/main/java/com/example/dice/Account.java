package com.example.dice;

import java.io.Serializable;

public class Account implements Serializable {
    private long accountNumber;
    private double balance;
    private String bankName;


    public Account(long accountNumber, double balance, String bankName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

}
