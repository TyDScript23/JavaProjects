package com.example.objectsandclasses2;

public class TestCircle {
    public static void main(String[] args)
    {
        Circle c = new Circle();
        /* declare and instantiate circle object */
        double radius = 2.0;
        c.setradius(radius);
// set c's radius to value of radius
        c.calcarea();
        System.out.println("Radius is " + c.getradius());
// look up c's radius value
        System.out.println("Area is " + c.getarea());

    }
}
