package com.example.objectsandclasses3;

import java.util.*;
import java.io.*;

public class JavJaz {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<>();
        //SortedMap<String, Integer> list = new TreeMap<>();
        //int start = 0 , index;
        //String word;
        //Set s;
        //Iterator it;
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Integer num;

        list.add("jaw");
        list.add("jay");
        list.add("jazz");
        list.add("java");
        list.add("jaws");
        list.add("jawbone");
        list.add("jax");
        list.add("javapizza");
        list.add("javahomework");
        list.add("javamustard");
        list.add("jazzy");
        list.add("javelin");
        list.add("javafinch");
        Collections.sort(list); //rearrange references

        Queue <String> qlist = new LinkedList<>(list);

        Scanner sc = new Scanner(System.in);
        int ans;
        Iterator qi;
        System.out.print("Enter 1 to see what word is next, " +
                "2 to get rid of it, 3 to list all the words (-1 to end): ");
        ans = sc.nextInt();

        while (ans != -1)
        {
            if (ans == 1)
                System.out.println("Next word is " + qlist.peek());
            else if (ans == 2)
                System.out.println("Next word is " + qlist.poll() + " and is removed");
            else if (ans == 3)
            {
                System.out.println("\nHere are all the words left");
                qi = qlist.iterator();
                while (qi.hasNext())
                    System.out.println(qi.next());
            }
            System.out.print("Enter 1 to see what word is next, " +
                    "2 to get rid of it, 3 to list all the words (-1 to end): ");
            ans = sc.nextInt();
        }

        /*System.out.println("Enter a word between jav- and jaz-: ");
        word = br.readLine();
        num = list.get(word);
        if (num != null)
            System.out.println(word + " has " + num + " letters");
        else
            System.out.println("No word");*/

        /*if (list.contains(word))
             System.out.println(word + " is spelled correctly at spot " + list.indexOf(word));
        else
        {
            for (index = 0; index < list.size(); index++)
                if (list.get(index).compareTo(word) > 0)
                {
                    start = index - 1;
                    break;
                }
            if (start < 0)
            {
                start = 0;
                index = 1;
            }
            if (index >= list.size())
            {
                start = list.size() - 2;
                index = list.size() - 1;
            }
            System.out.println("The closest words to " + word + " are: ");
            System.out.println(list.get(start));
            System.out.println(list.get(index));
        }*/

        /*System.out.println("\nHere are all the words");
        s = list.entrySet();
        it = s.iterator(); //start at beginning - reference first

        while (it.hasNext()) //while more objects in list - while referencing something
            System.out.println(it.next());
        //print next object and move to next object by following reference link*/
    }
}
