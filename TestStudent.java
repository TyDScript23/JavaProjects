package com.example.student;

import com.example.arraypractice.Student;

public class TestStudent {
    public static void main(String[] args)
    {
        System.out.println("Creating student...\n");
        Student myStudent = new Student();

        myStudent.setFirstName("Ace");
        myStudent.setLastName("Ventura");
        myStudent.setMiddleInitial('M');
        myStudent.setMidtermGrade(78);
        myStudent.setFinalExamGrade(99);
        myStudent.setMajor("Pet Detective");
        myStudent.setID("777");

        /*System.out.println("Student's first name is " + myStudent.getFirstName());
        System.out.println("Student's middle initial is " + myStudent.getMiddleInitial());
        System.out.println("Student's last name is " + myStudent.getLastName());
        System.out.println("Student's ID is " + myStudent.getID());
        System.out.println("Student's major is " + myStudent.getMajor());
        System.out.println("Student's midterm grade is " + myStudent.getMidtermGrade());
        System.out.println("Student's final exam grade is " + myStudent.getFinalExamGrade());
        System.out.println("The student's full name is " + myStudent.getFullName() + "\n");*/

        Student myStudent2 = new Student("Elwood", "Blues");

        Student myStudent3 = new Student("Jake", "Elwood", "J689", "Music Theory");

        Student myStudent4 = new Student("Beldar", "Conehead", "345L",
                "Drivers Education", 99,99);

        /*System.out.println(myStudent);
        System.out.println(myStudent2);
        System.out.println(myStudent3);
        System.out.println(myStudent4);*/

        myStudent2.setMiddleInitial('B');

        myStudent.display();
        myStudent2.display();
        myStudent3.display();
        myStudent4.display();

        /*myStudent.toString();
        myStudent2.toString();
        myStudent3.toString();
        myStudent4.toString();*/

        /*System.out.println(myStudent);
        System.out.println(myStudent2);
        System.out.println(myStudent3);
        System.out.println(myStudent4);*/
    }
}
