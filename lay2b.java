package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class lay2b extends JFrame
{
    JLabel title = new JLabel("Send e-mail to someone@example.com:");
    Font titlefont = new Font("TimesRoman", Font.BOLD, 18);
    JLabel namelab = new JLabel("Name:");
    JTextField namefield = new JTextField("your name");
    JLabel emaillab = new JLabel("E-mail:");
    JTextField emailfield = new JTextField("your email");
    JLabel comlab = new JLabel("Comment:");
    JTextField comfield = new JTextField("your comment");
    JButton send = new JButton("Send");
    JButton reset = new JButton("Reset");
    Container c;
    // declare any needed panels and layouts
    JPanel center = new JPanel();
    JPanel south = new JPanel();

    FlowLayout flow = new FlowLayout();
    GridLayout grid = new GridLayout(6,1);
    BorderLayout bord = new BorderLayout();
    public lay2b()
    {
        setSize(400, 300);
        // set up panels and layouts
        c = getContentPane();
        c.setLayout(bord);

        title.setFont(titlefont);
        c.add(title,bord.NORTH);

        center.setLayout(grid);
        center.add(namelab);
        center.add(namefield);
        center.add(emaillab);
        center.add(emailfield);
        center.add(comlab);
        center.add(comfield);
        c.add(center, bord.CENTER);

        flow.setAlignment(FlowLayout.LEFT);

        south.setLayout(flow);
        south.add(send);
        south.add(reset);
        c.add(south, bord.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new lay2b();
    }
}
