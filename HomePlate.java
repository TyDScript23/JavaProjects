package com.example.graphicsanddrawing;

import java.awt.*;
import javax.swing.*;

public class HomePlate extends JFrame{
    int[] xhome = {100, 200, 200, 150, 100};
    int[] yhome = {90, 90, 150, 200, 150};
    Color dirt = new Color(100, 60, 35);
    Container c;

    public HomePlate()
    {
        setSize(300,400);
        c = getContentPane();
        c.setBackground(dirt);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.white);
        g.fillPolygon(xhome, yhome, xhome.length);
        g.setColor(Color.black);
        g.drawPolygon(xhome, yhome, xhome.length);
    }

    public static void main(String[] args){
        new HomePlate();
    }
}
