package com.example.arraypractice;

public class StringArray {
    public static void main(String[] args)
    {
        String[] names = {"Bill", "Lisa", "Laura",
                "Melissa", "Sarah", "Martin"};
        int i;

        for (i = 0; i < names.length; i++)
            System.out.println(names[i]);

        sort(names);

        System.out.println();

        for (i = 0; i < names.length; i++)
            System.out.println(names[i]);

        System.out.println();

        int count = 0, j;
        String vowels = "aeiouyAEIOUY";

        String[] names2 = {"Bill", "Joshua", "Stephen", "Tyler", "Audra" };

        for (i = 0; i <  names2.length; i++)
            for (j = 0; j < names2[i].length(); j++)
                if (vowels.indexOf(names2[i].charAt(j)) != -1)
                    count++;
        System.out.println("The number of vowels is " + count);
    }

    public static void sort(String[] names)
    {
        int j, pass;
        String temp;
        for (pass = 1; pass < names.length; pass++)
// pass goes from 1 to 5 (5 passes)
            for (j = 0; j < names.length - pass; j++)
        /* j is index #, stops one sooner each pass though array */
        if (names[j].compareTo(names[j+1]) > 0)
// swap if Strings out of order
        {
            temp = names[j];	// save 1st String
            names[j] = names[j+1];
            names[j+1] = temp;
        }
    }

}
