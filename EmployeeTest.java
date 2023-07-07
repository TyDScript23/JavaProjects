package com.example.objectsandclasses2;

import java.io.*;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) throws IOException
    {
        Employee[] e = new Employee[3];
        int i, j;
        String name, title;
        double salary;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < e.length; i++) {
            System.out.print("Enter name: ");
            name = br.readLine();
            System.out.print("Enter starting salary: ");
            salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter the title: ");
            title = sc.nextLine();
            e[i]= new Employee(name, title, salary);
        }

        for (j = 0; j < e.length; j++) {
            e[j].raise();
            e[j].printEmployee();
        }
    }
}
