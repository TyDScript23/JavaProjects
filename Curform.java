package com.example.objectsandclasses;

import java.text.NumberFormat;

public class Curform {
    public static void main(String[] args) throws Exception
    {
        double num = 72.97853107024657;
        String snum;
        NumberFormat curnum;	// NumberFormat object
        curnum = NumberFormat.getCurrencyInstance();
// call getCurrencyInstance() method
        snum = curnum.format(num);	// call format() method
        System.out.print("Number formatted to currency with");
        System.out.println(" 2 decimal places is " + snum);
    }

}
