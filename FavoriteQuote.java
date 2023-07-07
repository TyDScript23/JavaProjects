package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class FavoriteQuote extends JFrame{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Quote Frame");
        JLabel quote = new JLabel("Java is Fun!");
        Font ravie = new Font("Ravie", Font.BOLD, 24);
        FlowLayout flow = new FlowLayout();
        Container c;

        c = f.getContentPane();

        c.setLayout(flow);
        c.setBackground(Color.cyan);

        quote.setForeground(Color.blue);
        quote.setFont(ravie);
        c.add(quote);

        f.setTitle("Quote Frame Title");
        f.setSize(275, 100);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }
}
