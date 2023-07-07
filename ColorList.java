package com.example.objectsandclasses3;

import java.util.*;  // jcf
import java.awt.Color;

public class ColorList
{
    public static void main(String[] args)
    {
        Color c;
        int i;
        Color[] colorsarray = {Color.blue, Color.cyan, Color.pink};

        // you want more colors plus you forgot red goes before pink - so make a linked list
        LinkedList<Color> list = new LinkedList<>();
        ListIterator li;

        // loop through array and put into list
        for (i = 0 ; i < colorsarray.length; i++)
        {
            list.add(colorsarray[i]);
        }

        // put red in before pink - you know where pink is
        list.add(2,Color.red);


        // add in light gray, orange, green, yellow
        list.add(Color.lightGray);
        list.add(Color.orange);
        list.add(Color.green);
        list.add(Color.yellow);


        // make a new color - cornflowerblue with red 100, green 149, and blue 237 and add to list
        Color cornflowerblue = new Color(100, 149, 237);
        list.add(cornflowerblue);

        // see if light gray is in list, if it is, then change it to dark gray
        int index = list.indexOf(Color.lightGray);
        if (index != -1)
            list.set(index, Color.darkGray);

        /* make a list iterator and list iterate through list,
         * print the amounts of red, green, and blue separately */
        li = list.listIterator();
        while (li.hasNext())
        {
            c = (Color)li.next();
            System.out.print("Red = " + c.getRed() + " ");
            System.out.print("Green = " + c.getGreen() + " ");
            System.out.print("Blue = " + c.getBlue() + " ");
            System.out.println();
        }
        System.out.println();
        /* you decided you wanted the name of the color so make a map with the
         * name of a color and the actual color object */
        TreeMap<String, Color> map = new TreeMap<>();


        // pick a few colors and put them in the map
        map.put("blue", Color.blue);
        map.put("cyan", Color.cyan);
        map.put("cornflowerblue", cornflowerblue);

        /* change the map to a set and make an iterator to iterate through the set to
         * print the name of the color and the rgb values of the colors (all at once) */
        Set s;
        s = map.entrySet();
        Iterator it;
        it = s.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println();
    }
}