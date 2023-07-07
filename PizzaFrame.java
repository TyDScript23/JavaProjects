package com.example.codingprojects2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/*
--This code will construct and generate a window
that contains a form to customize a pizza
--code allows to pick a size (small,medium,large,x-large)
,choose your toppings from a list, and add a side of wings
to your order
--prints price at the bottom of the window
 */

public class PizzaFrame extends JFrame implements ActionListener, ItemListener, ListSelectionListener {

    double toptotal, sidetotal, sizetotal;

    String[] toppings = {"Eggplant", "Green Peppers", "Hot Peppers", "Pepperoni"
    , "Sausage", "Mushrooms", "Anchovies"};

    JLabel title = new JLabel("HVCC Pizza Parlor", SwingConstants.CENTER);
    JLabel instruct = new JLabel("Choose your pizza size and toppings ($1 each)", SwingConstants.CENTER);
    JLabel price = new JLabel("Price of your pizza is $0.00");

    JRadioButton small = new JRadioButton("Small ($7)");
    JRadioButton medium = new JRadioButton("Medium ($9)");
    JRadioButton large = new JRadioButton("Large ($11)");
    JRadioButton xlarge = new JRadioButton("X-Large ($13)");
    ButtonGroup group = new ButtonGroup();

    JList seltop = new JList(toppings);
    JCheckBox wings = new JCheckBox("Side Order Hot Wings - add $5.00");

    JPanel north = new JPanel();
    JPanel center = new JPanel();
    JPanel south = new JPanel();

    Font titlefont = new Font("Elephant", Font.BOLD, 18);

    GridLayout grid = new GridLayout(1,2);
    GridLayout grid2 = new GridLayout(2,1);
    BorderLayout bord = new BorderLayout();
    Container c;

    public PizzaFrame()
    {
        setSize(650,300);
        c = getContentPane();
        c.setBackground(Color.yellow);
        c.setLayout(bord);

        //title and instructions are added to the top of the window
        north.setLayout(grid2);
        north.setBackground(Color.yellow);
        title.setForeground(Color.red);
        title.setFont(titlefont);
        north.add(title);
        instruct.setForeground(Color.red);
        north.add(instruct);
        c.add(north, BorderLayout.NORTH);

        //radio buttons and list are added to the middle of the window
        center.setLayout(grid);
        center.setBackground(Color.lightGray);
        group.add(small);
        group.add(medium);
        group.add(large);
        group.add(xlarge);
        center.add(small);
        center.add(medium);
        center.add(large);
        center.add(xlarge);
        seltop.setBackground(Color.white);
        seltop.setForeground(Color.red);
        center.add(seltop);
        c.add(center, BorderLayout.CENTER);

        //side addition and final price are added to bottom of window
        south.setLayout(grid);
        south.setBackground(Color.yellow);
        price.setForeground(Color.red);
        price.setFont(titlefont);
        south.add(price);
        wings.setForeground(Color.red);
        wings.setBackground(Color.yellow);
        south.add(wings);
        c.add(south, BorderLayout.SOUTH);

        small.addItemListener(this);
        medium.addItemListener(this);
        large.addItemListener(this);
        xlarge.addItemListener(this);
        seltop.addListSelectionListener(this);
        wings.addActionListener(this);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        sidetotal = 0;

        //when side of wings is selected, $5.00 is added to the price
           if (wings.isSelected())
               sidetotal += 5;

           price.setText(String.format("Price of your pizza is $%.2f\n", sizetotal + toptotal + sidetotal));
    }

    public void itemStateChanged(ItemEvent e)
    {
        sizetotal = 0;

        //when size is selected, the price corresponding to it is added to the total
        if (small.isSelected())
            sizetotal = 7;
        else if (medium.isSelected())
            sizetotal = 9;
        else if (large.isSelected())
            sizetotal = 11;
        else if (xlarge.isSelected())
            sizetotal = 13;

        price.setText(String.format("Price of your pizza is $%.2f\n", sizetotal + toptotal + sidetotal));
    }

    public void valueChanged(ListSelectionEvent e)
    {
        toptotal = 0;
        int i;
        int[] selecttoppings;
        selecttoppings = seltop.getSelectedIndices();

        //$1.00 per topping is added to the total
        for (i = 0; i < selecttoppings.length; i++)
            toptotal += 1;

        price.setText(String.format("Price of your pizza is $%.2f\n", sizetotal + toptotal + sidetotal));
    }

    public static void main(String[] args)
    {
        new PizzaFrame();
    }
}
