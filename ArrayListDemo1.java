package com.example.arraypractice;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args)
    {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        System.out.println("The ArrayList has " + nameList.size() +
                " objects stored in it.");

        for (String s : nameList) System.out.println(s);
    }
}
