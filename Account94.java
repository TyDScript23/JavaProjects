package com.example.objectsandclasses3;

public abstract class Account94 {
    protected int acctnum;
    protected double bal;

    public Account94(int n)
    {
        acctnum = n;
        bal = 0;
    }

    public void trans(double a)
    {
        bal += a;
    }

    public abstract String getaccountinfo();
}
