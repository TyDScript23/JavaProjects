package com.example.graphicsanddrawing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class PizzaSlice extends JFrame implements ActionListener{
    JButton pizzabutton = new JButton("Take a Piece");
    int count = 0;
    Container c;
    FlowLayout flow = new FlowLayout();
    LinkedList<Eggplant> ep = new LinkedList<>();
    Color eggplant = new Color(70, 23, 62);
    ListIterator li;
    Eggplant ep1;

    public PizzaSlice()
    {
        setSize(200, 200);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.blue);
        pizzabutton.setForeground(Color.cyan);
        c.add(pizzabutton);
        pizzabutton.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
       count++;
       if (count == 4)
           c.remove(pizzabutton);
        repaint();
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        switch (count) {
            case 0 -> {
                g.setColor(Color.yellow);
                g.fillOval(50, 50, 100, 100);
                g.setColor(eggplant);

                ep = new LinkedList<>();
                ep.add(new Eggplant(115, 75, 10,10));
                ep.add(new Eggplant(75, 75, 10,10));
                ep.add(new Eggplant(75, 115, 10,10));
                ep.add(new Eggplant(115, 115, 10,10));
            }
            case 1 -> {
                g.setColor(Color.yellow);
                g.fillArc(50, 50, 100, 100, 0, 270);
                g.setColor(eggplant);

                ep.clear();
                ep.add(new Eggplant(115, 75, 10,10));
                ep.add(new Eggplant(75, 75, 10,10));
                ep.add(new Eggplant(75, 115, 10,10));
            }
            case 2 -> {
                g.setColor(Color.yellow);
                g.fillArc(50, 50, 100, 100, 0, 180);
                g.setColor(eggplant);
                ep.clear();
                ep.add(new Eggplant(115, 75, 10,10));
                ep.add(new Eggplant(75, 75, 10,10));
            }
            case 3 -> {
                g.setColor(Color.yellow);
                g.fillArc(50, 50, 100, 100, 0, 90);
                g.setColor(eggplant);
                ep.clear();
                ep.add(new Eggplant(115, 75, 10,10));
            }
            case 4 -> {
                g.setColor(Color.red);
                ep.clear();
                g.drawString("Order more pizza", 50, 100);
            }
        }
        li = ep.listIterator();
        while (li.hasNext())
        {
            ep1 = (Eggplant)li.next();
            ep1.draw(g);
        }
    }

    public static void main(String[] args)
    {
        new PizzaSlice();
    }
}
