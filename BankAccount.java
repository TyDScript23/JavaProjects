package com.example.objectsandclasses2;

public class BankAccount {

    //properties

    private double balance;
    private String acctnum;

    //methods

    public BankAccount() {
        balance = 0.0;
        acctnum = "";
    }

    public BankAccount(double startBalance) {
        balance = startBalance;
    }

    public BankAccount(String str) {
        balance = Double.parseDouble(str);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(String str) {
        balance += Double.parseDouble(str);
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void withdraw(String str)
    {
        balance -= Double.parseDouble(str);
    }

    public void setBalance(double b)
    {
        balance = b;
    }

    public void setBalance(String str)
    {
        balance = Double.parseDouble(str);
    }

    public void setacctnum(String an)
    {
        acctnum = an;
    }

    public String getacctnum()
    {
        return acctnum;
    }

    public double getBalance()
    {
      return balance;
    }
}