package com.example.objectsandclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderMethod {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        String name1, name2;
        System.out.print("Enter 1st name:  ");
        name1 = br.readLine();
        System.out.print("Enter 2nd name:  ");
        name2 = sc.nextLine();
        System.out.println(name1 + " " + name2);

    }
}
