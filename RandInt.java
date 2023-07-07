package com.example.codingprojects2;

import java.util.*;
//Tyler Davis
//Linked List Random Java Integers

/*
--This program will accept user input to
determine the size of a linked list
meant to store a series of random integers
and their corresponding indices
--output displays both original and sorted
indices as well as the random integers in increasing order,
as well as gives the sum, mean, range, and median of the
random numbers listed
*/


public class RandInt {
    public static void main(String[] args){

        LinkedList<JavInt> list = new LinkedList<>();
        JavInt javint, object;
        int numobj, i, randsum = 0, range;
        ListIterator li;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //asks the user for the number of Integer Objects and
        //determines the size of "list"
        System.out.println("Enter number of Java Integer Objects: ");
        numobj = sc.nextInt();

        for (i = 0; i < numobj; i++)
        {
            int randomInt = random.nextInt(150);
            javint = new JavInt(i,randomInt);
            list.add(javint);
        }

        //sorts the list so that the random numbers are in order
        //from smallest to largest
        Collections.sort(list);

        System.out.println("Index  Order  Random");

        li = list.listIterator();

        //prints the values for the index, order, and random
        //fields using JavInt objects
        for (i = 0; i < list.size(); i++)
        {
            object = (JavInt)li.next();
            System.out.println("  " + i + "      " + object.getOriginal() +
                    "       " + object.getRandomInt());
        }

        li = list.listIterator();

        for (i = 0; i < list.size(); i++)
        {
            object = (JavInt)li.next();
            randsum += object.getRandomInt();
        }

        //prints the values for sum, median, range and median
        //using basic math operations
        System.out.println();
        System.out.println("Sum is " + randsum);
        System.out.println("Mean is " + (double)randsum/list.size());
        range = list.getLast().getRandomInt() - list.getFirst().getRandomInt();
        System.out.println("Range is " + range);
        System.out.println("Median is " + list.get(list.size() / 2).getRandomInt());
    }
}
