package com.example.codingprojects2;

/* Tyler Davis
   Publication Array - Inheritance 3-28

   --this program will be the basis for parent
   class that is used to format and print
   publications for a book and a cd
   --final publications will be printed
   to console output using a separate provided
   "main" program
 */

public abstract class publication { // "abstract" modifier states
                                    //that class contains method that
                                    //is not pre-defined

    private String title;
    private double price;
    private int year;

    public publication(String t, double p, int y)
            //initializes information to user input
    {

        title = t;
        price = p;
        year = y;
    }

    //raises price by given percentage in decimal form
    public void raise(double p)
    {
        price += (price * p);
    }

    //formats information to printable output
    public void print()
    {
        System.out.println("Title is " + title);
        System.out.printf("Price is %.2f\n", price);
        System.out.println("Publication Year is " + year);
    }

    public abstract void use(); //abstract method to be overridden within
                                //other classes that inherit it
}
