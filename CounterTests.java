package com.example.classmethods;

public class CounterTests {
    public static void main(String[] args)
    {
        Counter numbers = new Counter(0);

        numbers.decrement();
        numbers.decrement();
        numbers.increment();
        numbers.increment();
        numbers.increment();
        numbers.increment();
        numbers.increment();
        System.out.println("The value of the counter is: " + numbers.getValue());

    }
}
