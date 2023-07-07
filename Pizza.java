package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pizza extends JFrame implements ActionListener {
    JLabel orderlabel = new JLabel("Pizza Order Form");
    JLabel toppingslabel = new JLabel
            ("Choose your toppings ($1 each)");
    JLabel pricelabel = new JLabel
            ("                             ");
    JCheckBox eggplant = new JCheckBox("Eggplant");
    JCheckBox anchoives = new JCheckBox("Anchoives");
    JCheckBox hotpeppers = new JCheckBox("Hot Peppers");
    JButton orderbutton = new JButton("Order");
    Font orderfont = new Font("Helvetica", Font.BOLD, 36);
    Font pricefont = new Font("Helvetica", Font.PLAIN, 18);
    Container c;
    public Pizza()
    {
        setSize(300, 500);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.red);
        orderlabel.setFont(orderfont);
        pricelabel.setFont(pricefont);
        c.add(orderlabel);
        c.add(toppingslabel);
        c.add(eggplant);
        c.add(anchoives);
        c.add(hotpeppers);
        c.add(orderbutton);
        c.add(pricelabel);
        orderbutton.addActionListener(this);
        setVisible(true);
    }
// actionPerformed() continued

    public void actionPerformed(ActionEvent e)
    {
        double price;
        int count = 0;
        boolean egg, anch, pep;
        egg = eggplant.isSelected();
// isSelected returns true or false
        anch = anchoives.isSelected();
        pep = hotpeppers.isSelected();
        if (egg)
            count++;
        if (anch)
            count++;
        if (pep)
            count++;
        price = 8 + count;
// pizza + toppings
        pricelabel.setText(String.format("Your price: $%.2f",price));
    }

    public static void main(String[] args)
    {
        Pizza f = new Pizza();
    }

}
