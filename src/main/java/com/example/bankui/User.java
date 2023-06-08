package com.example.bankui;

public class User {
    private String Name;
    private final String Gender;
    private Account account;
    private final String Details;
    private String Password;


    public User(){
        this.Name="";
        this.account=new Account();
        this.Gender="anybody";
        this.Details="filler";
        this.Password="filler";

    }
    public User(String Name,String Gender,Account Account,String details,String password){
        this.Name=Name;
        this.Gender=Gender;
        this.account=Account;
        this.Details=details;
        this.Password=password;
    }
    public double pay_bills(double amount)
    {
        if (amount<0){
            return -1;
        }else {
            return account.withdraw(amount);
        }
    }

    public double buy_item (double amount)
    { if (amount<0){
        return -1;
    }else {
        return account.withdraw(amount);
    }
    }

    public double Transfere_money_to(User user,double amount)
    {
        if (amount<0){
            return -1;
        }else {
            user.Transfere_money_from(amount);
            return account.withdraw(amount);
        }
    }
    public double Transfere_money_from(double amount)
    {
        return account.deposit(amount);
    }

    //Getters and Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}