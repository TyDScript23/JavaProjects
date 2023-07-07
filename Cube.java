package com.example.codingprojects2;

public class Cube {
    private double sidelen, sa, vol;
    private String color;
    private boolean fill;

    //intializes cube to side length of "1",
    //color of "black" and no filler
    public Cube()
    {
        sidelen = 1;
        color = "black";
        fill = false;
    }

    //sets the side length to variable "sidelen"
    public void setSideLength(double s)
    {
        sidelen = s;
    }

    //sets color value to variable "color"
    public void setColor(String c)
    {
        color = c;
    }

    //sets filler value to variable "fill"
    public void setFill(boolean f)
    {
        fill = f;
    }

    //redefines "sidelen" given decimal (percentage)
    public void resize(double per)
    {
        sidelen += (sidelen * per);
    }

    //returns side's length
    public double getSideLength()
    {
        return sidelen;
    }

    //returns color
    public String getColor()
    {
        return color;
    }

    //returns if cube is filled
    public boolean getFill()
    {
        return fill;
    }

    //calculates surface area using (sidelen^2) x 6
    public double calcSurfaceArea()
    {
        sa = (Math.pow(sidelen, 2)) * 6;
        return sa;
    }

    //calculates volume using (sidelen^3)
    public double calcVolume()
    {
        vol = (Math.pow(sidelen, 3));
        return vol;
    }
}
