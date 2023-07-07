package com.example.jframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grade extends JFrame implements ActionListener {
    JLabel reportlabel = new JLabel("HVCC's Grade Reporter");
    JButton calcbutton = new JButton("Calculate");
    JLabel promptlabel1 = new JLabel("Enter your 1st grade");
    JTextField gradetext1 = new JTextField(5);
    JLabel promptlabel2 = new JLabel("Enter your 2nd grade");
    JTextField gradetext2 = new JTextField(5);
    Font reportfont = new Font("Courier", Font.BOLD, 20);
    JLabel letterlabel = new JLabel();
    Container c;
    public Grade()
    {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.green);	// green for HVCC!!!
        reportlabel.setFont(reportfont);
        c.add(reportlabel);
        c.add(calcbutton);
        c.add(promptlabel1);
        c.add(gradetext1);
        c.add(promptlabel2);
        c.add(gradetext2);
        calcbutton.addActionListener(this);
// can click button to calculate
        gradetext2.addActionListener(this);
// or hit enter after entering 2nd grade
        gradetext1.requestFocus();
// put cursor in 1st grade JTextField
        c.add(letterlabel);
        setVisible(true);
    }     // actionPerformed continued

    public void actionPerformed(ActionEvent e)
    {
        int grade1, grade2;
        double avg;
        char letter;

        grade1 = Integer.parseInt(gradetext1.getText());
        grade2 = Integer.parseInt(gradetext2.getText());

        avg = (grade1 + grade2) / 2.0;

        if (avg >= 90)
            letter = 'A';
        else if (avg >= 80)
            letter = 'B';
        else if (avg >= 70)
            letter = 'C';
        else if (avg >= 60)
            letter = 'D';
        else
            letter = 'F';

        letterlabel.setText("Final Grade:  " + 	letter);
// display result in separate Label
    }
    public static void main(String[] args)
    {
        Grade f = new Grade();
    }

}
