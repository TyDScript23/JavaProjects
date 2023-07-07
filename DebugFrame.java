package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DebugFrame extends JFrame implements ActionListener {
    JButton but1 = new JButton("Button 1");
    JButton but2 = new JButton("Button 2");

    JLabel lab1 = new JLabel("Label 1");

    FlowLayout flow = new FlowLayout();
    Container c;

    public DebugFrame()
    {
        setSize(300, 200);
        c = getContentPane();
        setLayout(flow);
        c.setBackground(Color.cyan);

        but1.setForeground(Color.blue);
        c.add(but1);

        but2.setForeground(Color.blue);
        c.add(but2);

        lab1.setForeground(Color.blue);
        c.add(lab1);

        but1.addActionListener(this);
        but2.addActionListener(this);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == but1)
            lab1.setText("You picked button 1");
        else if (e.getSource() == but2)
            lab1.setText("You picked button 2");
    }

    public static void main(String[] args)
    {
        DebugFrame f = new DebugFrame();
    }
}
