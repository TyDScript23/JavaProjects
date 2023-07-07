package com.example.objectsandclasses3;

public class Savings94 extends Account94 {
    private double intrate;

    public Savings94(int n, double r)
    {
        super (n);
        intrate = r;
    }

    public String getaccountinfo() //override
    {
        return "Savings Account Information\n" +
                acctnum + " " + bal + " " + intrate;
    }
}
