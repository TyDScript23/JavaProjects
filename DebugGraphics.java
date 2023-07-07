package com.example.graphicsanddrawing;

import java.awt.*;
import javax.swing.*;

public class DebugGraphics extends JFrame
{
    Container c;

    public DebugGraphics()
    {
        setSize(400, 300);
        c = getContentPane();
        c.setBackground(Color.cyan);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        int diameter, x = 200, y = 150;
        for(diameter = 2; diameter < 200; diameter+=2)
        {
            if(diameter < 50)
                g.setColor(Color.red);
            else if(diameter < 100)
                g.setColor(Color.green);
            else if (diameter < 150)
                g.setColor(Color.yellow);
            else g.setColor(Color.blue);
            g.drawOval(x - (diameter/2) ,y - (diameter/2), diameter, diameter);
        }
    }

    public static void main(String[] args)
    {
         new DebugGraphics();
    }
}