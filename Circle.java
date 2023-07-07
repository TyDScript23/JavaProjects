package com.example.objectsandclasses2;

public class Circle {
    private double radius;
    private double area;

   public Circle()
   {
       radius = 1.0;
       area = Math.PI * Math.pow(radius, 2);
   }


    public void setradius(double r)
        /* public set method to let the user assign a value into the private data field radius */
    {
        radius = r;
    }

    public void calcarea()
/* public method to let the user calculate the value of a private data field, but not set it */
    {
        area = Math.PI * Math.pow(radius, 2);
    }

    public double getradius()
        /* public get methods to let the user look up the value of a private data field */
    {
        return radius;
    }
    public double getarea()
    {
        return area;
    }

    public void print()
    {
        System.out.println("Radius is " + radius
                + " and area is " + area);
    }

}
