package com.example.objectsandclasses;

public class StringMethods {
    public static void main(String[] args) {

        String s = "Cat", t = "Fish", u, v;

        int i, x;
        char c;

        if (s.equals(t))
            System.out.println("Equals");
        else if (s.compareTo(t) < 0)
            System.out.println("Less than");
        else
            System.out.println("Greater than");

        u = s + t;
        i = u.length();

        System.out.println("Length of " + u + " is " + i);

        u = u + s.substring(1, 3);
        s = s.replace('C', 'B');
        u = u + s;
        u = u.toLowerCase();

        System.out.println(u);

        x = u.indexOf('h');

        System.out.println(x);

        c = u.charAt(5);

        System.out.println(c);

        String str = "5467";
        str.toLowerCase();
        System.out.println(str);
    }
}
