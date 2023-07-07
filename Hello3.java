package com.example.jframe;

import java.awt.*;
import javax.swing.*;

public class Hello3 extends JFrame {
    // properties
    JLabel salutation = new JLabel("Hello World!");
    // declares an object of type JLabel with text
    Container c;  // to contain the JLabel

    // methods
    public Hello3()  // constructor
    {
        c = getContentPane();
        // get the type of Container for ourself from JFrame
        c.add(salutation); // adds JLabel to JFrame
        // call set methods from JFrame to change our properties
        setTitle("Hello Title");  // change title bar
        setSize(100, 50);  // small - 100 pixels wide by 50 pixels high
        setVisible(true);  // want to see the JFrame
    }

    // construct ourself in an application with a main
    public static void main(String[] args)
    {
        // construct ourself - a hello3 frame
        Hello3 f = new Hello3();
    }

}
