package com.example.codingprojects;

public class Employee
{
    private String firstName;
    private String lastName;
    private String middleInitial;
    private int id;
    private char level;
    private double payment;
    private String message;

    public Employee()
    {
        firstName = null;
        lastName = null;
        id = 0;
        middleInitial = null;
        level = 'X';
    }

    public Employee(String fName, String lName, String m, int i, char l , String email) {
        firstName = fName;
        lastName = lName;
        id = i;
        middleInitial = m;
        level = l;
        message = email;
    }

    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lName)
    {
        lastName=lName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setID(int ident)
    {
        id = ident;
    }

    public int getID()
    {
        return id;
    }

    public void setLevel(char l)
    {
        level = l;
    }

    public char getLevel()
    {
        return level;
    }

    public void setMiddleInitial(String m)
    {
        middleInitial = m;
    }

    public String getMiddleInitial()
    {
        return middleInitial;
    }

    public void calculatePay(char choice, double hours) {

        double grossPay = 0;

        level = choice;

        if (level == 'A')
            grossPay = 12.00 * hours;
        else {
            if (level == 'B')
                grossPay = 14.50 * hours;
            else {
                if (level == 'C')
                    grossPay = 16.00 * hours;
                else {
                    if (level == 'D')
                        grossPay = 20.00 * hours;
                    else
                        System.out.println("There is no payrate designated to this letter!!!");
                }
            }
        }
        payment =  grossPay;
    }

    public void setEmail(String f, String l, String m)
    {
        message = f + "." + l + "." + m + "@hvcc.edu";
    }

    public String getEmail()
    {
        return message;
    }

    public void getFullName()
    {
        System.out.print(firstName + " "+ middleInitial + " " + lastName);
    }

    public void display()
    {
        System.out.println("Employee's Name: " + firstName + " "
        + middleInitial + " " + lastName);
        System.out.println("Employee's ID Number: " + id );
        System.out.println("Employee's Level: " + level);
        System.out.println("Employee's Email Address: " + message);
        System.out.println();
        System.out.printf("Employee's pay: $%.2f\n",payment);
        System.out.println();
    }
}
