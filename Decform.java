package com.example.objectsandclasses;

import java.text.DecimalFormat;

public class Decform {
    public static void main(String[] args) throws Exception
    {
        double num = 72.97853107024657;
        String snum;
        DecimalFormat decnum =
                new DecimalFormat("#,#00,000.00%");
        snum = decnum.format(num);	// call format() method
        System.out.println("Number formatted to percent is " 						+ snum);
    }

}
