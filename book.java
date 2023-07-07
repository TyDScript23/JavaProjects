package com.example.codingprojects2;

/*
   This script inherits the "publication" class
   in order to gather information about the book and
   display the information as well as instructions for the
   usage
 */

public class book extends publication { //imports "publication.java"
    private int num;

    public book(String t, double p, int y, int pages)
    {
        super(t,p,y); // uses constructor from "publication.java"
        num = pages;
    }

    public void use() //overrides use method from "publication.java"
    {
        System.out.println("\nOpen book to Table of Contents.");
        System.out.println("Look up topic and turn to corresponding page.");
    }

    public void print() //overrides print method from "publication.java"
    {
        System.out.println("Book");
        super.print(); //uses the print method from "publication.java"
        System.out.println("Number of pages is " + num);
    }

}
