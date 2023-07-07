package com.example.jframe;

import javax.swing.*;
import java.awt.*;

public class Hello2 extends Hello2Main {

    public Hello2()
    {
        super();
        c = getContentPane();
        c.setBackground(Color.pink);
        c.setLayout(flow);
        quote1.setForeground(Color.blue);
        quote1.setFont(ravie);
        c.add(quote1);
        quote2.setFont(ravie);
        quote2.setForeground(Color.blue);
        c.add(quote2);
        setTitle("Hello Title");
        setResizable(false);
        setSize(275, 125);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Hello2 f = new Hello2();
    }

}
