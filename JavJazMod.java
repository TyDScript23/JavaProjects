package com.example.objectsandclasses3;

import java.util.*;
import java.io.*;

public class JavJazMod {
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<>();
        int index;

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
        Collections.sort(list); //sort references

        String[] sarray = new String[list.size()];
        sarray = list.toArray(sarray);

        for (index = 0; index < sarray.length; index++)
            System.out.println(index + ". " + sarray[index]);

        System.out.println();

        ArrayList<String> alist = new ArrayList<>(Arrays.asList(sarray));
        alist.add("jaywalk");
        Collections.sort(alist);

        String[] sarray2 = new String[alist.size()];
        sarray2 = alist.toArray(sarray2);

        for (index = 0; index < sarray2.length; index++)
            System.out.println(index + ". " + sarray2[index]);
    }
}
