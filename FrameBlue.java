package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class FrameBlue extends JFrame {
    JLabel lab1 = new JLabel("First Label");
    JLabel lab2 = new JLabel("Second Label");
    Container c;
    FlowLayout flow = new FlowLayout();
    // flow labels left to right and centered

    public FrameBlue()	// constructor
    {
        setTitle("Blue Frame");	// title of this frame
        setSize(300, 200);
        c = getContentPane();
        // change layout property of container
        c.setLayout(flow);
        c.setBackground(Color.cyan);  // change container
        lab1.setForeground(Color.blue);  // change label
        c.add(lab1);
        lab2.setForeground(Color.blue);
        c.add(lab2);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        FrameBlue f = new FrameBlue();
    }

}
