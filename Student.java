package com.example.student;

public class Student
{
    private int hours;
    private double gpa;
    private String stuname;

    private String firstName;
    private String lastName;
    private char middleInitial;
    private String id;
    private String major;
    private int midtermGrade;
    private int finalExamGrade;

    public Student()
    {
        firstName = null;
        lastName = null;
        id = null;
        major = null;
        midtermGrade= -1;
        finalExamGrade = -1;
        //setting middle initial to null character
        middleInitial = '\0';
    }

    public Student(String fName, String lName)
    {
        firstName = fName;
        lastName=lName;
    }

    public Student(String fName, String lName, String i, String m)
    {
        firstName = fName;
        lastName = lName;
        id = i;
        major = m;
        midtermGrade= -1;
        finalExamGrade = -1;
    }

    public Student(String fName, String lName, String i, String m, int mid, int fin)
    {
        firstName = fName;
        lastName = lName;
        id = i;
        major = m;
        midtermGrade= mid;
        finalExamGrade = fin;
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

    public void setMajor(String maj)
    {
        major = maj;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMidtermGrade(int mid)
    {
        midtermGrade = mid;
    }

    public int getMidtermGrade()
    {
        return midtermGrade;
    }

    public void setFinalExamGrade(int fin)
    {
        finalExamGrade=fin;
    }

    public int getFinalExamGrade()
    {
        return finalExamGrade;
    }

    public double calculateAverage()
    {
        if(midtermGrade == -1 || finalExamGrade == -1)
        {
            return -1;
        }
        else
        {
            return (midtermGrade + finalExamGrade) / 2.0;
        }
    }

    public char calculateLetterGrade()
    {
        double average = calculateAverage();

        if(average >= 90 && average <= 100)
            return 'A';
        else if (average >= 80 && average <= 89)
            return 'B';
        else if (average >= 70 && average <= 79)
            return 'C';
        else if (average >= 60 && average <= 69)
            return 'D';
        else if (average >= 0 && average <= 59)
            return 'F';
        else
            return 'N';
    }

    public void setID(String ident)
    {
        id = ident;
    }

    public String getID()
    {
        return id;
    }

    public void setMiddleInitial(char m)
    {
        middleInitial = m;
    }

    public char getMiddleInitial()
    {
        return middleInitial;
    }

    public String getFullName()
    {
        if (firstName == null || lastName == null)
        {
            return null;
        }
        else if (middleInitial == '\0')
        {
            return firstName + " " + lastName;
        }
        else
            return firstName + " " + middleInitial + ". " + lastName;
    }

    public void sethours(int hrs)
    {
        this.hours = hrs;
    }

    public void setgpa(double grptavg)
    {
        gpa = grptavg;
    }

    public int gethours()
    {
        return hours;
    }

    public double getgpa()
    {
        return gpa;
    }


    public void addcourse(int coursehours, double grade) {
        double weightedgpa;
        weightedgpa = hours * gpa;
        hours += coursehours;
        weightedgpa += grade * coursehours;
        gpa = weightedgpa / hours;
    }

    public void display()
    {
        if(getFullName() == null) {
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }
        else {
            System.out.println("\n" + getFullName());
            System.out.println("ID: " + id);
            System.out.println("Major: " + major);
            System.out.println("Midterm Grade: " + midtermGrade);
            System.out.println("Final Exam Grade: " + finalExamGrade);
            if (calculateAverage() != -1)
                System.out.println("Average: " + calculateAverage());
            System.out.println("Final Grade: " + calculateLetterGrade());
        }
    }

    public String toString()
    {
        String s = "\nFirst Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nID: " + id +
                "\nMajor: " + major +
                "\nMidterm Grade: " + midtermGrade +
                "\nFinal Exam Grade: "  + finalExamGrade + "\n\n";

        return s;
    }
}
