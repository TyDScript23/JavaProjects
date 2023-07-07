package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class lay1ffa extends JFrame
{
    JCheckBox bike = new JCheckBox("I have a bike");
    JCheckBox car = new JCheckBox("I have a car");
    JButton submit = new JButton("Submit");
    JLabel lab1 = new JLabel("If you click the \"Submit\" button, the form-data will be sent to a");
    JLabel lab2 = new JLabel("page called \"html_form_action.asp\".");
    Container c;

    // declare panels for north, center, and south

    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel center = new JPanel();





    // declare borderlayout for applet, gridlayout for north and south, flowlayout for center

BorderLayout bord = new BorderLayout();
GridLayout grid = new GridLayout(2,1);
FlowLayout flow = new FlowLayout();



    public lay1ffa()
    {
        // change size to match output
            setSize(375, 160);


        c = getContentPane();

        // set container's layout to border, north and south's to grid, center's to flow

c.setLayout(bord);
north.setLayout(grid);
south. setLayout(grid);
center.setLayout(flow);




        // add checkboxes to north panel and north panel to north of applet

north.add(bike);
north.add(car);
c.add(north, bord.NORTH);


        flow.setAlignment(FlowLayout.LEFT); // aligns button on left of center panel

        // add button to center panel and center panel to center of applet

center.add(submit);
c.add(center, bord.CENTER);


        // add labels to south panel and south panel to south of applet
        south.add(lab1);
        south.add(lab2);
        c.add(south, bord.SOUTH);

setVisible(true);

    }

    public static void main(String[] args)
    {
         new lay1ffa();
    }
}
