package com.example.objectsandclasses3;

public class Rectangle91{
    protected double length;
    protected double width;
    protected double area;

    public Rectangle91(double l, double w)
    {
        length = l;
        width = w;
        area = length * width;
    }

    public void setlength(double l)
    {
        length = l;
    }
    public void setwidth(double w)
    {
        width = w;
    }

    public void calcarea()
    {
        area = length * width;
    }

    public void print()
    {
        System.out.printf("Length = %.2f\n", length);
        System.out.printf("Width = %.2f\n", width);
        System.out.printf("Area = %.2f\n", area);
    }
}
