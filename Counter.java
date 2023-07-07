package com.example.classmethods;

public class Counter {
    private int counter;

    Counter(int count)
    {
        counter = count;
    }

    public void increment()
    {
        counter++;
    }

    public void decrement()
    {
        counter--;
    }

    public int getValue()
    {
        return counter;
    }
}
