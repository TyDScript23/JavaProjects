package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class HelloBase extends JFrame {
    JLabel quest = new JLabel("Who's the best baseball team?");
    Font tnr = new Font("TimesRoman", Font.BOLD, 10);
    JTextField reply = new JTextField("NY Yankees", 15);
    // JTextField with default value and size
    JCheckBox select = new JCheckBox("Yankees");
    // JCheckBox with label
    JCheckBox select98 = new JCheckBox("1998 Yankees");
    JButton submit = new JButton("Submit");
    // JButton with label on button
    Container c;
    FlowLayout flow = new FlowLayout();

    public HelloBase()
    {
        setSize(350, 150);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.cyan);
        quest.setForeground(Color.blue);
        quest.setFont(tnr);
        c.add(quest);		// add JLabel
        c.add(reply);			// JTextField
        c.add(select);			// JCheckBox
        c.add(select98);		// JCheckBox
        c.add(submit);			// JButton
        reply.requestFocus(); //put insertion point in JTextField
        select.setSelected(false); // Yankees checkbox unchecked
        select98.setSelected(true); // 1998 Yankees checked
        setVisible(true);
    }

    public static void main(String[] args)
    {
       HelloBase f = new HelloBase();  // construct ourself
    }

}
