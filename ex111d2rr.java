package com.example.codingprojects2;

public class ex111d2rr
{
    public static void main(String[] args)
    {
        yankees111d y = new yankees111d();   // linked list

        if (y.isEmpty())
            System.out.println("Add some players");
        else
            y.display();
        System.out.println();

        y.add(5, "Judge", 99);
        y.add("Judge", 99);

        y.add("Stanton", 27);
        y.add("Donaldson", 28);
        y.set(5, "Judge", 99);

        y.add(0, "Rizzo", 48);
        y.add("Hicks", 31);
        y.add("Hicks", 31);

        y.add(26, "LeMahieu", 26);
        y.add(3, "LeMahieu", 26);
        y.add("Chapman", 54);
        y.add(2, "Cole", 45);

        y.add("Taillon", 50);
        y.addFirst("Britton", 53);
        y.addLast("Severino", 40);
        y.add("Kiner-Falefa", 12);

        y.addFirst("Torres", 25);
        y.add("Montgomery", 47);
        y.add("Gallo", 13);
        y.set(9, "Green", 57);

        System.out.println();
        System.out.println("Spot 2 is " + y.get(2));
        System.out.println();

        System.out.println("Spot 10 is " + y.get(10));
        System.out.println();

        System.out.println("Index of Cole-44 is " + y.indexOf("Cole", 44));
        System.out.println("Index of Cole-45 is " + y.indexOf("Cole", 45));
        System.out.println();

        System.out.println("First is " + y.getFirst());
        System.out.println("Last is " + y.getLast());

        System.out.println();
        System.out.println("Final List");

        if (y.isEmpty())
            System.out.println("Add some players");
        else
            y.display();          // iterator
        System.out.println();
    }
}




