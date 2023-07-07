package com.example.jframe;

import com.example.objectsandclasses2.Pizza;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MakePizza extends JFrame implements ActionListener {
    com.example.objectsandclasses2.Pizza[] p = new com.example.objectsandclasses2.Pizza[4];

    int i;
    boolean found = false;
    String psize;

    JLabel pizinput = new JLabel("Enter 1st pizza size (Small, Medium, Large, X-Large): ");
    JTextField pizfield = new JTextField(10);
    JLabel pizoutput = new JLabel();
    Container c;
    FlowLayout flow = new FlowLayout();

    public MakePizza() {
        setSize(450, 100);
        c = getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(flow);


        p[0] = new com.example.objectsandclasses2.Pizza("Small", 7.00);
        p[1] = new com.example.objectsandclasses2.Pizza("Medium", 11.00);
        p[2] = new com.example.objectsandclasses2.Pizza("Large", 12.00);
        p[3] = new Pizza("X-Large", 15.00);

        pizinput.setForeground(Color.blue);
        c.add(pizinput);
        pizinput.setForeground(Color.blue);
        c.add(pizfield);
        pizinput.setForeground(Color.blue);
        c.add(pizoutput);

        pizfield.requestFocus();
        pizfield.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
    psize =pizfield.getText();
    psize =psize.toUpperCase();

        for(i =0;i<p.length;i++)
            if(p[i].getSize().equalsIgnoreCase(psize))
    {
        pizoutput.setText(String.format("Price is %.2f\n", p[i].getPrice()));
        found = true;
        break;
    }

        if(!found)
            pizoutput.setText("We don't sell that size pizza!!!");
}

public static void main(String[] args)
{
    MakePizza f = new MakePizza();
}
}
