package com.example.objectsandclasses3;

public class Cube91 extends Rectangle91  // cube "is a" rectangle
{
    private double depth;   // new data field

    public Cube91(double l, double w, double d)
    {
        super(l, w);   // super rectangle constructor
        depth = d;    // new
        area = 2 * length * width + 2 * length * depth + 2 * width * depth;  // different
    }

    public void setdepth(double d)  // new method
    {
        depth = d;
    }

    public void calcarea()   // different - override
    {
        area = 2 * length * width + 2 * length * depth + 2 * width * depth;
    }

    public void print()  // override
    {
        super.print();    // rectangle print
        System.out.printf("Depth = %.2f\n", depth);
    }
}
