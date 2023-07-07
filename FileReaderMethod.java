package com.example.fileactions;

import java.io.*;
import java.util.Scanner;

public class FileReaderMethod {
    public static void main(String[] args) throws IOException
    {
        double miles, gallons2, mpg;
        String filenamein, filenameout;
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        Scanner sc;
        PrintWriter pw;

        System.out.print("Enter name of input file: ");
        filenamein = br.readLine();
        System.out.print("Enter the name of the output file: ");
        filenameout = br.readLine();

        sc = new Scanner(new FileReader(filenamein));
        pw = new PrintWriter(filenameout);

        while(sc.hasNext())
        {
            miles = sc.nextDouble();
            gallons2 = sc.nextDouble();
            mpg = miles / gallons2;
            pw.printf("Miles per gallon is %.1f\n", mpg);
            pw.printf("Miles per gallon is %.1f\n", mpg);
        }
        sc.close();
        pw.close();
    }
}
