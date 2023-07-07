package com.example.objectsandclasses2;

public class Pizza {
    protected String size;
    protected double price;
    protected String topping;

    public Pizza()   //overloaded constructor
    {
        size = "Large";
        price = 11.00;
    }

    public void raisePrice()
    {
        price++;
    }

    public Pizza(String s, double p)   //overloaded constructor
    {
        size = s;
        price = p;
    }

    public Pizza(String s, String t)
    {
        topping = t;
        size = s;
    }

    public String getSize()
    {
        return size;
    }

    public double getPrice()
    {
        return price;
    }

    public void printPizza()
    {
        System.out.println("\nThis pizza " + this);
        System.out.println("Size = " + size);
        System.out.println("Topping = " + topping);
    }
}
