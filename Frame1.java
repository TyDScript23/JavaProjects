package com.example.objectsandclasses;

import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame {

    JLabel quote = new JLabel("Java is Fun!");
    Font ravie = new Font("Ravie", Font.BOLD, 24);
    FlowLayout flow = new FlowLayout();
    Container c;

    public Frame1() {

        super("Quote Frame");

        c = getContentPane();

        c.setLayout(flow);
        c.setBackground(Color.cyan);

        quote.setForeground(Color.blue);
        quote.setFont(ravie);
        c.add(quote);

        setTitle("Quote Frame Title");
        setSize(275, 100);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Frame1 f = new Frame1();
    }
}
