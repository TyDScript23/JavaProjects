package com.example.codingprojects2;

/*Tyler Davis
  Blood Drive - Average

  --With this program you will
  be able to average the pints
  of a blood drive multiple times
  using a GUI application
  --Run in displayed in a separate window and
   average is displayed once button is clicked*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BloodDFrame extends JFrame implements ActionListener{

    //Labels:
    JLabel title = new JLabel("HVCC Blood Drive");
    JLabel instruct = new JLabel("Enter pints donated for each department");
    JLabel dep1lab = new JLabel("Dept 1");
    JLabel dep2lab = new JLabel("Dept 2");
    JLabel dep3lab = new JLabel("Dept 3");
    JLabel dep4lab = new JLabel("Dept 4");
    JLabel dep5lab = new JLabel("Dept 5");
    JLabel anslab = new JLabel();

    //Fields:
    JTextField dep1field = new JTextField(7);
    JTextField dep2field = new JTextField(7);
    JTextField dep3field = new JTextField(7);
    JTextField dep4field = new JTextField(7);
    JTextField dep5field = new JTextField(7);

    //Button:
    JButton average = new JButton("Average");
    JButton clear = new JButton("Clear");

    //Fonts:
    Font tfont = new Font("Arian", Font.BOLD, 36);
    Font regfont = new Font("Arian", Font.BOLD, 24);

    //Container/FlowLayout:
    Container c;
    FlowLayout flow = new FlowLayout();

    public BloodDFrame()
    {
        //Size:
        setSize(500,300);

        //sets the layout to the "flow" setting
        //sets background to "green"
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.green);

        //sets title to color yellow and
        //bigger font, adds to container

        title.setForeground(Color.yellow);
        title.setFont(tfont);
        c.add(title);

        //adds instruction, Color: Yellow
        instruct.setForeground(Color.yellow);
        instruct.setFont(regfont);
        c.add(instruct);

        //The following 5 blocks of code
        //label each text field by their department
        //Label Color: Yellow, Input Color: Black
        dep1lab.setForeground(Color.yellow);
        dep1lab.setFont(regfont);
        c.add(dep1lab);
        dep1field.setForeground(Color.black);
        c.add(dep1field);

        dep2lab.setForeground(Color.yellow);
        dep2lab.setFont(regfont);
        c.add(dep2lab);
        dep2field.setForeground(Color.black);
        c.add(dep2field);

        dep3lab.setForeground(Color.yellow);
        dep3lab.setFont(regfont);
        c.add(dep3lab);
        dep3field.setForeground(Color.black);
        c.add(dep3field);

        dep4lab.setForeground(Color.yellow);
        dep4lab.setFont(regfont);
        c.add(dep4lab);
        dep4field.setForeground(Color.black);
        c.add(dep4field);

        dep5lab.setForeground(Color.yellow);
        dep5lab.setFont(regfont);
        c.add(dep5lab);
        dep5field.setForeground(Color.black);
        c.add(dep5field);

        //adds "Average" and "Clear"
        //button, Text Color: Blue
        average.setForeground(Color.blue);
        c.add(average);
        clear.setForeground(Color.blue);
        c.add(clear);

        //Initializes blank answer field
        //is set when action is done
        anslab.setForeground(Color.yellow);
        anslab.setFont(regfont);
        c.add(anslab);

        //Focus is on "dep1field"
        //gives each field and button
        //an "ActionListener"
        dep1field.requestFocus();
        dep1field.addActionListener(this);
        dep2field.addActionListener(this);
        dep3field.addActionListener(this);
        dep4field.addActionListener(this);
        dep5field.addActionListener(this);
        average.addActionListener(this);
        clear.addActionListener(this);

        // -process stops when user closes window
        // -window is not resizable
        // -window is visible
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int num1, num2, num3, num4, num5;
        int ans;

        //takes average of fields when "Average" button is pressed
        if (e.getSource() == average)
        {
            //converts each field to an integer
            num1 = Integer.parseInt(dep1field.getText());
            num2 = Integer.parseInt(dep2field.getText());
            num3 = Integer.parseInt(dep3field.getText());
            num4 = Integer.parseInt(dep4field.getText());
            num5 = Integer.parseInt(dep5field.getText());

            //takes average of fields
            ans = (num1 + num2 + num3 + num4 + num5)/5;

            //sets answer label text
            anslab.setText("Average pints donated is " + ans);
        }
        //clears each field when "clear" button is pressed
        else if (e.getSource() == clear)
        {
            dep1field.setText("");
            dep2field.setText("");
            dep3field.setText("");
            dep4field.setText("");
            dep5field.setText("");
            dep1field.requestFocus();
            anslab.setText("");
        }
    }

    public static void main(String[] args)
    {
        //creates frame
        BloodDFrame f = new BloodDFrame();
    }
}
