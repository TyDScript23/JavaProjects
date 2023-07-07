package com.example.graphicsanddrawing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SunandMoon extends JFrame implements ActionListener {
    JButton daynight = new JButton("Change to Day");
    boolean day = false;
    Container c;
    FlowLayout flow = new FlowLayout();

    public SunandMoon()
    {
        setSize(300, 300);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.gray);
        daynight.setForeground(Color.blue);
        c.add(daynight);
        daynight.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(day)
        {
            day = false;
            daynight.setText("Change to Day");
        }
        else
        {
            day = true;
            daynight.setText("Change to Night");
        }
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        if (day)
            g.setColor(Color.cyan);
        else
            g.setColor(Color.black);
        g.fillRect(0 , 0, 40, 100);
        g.fillRect(40, 0, 20, 50);
        g.fillRect(60, 0, 30, 70);
        g.fillRect(90, 0, 50, 130);
        g.fillRect(140, 0, 40, 110);
        g.fillRect(180, 0, 30, 90);
        g.fillRect(210, 0, 60, 60);
        g.fillRect(270, 0, 30, 70);

        if(day)
            g.setColor(Color.yellow);
        else
            g.setColor(Color.white);

        g.fillOval(120, 65, 40, 40);
        c.add(daynight);
    }

    public static void main(String[] args)
    {
        new SunandMoon();
    }
}
