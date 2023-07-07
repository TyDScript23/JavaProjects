package com.example.objectsandclasses;

import java.text.NumberFormat;

public class NumForm {
    public static void main(String[] args) throws Exception
    {
        double num = 72.97853107024657;
        String snum;
        NumberFormat numnum;	// NumberFormat object
        numnum = NumberFormat.getInstance();
        snum = numnum.format(num);	// call format() method
        System.out.println("Number formatted is " + snum);
        numnum.setMaximumFractionDigits(2);
        snum = numnum.format(num);	// call format() again
        System.out.print("Number formatted ");
        System.out.println("with 2 decimal places is "+ snum);
    }

}
