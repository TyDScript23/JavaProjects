package com.example.arraypractice;
import java.util.Scanner;

public class DisplayTestScores {
    public static void main(String[] args)
    {
        int numTests;
        int[] tests;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many tests do you have? ");
        numTests = keyboard.nextInt();

        tests = new int[numTests];

        for (int index = 0; index < tests.length; index++)
        {
            System.out.print("Enter test score " +
                    (index + 1) + ": ");
            tests[index] = keyboard.nextInt();
        }

        System.out.println();
        System.out.println("Here are the scores you entered:");
        for (int index = 0; index < tests.length; index++)
            System.out.print(tests[index] + " ");
    }
}
