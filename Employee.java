package com.example.objectsandclasses2;

public class Employee {
    private final String name;
    private String title;
    private double salary;

    public Employee(String n)
    {
        name = n;
        salary = 50000;
    }

    public Employee(String n, String t, double s)
    {
        name = n;
        title = t;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public String getTitle()
    {
        return title;
    }

    public double getRate()
    {
        return salary;
    }

    public void raise()
    {
        salary *= 1.05;
    }

    public void printEmployee()
    {
        System.out.println("Name is " + name);
        System.out.printf("Salary is %.2f\n", salary);
    }
}
