package com.example.graphicsanddrawing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class RunBases extends JFrame implements ActionListener
{
    int num = 3;
    JButton run = new JButton("Run");
    int firstx = 300, firsty = 200, secondx = 200, secondy = 100;
    int thirdx = 100, thirdy = 200, homex = 200, homey = 300;
    Container c;
    public RunBases()
    {
        setSize(400, 400);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);
        c.add(run);
        run.addActionListener(this);
        setVisible(true);
    }		// continued


    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);  // call JFrame's paint - swing & graphics
        int x, y;
        g.setColor(Color.darkGray);
        g.drawLine(homex, homey, firstx, firsty);
        g.drawLine(firstx, firsty, secondx, secondy);
        g.drawLine(secondx, secondy, thirdx, thirdy);
        g.drawLine(thirdx, thirdy, homex, homey);
        g.setColor(Color.blue);
        if (num < 4)
            num++;
        else
            num = 1;
        if (num == 1)
            g.fillOval(firstx  - 20, firsty  - 20, 25, 25);
        else if (num == 2)
            g.fillOval(secondx  - 15, secondy  - 10, 25, 25);
        else if (num == 3)
            g.fillOval(thirdx -  5, thirdy  - 5, 25, 25);
        else
            g.fillOval(homex, homey  - 5, 25, 25);
    }

    public static void main(String[] args)
    {
         new RunBases();
    }
}

