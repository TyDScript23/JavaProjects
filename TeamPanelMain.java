package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class TeamPanelMain  extends JFrame{
    TeamPanel rangers = new TeamPanel(Color.blue, Color.red, "New York Rangers");
    TeamPanel vikings = new TeamPanel(Color.green, Color.yellow, "Hudson Valley Vikings");
    TeamPanel yankees = new TeamPanel(Color.blue, Color.darkGray, "New York Yankees");
    TeamPanel valleycats = new TeamPanel(Color.red, Color.green, "Tri-City ValleyCats");
    TeamPanel giants = new TeamPanel(Color.blue, Color.red, "New York Giants");
    Container c;
    GridLayout grid = new GridLayout(5,1);

    public TeamPanelMain()
    {
        setSize(550,350);
        c = getContentPane();
        c.setLayout(grid);
        c.add(rangers);
        c.add(vikings);
        c.add(yankees);
        c.add(valleycats);
        c.add(giants);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new TeamPanelMain();
    }
}
