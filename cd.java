package com.example.codingprojects2;

/*
   This script inherits the "publication" class
   in order to gather information about the cd and
   display the information as well as instructions for the
   usage
 */

public class cd extends publication { //inherits "publication.java"
    private int min;

    public cd(String t, double p, int y, int m)
    {
        super(t,p,y);  // uses constructor from "publication.java"
        min = m;
    }

    public void use() //overrides use method from "publication.java"
    {
        System.out.println("\nLook on CD to find topic number.");
        System.out.println("Skip to corresponding section.");
    }

    public void print() //overrides print method from "publication.java"
    {
        System.out.println("CD");
        super.print(); //uses the print method from "publication.java"
        System.out.println("Number of minutes is " + min);
    }
}
