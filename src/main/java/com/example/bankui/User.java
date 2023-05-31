package com.example.bankui;

public class User {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;
    private String Gender;
    private Account account;
    private String Details;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

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
        return account.withdraw(amount);

    }

    public double buy_item (double amount)
    {
        return account.withdraw(amount);
    }

    public double Transfere_money_to(User user,double amount)
    {

        user.Transfere_money_from(amount);
        return account.withdraw(amount);
    }
    public double Transfere_money_from(double amount)
    {
        return account.deposit(amount);
    }


}