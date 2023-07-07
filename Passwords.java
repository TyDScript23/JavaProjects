package com.example.jframe;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Passwords extends JFrame implements ActionListener{
    JLabel instruct = new JLabel("Type your password and press enter");
    JPasswordField password = new JPasswordField(10);
    JLabel message = new JLabel();
    Container c;
    FlowLayout flow = new FlowLayout();
    String[] valid = {"giants", "yankees", "rangers", "java", "pizza", "mustard"};

    public Passwords()
    {
        setSize(375, 100);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.cyan);
        instruct.setForeground(Color.blue);
        c.add(instruct);
        password.setForeground(Color.blue);
        password.setEchoChar('*');
        c.add(password);
        message.setForeground(Color.blue);
        c.add(message);
        password.requestFocus();
        password.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        boolean found = false;
        int i;
        char[] passinar = password.getPassword();
        String passin = new String(passinar);

        for (i = 0; i < valid.length; i++)
            if (valid[i].equals(passin))
            {
                message.setText("Access Granted");
                found = true;
                break;
            }

        if (!found)
            message.setText("Access Denied");
    }

    public static void main(String[] args)
    {
        Passwords f = new Passwords();
    }
}
