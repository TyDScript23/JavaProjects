package com.example.objectsandclasses2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class EmployeeTest2 {
    public static void main(String[] args)throws IOException {
        Employee[] e = new Employee[3];
        e[0] = new Employee("Sara", "CEO", 50000);
        e[1] =  new Employee("Karl", "Overlord", 22000);
        e[2] = new Employee("Edward", "Bagging", 6.50);

        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        boolean found = false;
        String name;
        int i, j;

        System.out.println("Employees with rate > $10 an hour");

        for (i = 0; i < e.length; i++)
                System.out.println(e[i].getName() + " - " + e[i].getTitle());

        System.out.print("\nEnter name to find title: ");
        name = br4.readLine();

        for (j = 0; j < e.length; j++)
        {
            if (name.equalsIgnoreCase(e[j].getName()))
            {
                System.out.println("The title is: " + e[j].getTitle());
                found = true;
            }
        }

        if (!found)
            System.out.println("Employee not found");
    }
}
