package com.example.objectsandclasses2;

public class Exam {

    private int score;

    public void setscore(int s)
    {
        score = s;
    }

    public void print()	// print() method
    {
        System.out.println("Exam score is " + score);
    }

    public void print(int b)	// overloaded print() method
    {
        System.out.println("Exam score with bonus is " + (score + b));
    }
}
