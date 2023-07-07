package com.example.graphicsanddrawing;
import java.awt.*;
import javax.swing.*;

    public class DrawCat extends JFrame
    {
        Font f = new Font("Serif", Font.ITALIC, 18);
        Container c;
        public DrawCat()
        {
            setSize(300, 300);
            Color backcolor = new Color(200, 200, 255);
            // new Color for background   light purple!
            c = getContentPane();
            c.setBackground(backcolor);
            setVisible(true);
        }
        public void paint(Graphics g)
        {
            super.paint(g);
            g.setColor(Color.black);
            g.drawRect(50, 50, 60, 60);
            /* start at x position 50, y position 50 and draw 60 pixels wide and 60 pixels high for the head */
            g.setColor(Color.gray);
            g.fill3DRect(80, 225, 140, 5, true); //raised gray tail   filled
            g.setColor(Color.lightGray);
            g.fillOval(20, 110, 120, 120); //light gray body   filled
            g.setColor(Color.black);
            g.drawOval(20, 110, 120, 120); //paint body border black
            g.fillOval(75, 75, 10, 10); // small 10 x 10 pixel oval black nose
            g.setColor(Color.blue);
            g.fillOval(60, 60, 10, 10);	// blue eyes   right
            g.fillOval(90, 60, 10, 10);	// left
            g.setColor(Color.black);
            g.drawLine(50, 50, 60, 30);	// ears   outside rt /
            g.drawLine(60, 30, 70, 50);	// inside right \
            g.drawLine(110, 50, 100, 30);	// outside left \
            g.drawLine(100, 30, 90, 50);	// inside left /
            g.setColor(Color.red);			// red lips
            g.drawArc(60, 80, 40, 20, 180, 180);
            /* lower circular 180 degrees   from left to right   start at 180 degress and continue around counter clockwise 180 degrees */
            g.setColor(Color.black);		// name in black type
            g.setFont(f);
            g.drawString("Augustine", 200, 50);	// draw name
        }
        public static void main(String[] args)
        {
            new DrawCat();
        }
    }

