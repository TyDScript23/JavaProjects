package com.example.graphicsanddrawing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ShapeReview extends JFrame
{
    public ShapeReview()
    {
        setSize(300, 200);
        setDefaultCloseOperation(2);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.green);
        g.fillOval(25, 75, 50, 50);
        g.setColor(Color.blue);
        g.drawOval(25, 75, 50, 50);
        g.setColor(Color.red);
        g.fillRect(125, 75, 25, 25);
        g.setColor(Color.blue);
        g.fillRect(150, 75, 50, 25);
    }
    public static void main(String[] args)
    {
         new ShapeReview();
    }
}
