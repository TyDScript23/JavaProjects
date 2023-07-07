package com.example.objectsandclasses;

import java.text.NumberFormat;

public class perform {
    public static void main(String[] args) throws Exception
    {
        double num = 72.97853107024657;
        String snum;
        NumberFormat pernum;	// NumberFormat object
        pernum = NumberFormat.getPercentInstance();
// call getPercentInstance() method
        snum = pernum.format(num);	// call format() method
        System.out.println("Number formatted to percent is "
                + snum);
        pernum.setMaximumFractionDigits(2);
        snum = pernum.format(num);	// call format() again
        System.out.print("Number formatted to percent ");
        System.out.println("with 2 decimal places is "+ snum);
    }

}
