package com.example.arraypractice;
import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        System.out.println("The ArrayList has " + nameList.size() +
                " objects stored in it.");

        for (String name : nameList)
            System.out.println(name);
    }
}
