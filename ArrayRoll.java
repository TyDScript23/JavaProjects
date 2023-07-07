package com.example.arraypractice;

import java.io.IOException;

public class ArrayRoll {
    public static void main(String args[]) throws IOException {
        int[] rolls = new int[7];

        for (int index = 0; index < rolls.length; index++) {
            rolls[index] = 0;
        }

        for (int index = 0; index < rolls.length; index++) {
            rolls[index] = (int) (Math.random() * 6) + 1;
        }

        for (int index = 0; index < rolls.length; index++) {
            System.out.println(rolls[index]);
        }

        char ch1, ch2;
        char[] charray1 = new char[5];
        char[] charray2 = new char[6];
        char[][] charray2d = new char[3][2];
        int i, j;

        System.out.print("Enter a character: ");
        ch1 = (char) System.in.read();
        System.in.read();
        ch1 = Character.toLowerCase(ch1);
        System.out.println("The character in lower case is " + ch1);

        System.out.print("Enter a character: ");
        ch2 = (char) System.in.read();
        System.in.read();
        ch2 = Character.toLowerCase(ch2);
        System.out.println("The character in lower case is " + ch2);

        System.out.print("Enter " + charray1.length + " characters with spaces: ");

        for (i = 0; i < charray1.length; i++) {
            charray1[i] = (char) System.in.read();
            System.in.read();
            charray1[i] = Character.toLowerCase(charray1[i]);
        }

        System.out.println("Character in " + charray1 + " are: ");
        for (j = 0; j < charray1.length; j++)
            System.out.print(charray1[j] + " ");
        System.out.println();

        System.out.print("Enter " + charray2.length + " characters with spaces: ");

        for (i = 0; i < charray2.length; i++) {
            charray2[i] = (char) System.in.read();
            System.in.read();
            //charray2[i] = tolower(charray1[i]);
        }

        tolowerarray(charray2); //pass by reference

        System.out.println("Character in " + charray2 + " are: ");
        for (j = 0; j < charray2.length; j++)
            System.out.print(charray2[j] + " ");
        System.out.println();

        copy2darray(charray2, charray2d);
        System.out.println("Characters in " + charray2);
        print2darray(charray2d);
    }

    public static char tolower(char c)
    {
        if (c >= 65 && c <= 90)
            c+=32;
        return c;
    }

    public static void tolowerarray(char[] ca)
    {
        int x;
        for (x = 0; x < ca.length; x++)
            ca[x] = tolower(ca[x]);
        System.out.println("ca is " + ca);
    }

   public static void copy2darray(char[] ch1d, char[][] ch2d)
   {
       int x, y, index = 0;
       for (x=0; x<ch2d.length;x++)
           for (y = 0; y < ch2d[x].length;y++)
           {
               ch2d[x][y] = ch1d[index];
               index++;
           }
   }

   public static void print2darray(char[][] ch2d)
   {
       for (int r=0; r < ch2d.length; r++)
       {
           for(int c =0 ; c < ch2d[r].length;c++)
           {
               System.out.print(ch2d[r][c] + " ");
           }
           System.out.println();
       }
   }
}
