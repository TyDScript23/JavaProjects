package com.example.objectsandclasses2;

public class NeapolitanPizza97 extends Pizza {
    private String style;

    public NeapolitanPizza97(String s, String t, String st)
    {
        super(s, t);
        style = st;
    }

    public String getStyle()
    {
        return style;
    }

    public void printPizza()
    {
        super.printPizza();
        System.out.println("Style = " + style);
    }
}
