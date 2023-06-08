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
        if (amount<0){
            return -1;
        }else {
            Balance += amount;
            return Balance;
        }
    }
    public double withdraw(double amount)
    {
        if (amount<0){
            return -1;
        }else {
            Balance -= amount;
            return Balance;
        }
    }



}