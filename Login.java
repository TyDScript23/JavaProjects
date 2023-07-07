package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JLabel title = new JLabel("HVCC Login");
    JLabel user = new JLabel("Username:");
    JLabel pass = new JLabel("Password:");
    JLabel name = new JLabel("Tyler Davis");
    JLabel approved = new JLabel();

    JTextField userfield = new JTextField(17);
    JPasswordField passfield = new JPasswordField(17);

    JButton submit = new JButton("Login");
    JButton clear = new JButton("Clear");
    JButton back = new JButton("Sign out");

    Font tfont = new Font("New Courier", Font.BOLD, 36);
    Font regfont = new Font("New Courier", Font.BOLD, 24);

    Container c;
    FlowLayout flow = new FlowLayout();

    String[] valid = {"wiisports", "Origins", "Odyssey", "BlackFlag", "sushi"};

    public Login()
    {
        setSize(250,300);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.green);

        title.setForeground(Color.yellow);
        title.setFont(tfont);
        c.add(title);

        user.setForeground(Color.yellow);
        user.setFont(regfont);
        c.add(user);

        userfield.setForeground(Color.black);
        c.add(userfield);

        pass.setForeground(Color.yellow);
        pass.setFont(regfont);
        c.add(pass);

        passfield.setForeground(Color.black);
        passfield.setEchoChar('@');
        c.add(passfield);

        submit.setForeground(Color.blue);
        c.add(submit);

        clear.setForeground(Color.blue);
        c.add(clear);

        approved.setForeground(Color.red);
        approved.setFont(regfont);
        c.add(approved);

        userfield.requestFocus();
        userfield.addActionListener(this);
        passfield.addActionListener(this);
        submit.addActionListener(this);
        clear.addActionListener(this);

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        int i;
        char[] passin = passfield.getPassword();
        String passval = String.valueOf(passin);

        if (e.getSource() == submit)
        {
            for (i = 0; i < valid.length; i++)
            {
                if (valid[i].equalsIgnoreCase(passval))
                {
                    c.setBackground(Color.darkGray);

                    c.remove(title);
                    c.remove(user);
                    c.remove(pass);
                    c.remove(passfield);
                    c.remove(userfield);
                    c.remove(submit);
                    c.remove(clear);

                    name.setForeground(Color.green);
                    name.setFont(tfont);
                    c.add(name);

                    approved.setText("Access Granted");
                    approved.setForeground(Color.green);
                    c.add(approved);

                    back.setForeground(Color.red);
                    c.add(back);

                    back.addActionListener(this);
                }

                else
                {
                    approved.setForeground(Color.red);
                    approved.setText("Access Denied");
                    passfield.setEnabled(false);
                    userfield.setEnabled(false);
                    submit.setEnabled(false);
                }
            }
        }

        else if (e.getSource() == clear)
        {
            userfield.setText("");
            passfield.setText("");
            approved.setText("");
            userfield.setEnabled(true);
            passfield.setEnabled(true);
            submit.setEnabled(true);
        }

        else if(e.getSource() == back)
        {
            c.setBackground(Color.green);

            c.add(title);
            c.add(user);
            c.add(userfield);
            c.add(pass);
            c.add(passfield);
            c.add(submit);
            c.add(clear);
            c.add(approved);

            userfield.requestFocus();
            userfield.setEnabled(true);
            passfield.setEnabled(true);
            submit.setEnabled(true);

            c.remove(name);
            c.remove(back);

            approved.setText("");
            userfield.setText("");
            passfield.setText("");
        }
    }

    public static void main(String[] args)
    {
        Login l = new Login();
    }
}