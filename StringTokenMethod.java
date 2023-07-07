package com.example.objectsandclasses;

import java.util.StringTokenizer;

public class StringTokenMethod {
    public static void main(String args[])
    {
        String ciss111 =
                "Programming & Logic II, Data Structures.";
        StringTokenizer st = new
                StringTokenizer(ciss111, " ,.");
        while (st.hasMoreTokens())
            System.out.println("Next token is " +
                    st.nextToken());
    }
}
