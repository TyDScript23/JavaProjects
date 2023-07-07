package com.example.arraypractice;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("The first number is " + numbers[0]);

        numbers[0] = 7;

        System.out.println("The first number is " + numbers[0]);

        //System.out.println(numbers[10]);

        System.out.println("The size of the array is "  + numbers.length);

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(vowels);

        char[] vowels2 = new char[5];

        System.out.println(vowels2);

        vowels2[0] = 'a';
        vowels2[1] = 'e';
        vowels2[2] = 'i';
        vowels2[3] = 'o';
        vowels2[4] = 'u';

        System.out.println(vowels2);

        double[] raceTimes = new double[7];

      /* for (int i = 0; i < raceTimes.length; i++)
        {
            System.out.println("Enter the time for runner " + (i+1) + ": ");
            raceTimes[i] = keyboard.nextDouble();
        }*/

        /*for (int i = 0; i < raceTimes.length; i++)
        {
            System.out.println("The time for runner "  + (i+1) + " is " + raceTimes[i] );
        }*/

        //raceTimes =new double[5];

        //System.out.println();

        /*for (int i = 0; i < raceTimes.length; i++)
        {
            System.out.println("The time for runner "  + (i+1) + " is " + raceTimes[i] );
        }*/

        //System.out.println();

        //String[] names = new String[4];
        //System.out.println(names[0]);

        String[] firstNames = { "Adam", "Sammy", "Maddie", "Sophia", "Taylor"};

        for (String firstName : firstNames) {
            System.out.print(firstName + " ");
        }

        firstNames[0] = "Owen";

        System.out.println();

        /*for (String firstName : firstNames) {
            System.out.print(firstName + " ");
        }*/

        System.out.println();

        raceTimes[0] = 15.1;
        raceTimes[1] = 16.1;
        raceTimes[2] = 17.1;
        raceTimes[3] = 18.1;
        raceTimes[4] = 19.1;

        printArray(raceTimes);

        printArray(firstNames);

        Student[] students = new Student[4];

        students[0] = new Student();

        Student s = new Student("Neo", "Anderson", "H001", "CS", 88, 90);
        students[1] = s;

        students[2] = new Student("Jason", "Bourne", "H002", "Math", 99, 91);
        students[3] = new Student("Judie", "Dench", "H004", "Finance", 82,85);

        printArray(students);
    }

    public static void printArray(Student[] values)
    {
        for(int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }

    //create a method that prints out the content of an array

    public static void printArray(double[] values)
    {
        for(int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }

    public static void printArray(String[] values)
    {
        for(int i = 0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }
    }
}
