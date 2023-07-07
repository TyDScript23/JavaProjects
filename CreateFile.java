package com.example.fileactions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args)  throws IOException
    {
        String filename;
        String friendName;
        int numFriends;
        String inputString;
        char choice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you wish to create a friend file? (Y or N)");
        inputString = keyboard.nextLine();
        choice = inputString.charAt(0);

        if (choice=='Y') {

            System.out.print("How many friends do you have? ");
            numFriends = keyboard.nextInt();

            keyboard.nextLine();

            System.out.print("Enter the filename: ");
            filename = keyboard.nextLine();

            PrintWriter outputFile = new PrintWriter(filename);

            for (int i = 1; i <= numFriends; i++) {
                System.out.print("Enter the name of the friend " + "number " + i + ": ");
                friendName = keyboard.nextLine();

                outputFile.println(friendName);
            }
            outputFile.close();
            System.out.println("Data written to the file.");

            FileWriter fwriter = new FileWriter("friendName.txt", true);
            PrintWriter outputFile2 = new PrintWriter(fwriter);
            outputFile2.println("Jack");
            outputFile2.println("Gabby");
            outputFile2.println("Jameson");
            outputFile2.close();
        }

        System.out.print("Enter the name of a file: ");
        String filename2 = keyboard.nextLine();
        File file = new File(filename2);
        Scanner inputFile = new Scanner(file);

        System.out.println("Do you wish to read the first line of a file? (Y or N)");
        inputString = keyboard.nextLine();
        choice = inputString.charAt(0);

        if (choice=='Y') {
            String line = inputFile.nextLine();
            System.out.println("The first line in the file is:");
            System.out.println(line);
            inputFile.close();
        }

        //reads Scanner input for integers and adds them to total!!!

        System.out.println("Do you wish to find the number of ints in a file? (Y or N)");
        inputString = keyboard.nextLine();
        choice = inputString.charAt(0);

        if (choice == 'Y') {
            int total = 0;
            while (inputFile.hasNextInt()) {
                total += inputFile.nextInt();
            }
            System.out.println("The number of integers is: " + total);
        }

        // reads number of lines in file and stores in count
        int count = 0;

        System.out.println("Do you wish to know how many lines are in a file? (Y or N)");
        inputString = keyboard.nextLine();
        choice = inputString.charAt(0);

        if (choice=='Y') {

            while (inputFile.hasNextLine()) {
                inputFile.nextLine();
                count++;
            }
            System.out.print("The amount of lines is: " + count);
        }

        //gives each sentence in file its own line

        System.out.println("Do you wish to print out each sentence on its own line? (Y or N)");
        inputString = keyboard.nextLine();
        choice = inputString.charAt(0);

        if (choice=='Y') {
            while (inputFile.hasNextLine()) {
                System.out.println(inputFile.nextLine());
            }
        }

        //prints output lines of two different files one after the other, alternating between the two

        System.out.println("Do you wish to alternate text? (Y or N)");
        inputString = keyboard.nextLine();
        choice = inputString.charAt(0);

        if (choice=='Y') {
            System.out.print("Put the name of the first file here:");
            String file1 = keyboard.nextLine();
            System.out.println("Put the name of the second file here:");
            String file2 = keyboard.nextLine();
            File f1 = new File(file1);
            File f2 = new File(file2);
            Scanner wiz1 = new Scanner(f1);
            Scanner wiz2 = new Scanner(f2);
            String sFile3 = file1 + "-" + file2;
            File file3 = new File(sFile3);
            PrintWriter output = new PrintWriter(file3);
            while (wiz1.hasNextLine()) {
                output.println(wiz1.nextLine());
                output.println(wiz2.nextLine());
            }
            output.close();
            output.close();
        }
    }
}
