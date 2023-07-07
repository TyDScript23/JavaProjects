package com.example.codingprojects2;

//Tyler Davis
//Palindrome Test 2-7

/*This program will except a String from an array
,remove all the spaces and punctuation from the String,
test it to see if it is a palindrome,
and print the result in output*/

import java.util.StringTokenizer;

public class Palindrome {
    public static void main(String[] args)
    {
        String[] pal = {"mom", "Yankees are number one",
                "A Santa at NASA.", "Java Programming;",
                "Did Hannah see bees? Hannah did!"};
        int i;

        for (i = 0; i < pal.length; i++)
        {
            //String is converted to StringBuffer and spaces are removed
            //converted to String(all lowercase)
            pal[i] = String.valueOf(removeSpace(pal[i])).toLowerCase();

            //uses boolean value of "check" method to print the final results to output
            if (check(pal[i]) == true)
                System.out.println("'" + pal[i] + "' is a palindrome");
            else
                System.out.println("'" + pal[i] + "' is not a palindrome");
        }
    }

    public static StringBuffer removeSpace(String hasPunc)
    {
        //initialize buffer and tokens
        StringTokenizer st = new StringTokenizer(hasPunc, " !?.;");
        StringBuffer removed = new StringBuffer();

        //adds each token to the buffer and returns the value of the buffer
        while(st.hasMoreTokens())
           removed.append(st.nextToken());

        return removed;
    }

    public static boolean check(String forward)
    {
        //lowercase String in converted into buffer

        StringBuffer st  = new StringBuffer(forward);
        boolean same;

        //tests to see if buffer is the same in reverse using "StringBuffer.reverse()"
        //returns value of test

        if (forward.equals(String.valueOf(st.reverse())))
            same = true;
        else
            same = false;

        return same;
    }
}