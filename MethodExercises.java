package com.example.objectsandclasses;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.text.*;

public class MethodExercises {
    public static void main(String[] args) throws IOException{
        String s1, s2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        s1 = br.readLine();
        System.out.print("Enter a string: ");
        s2 = br.readLine();

        if (s1.equals(s2))
            System.out.println("Same string");
        else if (s1.equalsIgnoreCase(s2))
            System.out.println("Same string - different case");
        else if (s1.compareTo(s2) > 0)
            System.out.println(s1 + " is greater than " + s2);
        else
            System.out.println(s1 + " is less than " + s2);

        System.out.println("Difference is " + s1.compareTo(s2));

        String name;
        StringTokenizer st;
        StringBuffer first;//could be a String
        String middle, last;
        StringBuffer lastfirst = new StringBuffer();
        StringBuffer username = new StringBuffer();
        StringBuffer signature = new StringBuffer();

        System.out.print("Enter your first middle last name: ");
        name = br.readLine();

        st = new StringTokenizer(name, " ");
        first = new StringBuffer(st.nextToken()); //convert String to StringBuffer
        middle = st.nextToken();
        last = st.nextToken();

        lastfirst.append(last).append(", ").append(first);
        username.append(Character.toLowerCase(first.charAt(0))).append("-").append(last.toLowerCase());

        System.out.println("\nLast First = " + lastfirst); //change StringBuffer to String
        System.out.println("User Name = " + username);

        signature.append(first).append(" ").append(middle.charAt(0)).append(". ").append(last);

        System.out.println("Signature = " + signature);

        String sent;

        System.out.print("Enter a sentence: ");

        sent  = br.readLine();
        sent = sent.toLowerCase();
        st = new StringTokenizer(sent, " ,.?!:;");

        while (st.hasMoreTokens())
        {
            plw(st.nextToken());
            System.out.print(" ");
        }

        System.out.println();

        String hvcc = "Hudson Valley Community College";
        int i, numo = 0, index;

        for (i = 0; i < hvcc.length(); i++)
            if (hvcc.charAt(i) == 'o')
                numo++;

        System.out.println("Number of 'o' is " + numo);

        numo = 0;

        index = hvcc.indexOf('o');

        while (index != -1)
        {
            numo++;
            index = hvcc.indexOf('o', index + 1); //start one over from where we were
        }

        System.out.println(numo);

        String[] s = new String[3];
        int l, j, k;
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        for (l = 0; l < s.length; l++)
        {
            System.out.println("Enter your word here:");
            s[l] = br3.readLine();
        }

        System.out.println("Starts with yan: ");

        for (j = 0; j < s.length; j++)
        {
            if (s[j].startsWith("yan"))
                System.out.println(s[j]);

        }

        System.out.println("Ends with es: ");
        for (k = 0; k < s.length; k++)
        {
            if (s[k].endsWith("es"))
                System.out.println(s[k]);

        }


        String [][] employees = {{"Sara" , "CEO"}, {"Karl", "Overlord"}, {"Edward", "Bagger"}};
        double[] rates = {120000, 22000, 6.50};
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
        boolean found = false;

        System.out.println("Employees with rate > $10 an hour");

        for (i=0; i<rates.length;i++)
            if (rates[i] > 10.00)
                System.out.println(employees[i][0] + " - " + employees[i][1]);

        System.out.print("\nEnter name to find title: ");
        name = br4.readLine();
        for (j = 0; j < employees.length; j++)
            if (employees[j][0].equalsIgnoreCase(name))
            {
                System.out.println("Title is " + employees[j][1]);
                found = true;
                break;
            }

        if (!found)
            System.out.println("Employee not found");

        double hours, rate, pay;
        Scanner sc = new Scanner(System.in);
        String spay;
        NumberFormat curnum;
        curnum = NumberFormat.getCurrencyInstance();

        System.out.print("Enter hours worked:  ");
        hours = sc.nextDouble();
        System.out.print("Enter hourly rate:  ");
        rate = sc.nextDouble();
        if (hours > 40)  // if condition
        {     // compound statement - want to do both statements in true path
            pay = 40 * rate + (hours - 40) * rate * 1.5;
            System.out.println("You have OT pay");
        }
        else	// single statement - false path
            pay = hours * rate;

        spay = curnum.format(pay);
        System.out.println("Your weekly pay is " + spay);

        double gallons, liters;
        String sgallons, sliters;
        DecimalFormat decgallons = new DecimalFormat("#,##0.000gal");
        DecimalFormat decliters = new DecimalFormat("#,##0.0000L");

        System.out.print("Enter gallons: ");

        gallons = sc.nextDouble();

        liters = gallons * 3.7854;
        sgallons = decgallons.format(gallons);
        sliters = decliters.format(liters);

        System.out.println("Gallons are " + sgallons);
        System.out.println("Liters are " + sliters);

        String seasons = "Spring,Summer,Fall,Winter";
        int[] seasonsascii = new int[seasons.length()];		// method - same size of parallel array
        char[] seasonscharray;
        String[] seasonsarray;

        for (i = 0; i < seasons.length(); i++)
        seasonsascii[i] = seasons.codePointAt(i);	// method - convert each to integer

        for (j = 0; j < seasonsascii.length; j++)
            System.out.println(seasonsascii[j]);

        seasonscharray = seasons.toCharArray();	// method - convert String to character array
        for (k = 0; k < seasonscharray.length; k++)
            System.out.println(seasonscharray[k]);

        seasonsarray = seasons.split(",");	 // method - divide up seasons array at seasons
        for (l = 0; l < seasonsarray.length; l++)
            System.out.println(seasonsarray[l]);
    }

    public static void plw(String word)
    {
        int x;
        for (x = 1; x < word.length(); x++)
        {
            System.out.print(word.charAt(x));
        }
        System.out.print(word.charAt(0) + "ay");
    }
}
