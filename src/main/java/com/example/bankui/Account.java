package com.example.bankui;

public class Account {
    private double Balance;
//    private String Date

    public Account() {
        this.Balance = 0;
    }

    public double getBalance() {
        return Balance;
    }

    public double deposit(double amount)
    {
        Balance+=amount;
        return Balance;
    }
    public double withdraw(double amount)
    {
        Balance-=amount;
        return Balance;
    }



}