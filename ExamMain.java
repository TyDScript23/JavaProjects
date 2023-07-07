package com.example.objectsandclasses2;

public class ExamMain {
    public static void main(String[] args)
    {
        Exam e = new Exam();
        int bonus = 5;
        e.setscore(85);
        e.print();	// call with no argument
        e.print(bonus);	// call with int argument
    }

}
