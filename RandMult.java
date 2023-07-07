package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandMult extends JFrame implements ActionListener {
    int num1 = (int)(Math.random() * 12 + 1);
    int num2 = (int)(Math.random() * 12 + 1);
    JLabel qlab = new JLabel("What is " + num1 + " * " + num2 + " = ");
    JTextField qtext = new JTextField(5);
    JButton abut = new JButton("Answer");

    JButton nbut = new JButton("New Question");

    Font resfont = new Font("Ravie", Font.BOLD,20);
    JLabel reslab = new JLabel();
    Container c;
    FlowLayout flow = new FlowLayout();

    public RandMult()
    {
        setSize(275,125);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.cyan);
        qlab.setForeground(Color.blue);
        c.add(qlab);
        qtext.setForeground(Color.blue);
        c.add(qtext);
        abut.setForeground(Color.blue);
        c.add(abut);

        nbut.setForeground(Color.blue);
        c.add(nbut);

        reslab.setForeground(Color.blue);
        reslab.setFont(resfont);
        c.add(reslab);
        qtext.requestFocus();
        qtext.addActionListener(this);
        abut.addActionListener(this);

        nbut.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == qtext || e.getSource() == abut) {
            int product = num1 * num2;
            String user = qtext.getText();

            if (String.valueOf(product).equals(user)) {
                reslab.setText("Correct");
                qtext.setEnabled(false);
                abut.setEnabled(false);
            }
            else {
                reslab.setText("Incorrect");
            }
        }
        else if (e.getSource() == nbut) {
            num1 = (int) (Math.random() * 12 + 1);
            num2 = (int) (Math.random() * 12 + 1);
            qlab.setText("What is " + num1 + " * " + num2 + " = ");
            qtext.setText("");
            reslab.setText("");
            qtext.setEnabled(true);
            abut.setEnabled(true);
            qtext.requestFocus();
        }
    }

    public static void main(String[] args)
    {
        RandMult f = new RandMult();
    }
}
