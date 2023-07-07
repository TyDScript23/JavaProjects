package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class ItemsList extends JFrame implements ItemListener, ListSelectionListener {
    JLabel question = new JLabel("Clicking a JComboBox results in");
    JLabel yanks = new JLabel("Select your yankee opponents");

    String[] opponames = {"Red Socks", "Astros", "Mets", "Blue Jays", "Rays"};

    JComboBox<String> answers = new JComboBox<String>();
    JList<String> opponents = new JList<String>(opponames);

    JRadioButton ans1 = new JRadioButton("Item Checked");
    JRadioButton ans2 = new JRadioButton("Item Deleted");
    JRadioButton ans3 = new JRadioButton("Item Displayed");
    JRadioButton ans4 = new JRadioButton("Item Clicked");
    ButtonGroup group = new ButtonGroup();

    JLabel results = new JLabel();
    JLabel teams = new JLabel();
    FlowLayout flow = new FlowLayout();
    Container c;

    public ItemsList() {
        setSize(400, 300);
        c = getContentPane();
        c.setLayout(flow);
        c.setBackground(Color.cyan);
        question.setForeground(Color.blue);
        c.add(question);

        ans1.setForeground(Color.blue);
        ans1.setBackground(Color.cyan);
        ans2.setForeground(Color.blue);
        ans2.setBackground(Color.cyan);
        ans3.setForeground(Color.blue);
        ans3.setBackground(Color.cyan);
        ans4.setForeground(Color.blue);
        ans4.setBackground(Color.cyan);
        group.add(ans1);
        group.add(ans2);
        group.add(ans3);
        group.add(ans4);
        c.add(ans1);
        c.add(ans2);
        c.add(ans3);
        c.add(ans4);

        results.setForeground(Color.blue);
        c.add(results);

        yanks.setForeground(Color.blue);
        c.add(yanks);
        opponents.setForeground(Color.blue);
        c.add(opponents);
        teams.setForeground(Color.blue);
        c.add(teams);

        opponents.addListSelectionListener(this);
        ans1.addItemListener(this);
        ans2.addItemListener(this);
        ans3.addItemListener(this);
        ans4.addItemListener(this);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
       if (ans3.isSelected())
           results.setText("Great!!!");
       else
           results.setText("Try Again");
    }

    public void valueChanged(ListSelectionEvent e)
    {
        int i;
        int[] selectteams;
        selectteams = opponents.getSelectedIndices();
        teams.setText("");

        for (i=0; i < selectteams.length;i++)
            teams.setText(teams.getText() + " " + opponames[selectteams[i]] );

        int response;
        response = answers.getSelectedIndex();
        if (response == 2)
            results.setText("Great!!!");
        else
            results.setText("Try Again");
    }

    public static void main(String[] args)
    {
        new ItemsList();
    }
}
