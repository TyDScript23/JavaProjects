package com.example.objectsandclasses3;

public class Checking94 extends Account94 {
    public Checking94(int n)
    {
        super (n);
    }

    public String getaccountinfo() //override
    {
        return "Checking Account Information\n" +
                acctnum + " " + bal;
    }
}
