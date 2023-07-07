package com.example.objectsandclasses;

import javax.swing.JOptionPane;
import java.util.StringTokenizer;

public class CourseDemo {
    public static void main(String[] args)
    {
        String name, last, first, officeNum;
        name = JOptionPane.showInputDialog("Enter the name of your instructor:");

        StringTokenizer st = new StringTokenizer(name, " ");

        last = st.nextToken();

        first = st.nextToken();

        officeNum = JOptionPane.showInputDialog("Enter the office number of your instructor:");

        Instructor myInstructor = new Instructor(last, first, officeNum);

        TextBook myTextBook = new TextBook("Starting Out with Java", "Gaddis", "Pearson");

        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);

        System.out.println(myCourse);
    }
}
