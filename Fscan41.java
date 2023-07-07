package com.example.fileactions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Fscan41 {
    public static void main(String[] args) throws FileNotFoundException
    {
        int num1, num2;
        double avg;
        Scanner sc = new Scanner(new FileReader("avgin.txt"));
// connect sc Scanner object to file
        PrintWriter pw = new PrintWriter("avgout.txt");
// connect pw PrintWriter object to file
        while (sc.hasNext())	// while more input from file
        {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            avg = (num1 + num2) / 2.0;
            pw.printf("The average is %.2f\n", avg);
        }
        pw.close();		// close output file
    }

}
