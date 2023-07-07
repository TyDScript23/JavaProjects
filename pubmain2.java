package com.example.codingprojects2;

public class pubmain2 {
    public static void main(String[] args)
    {
        int i;
        publication[] p = new publication[2];
        // array of abstract super publication references
        p[0] = new book("Java Reader", 17.50, 2017, 250);
        // title, price, year, pages
        p[1] = new cd("Java Listener", 24.95, 2018, 330);
        // title, price, year, minutes

        // dynamic method binding
        for (i = 0; i < p.length; i++)
        {
            p[i].raise(.10);   // raise price by 10%
            p[i].print();      // print data fields
            p[i].use();        // print how to use
            System.out.println();
        }
    }
}
