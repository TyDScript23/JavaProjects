package com.example.arraypractice;
import java.util.ArrayList;
public class ArrayListDemo3 {
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " +
                    nameList.get(index));
        }

        nameList.remove(1);

        System.out.println("The item at index 1 is removed. " +
                "Here are the items now.");

        for (int index = 0; index < nameList.size(); index++)
        {
            System.out.println("Index: " + index + " Name: " +
                    nameList.get(index));
        }
    }
}
