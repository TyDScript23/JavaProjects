package com.example.arraypractice;
import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        }

        nameList.add(1, "Mary");

        System.out.println("Mary was added at index 1. " +
                "Here are the items now.");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " +
                    nameList.get(index));
        }
    }
}
