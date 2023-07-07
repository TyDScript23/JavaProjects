package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FrameQuestion extends JFrame implements ActionListener, WindowListener {
    JLabel question = new JLabel("What does this frame call itself?");
    JButton answer = new JButton("Answer");
    Font resfont = new Font("TimesRoman", Font.BOLD,36);
    JLabel results = new JLabel();
    Container c;
    BorderLayout bord = new BorderLayout();
    JPanel west = new JPanel();
    JLabel blank = new JLabel();
    GridLayout grid = new GridLayout(2,1);

    public FrameQuestion()
    {
        setSize(250, 125);
        c = getContentPane();
        c.setLayout(bord);
        c.setBackground(Color.cyan);
        question.setForeground(Color.blue);
        question.setHorizontalAlignment(JLabel.CENTER);
        c.add(question, bord.NORTH);

        west.setLayout(grid);
        west.setBackground(Color.orange);
        answer.setForeground(Color.blue);
        west.add(answer);
        west.add(blank);
        c.add(west,bord.WEST);

        results.setForeground(Color.blue);
        results.setFont(resfont);
        c.add(results, bord.EAST);
        answer.addActionListener(this);
        addWindowListener(this);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        results.setText("this");
    }

    public void windowOpened(WindowEvent e)
    {
        c.setBackground(Color.orange);
        west.setBackground(Color.orange);
    }

    public void windowActivated(WindowEvent e)
    {
        c.setBackground(Color.red);
        west.setBackground(Color.red);
    }

    public void windowDeactivated(WindowEvent e)
    {
        c.setBackground(Color.pink);
    }

    public void windowDeiconified(WindowEvent e) {
        results.setText("");
    }

    public void windowIconified(WindowEvent e){}
    public void windowClosing(WindowEvent e){}
    public void windowClosed(WindowEvent e){}

    public static void main(String[] args)
    {
        new FrameQuestion();
    }
}
