package com.example.codingprojects2;

/* Tyler Davis
   Cube Array Set/Get

   --With this program you will be able to
   create 3 cubes, each with their own
   size and color and decide if they are
   filled or not
   --At the end, the surface area and volume
   are calculated for all the cubes
 */

import java.util.Scanner;

public class CubeArray {
    public static void main(String[] args)
    {
        //variable initialization-create array of cubes
        Scanner sc = new Scanner(System.in);

        Cube[] c = new Cube[3];
        int i, j;
        double length, percent;
        String change, color, resize;
        boolean choice;

        for (i = 0; i < c.length; i++)
        {
            //initializes each cube to Constructor values
            c[i] = new Cube();

            //asks user if they would like to change their cube
            System.out.println("Would you like to change Cube " +
                    i + "? (Yes/No)\n" +
                    "Enter here: ");
            change = sc.nextLine();

            //if answer is "yes", allows user to enter values
            //for the size, color, and fill
            if(change.equalsIgnoreCase("yes"))
            {
                System.out.println("Enter length here: ");
                length = sc.nextDouble();
                c[i].setSideLength(length);

                sc.nextLine();

                System.out.println("Enter color here: ");
                color = sc.nextLine();
                c[i].setColor(color);

                System.out.println("Enter fill decision here (true = yes/false = no): ");
                choice = sc.nextBoolean();
                c[i].setFill(choice);

                sc.nextLine();

            }

            //asks user if they would like to resize their cube
            System.out.println("Would you like to resize Cube " + i + "? (Yes/No)\n" +
                    "Enter here: ");
            resize = sc.nextLine();

            //if answer is "yes", uses a percentage(decimal value)
            //to represent the ratio NEW CUBE:OLD CUBE

            if(resize.equalsIgnoreCase("yes"))
            {
                System.out.println("Input percent of original size " +
                        "as a decimal here: ");
                percent = sc.nextDouble();
                sc.nextLine();

                c[i].resize(percent);
            }
            System.out.println();
        }

        //this loop prints the size,color, and filler to output

        //uses methods to calculate the Surface Area and Volume
        //of each cube and prints it to output
        for (j = 0; j < c.length; j++)
        {
            System.out.println("Cube " + j + ": ");
            System.out.println();
            System.out.printf("Size: %.2f\n",c[j].getSideLength());
            System.out.println("Color: " + c[j].getColor());
            System.out.println("Filled: " + c[j].getFill());
            System.out.println();
            System.out.println("Surface Area: " + c[j].calcSurfaceArea());
            System.out.println("Volume: " + c[j].calcVolume());
            System.out.println();
        }
    }
}
