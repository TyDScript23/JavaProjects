package com.example.codingprojects;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DavisPayrollP3 {

    public static void main(String[] args) throws IOException{

        File file= new File("employees2.txt");

        Employee employee = new Employee();
        Employee[] empArray = new Employee[4];

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            int index = 0;
            String first,middle,last,email;
            int id;
            char level;

            String company = inputFile.nextLine();
            System.out.println("Company Name: " + company);
            System.out.println();

            while (inputFile.hasNextLine()) {

                employee.setFirstName(inputFile.nextLine());
                first = employee.getFirstName();

                employee.setMiddleInitial(inputFile.nextLine());
                middle = employee.getMiddleInitial();

                employee.setLastName(inputFile.nextLine());
                last = employee.getLastName();

                employee.setID(inputFile.nextInt());
                id = employee.getID();

                inputFile.nextLine();

                employee.setLevel(inputFile.nextLine().charAt(0));
                level = employee.getLevel();

                String lowFirst = first.toLowerCase();
                String lowMid = middle.toLowerCase();
                String lowLast = last.toLowerCase();

                employee.setEmail(lowFirst, lowMid, lowLast);
                email = employee.getEmail();

                Employee employInfo = new Employee(first, last, middle, id, level, email);

                empArray[index] = employInfo;

                index++;
            }
            processEmployees(empArray);
        }
    }

    public static void processEmployees(Employee[] employees)
    {
        Scanner keyboard = new Scanner(System.in);

        double hours;

        for ( int i = 0; i < 4; i++)
        {
            System.out.print("Enter amount of hours for ");
            employees[i].getFullName();
            System.out.println(": ");
            hours = keyboard.nextDouble();
            employees[i].calculatePay(employees[i].getLevel() , hours);
            employees[i].display();
        }
    }
}
