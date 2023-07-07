package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EnterName extends JFrame implements ActionListener {

    LinkedList<String> names = new LinkedList<String>();

    JLabel inname = new JLabel("Enter name for list");
    JTextField nameinfield = new JTextField(20);
    JLabel namesearch = new JLabel("Enter name to search for");
    JTextField namesearchfield = new JTextField(20);
    JLabel resultlab = new JLabel("Result");
    JTextField resultfield = new JTextField(20);
    Container c;

    JButton display = new JButton("Display list on console");

    public EnterName() {
        super("Name List");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(inname);
        c.add(nameinfield);
        c.add(namesearch);
        c.add(namesearchfield);
        c.add(resultlab);
        c.add(resultfield);

        c.add(display);

        nameinfield.addActionListener(this);
        namesearchfield.addActionListener(this);

        display.addActionListener(this);

        resultfield.setEditable(false);
        nameinfield.requestFocus();
        setSize(250, 225);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == display)
        {
            ListIterator li = names.listIterator(); //position li to beginning of list
            while (li.hasNext()) // while referencing something
                System.out.println(li.next()); // return object and follow reference to next object
            System.out.println("\n");
            nameinfield.requestFocus();
        }
        else if (e.getSource() == nameinfield) {
            String inname = nameinfield.getText();
            if (names.contains(inname)) {
                resultfield.setText(inname + " already in list.");
            } else {
                names.add(inname);
                resultfield.setText(inname + " dynamically inserted into list");
            }
            nameinfield.setText("");
            nameinfield.requestFocus();
        } else {
            String searchname = namesearchfield.getText();
            if (names.contains(searchname))
                resultfield.setText(searchname + " found at spot " + names.indexOf(searchname));
            else
                resultfield.setText(searchname + " not found");
            namesearchfield.setText("");
            namesearchfield.requestFocus();
        }
    }
    public static void main(String[] args)
    {
        new EnterName();
    }
}

