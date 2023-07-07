package com.example.codingprojects2;

/*
--This class will provide a variety of methods for
directly manipulating a custom linked list of
baseball players and their corresponding numbers
--output is formatted and printed to standard console
--mock OutOfBoundsExceptions are thrown for illogical actions
 */

public class yankees111d // outer class for linked list
{
    private static class ynode // inner class for individual nodes
    {
        private final String name;
        private final int number;
        private ynode next;  // reference to next ynode

        public ynode()  // reference nodes
        {
            name = "";
            number = 0;
            next = null;
        }
        public ynode(String na, int nu)  // nodes in linked list
        {
            name = na;
            number = nu;
            next = null;
        }
    }  // end inner class

    private ynode hptr;  // reference to first node
    private ynode cptr;  // reference to each node - current - iterator
    private ynode tptr;  // reference to last node
    private int size;

    public yankees111d()
    {
        hptr = new ynode();
        cptr = new ynode();
        tptr = new ynode();
        size = 0;
    }

    public void add(String nam, int num)
    {
        ynode nptr = new ynode(nam, num);
        if (size == 0)
        {
            hptr = nptr;   // hptr holds address of first node
            tptr = nptr;   // tptr - only node is last node
            size = 1;                     // first(nam, num);
        }
        else
        {
            tptr.next = nptr; // last nodes' next field references new node
            tptr = nptr;   // reposistion tptr on new last node
            size++;
        }
    }

    public void add(int index, String nam, int num)
    {
        if (index < 0 || index > size)
            System.out.println("Index Out Of Bounds Exception " + index + " " + size);
        else
        {
            ynode nptr = new ynode(nam, num); // nptr holds address of new node
            if (size == 0)
            {
                hptr = nptr;   // hptr holds address of first node
                tptr = nptr;   // tptr - only node is last node
                size = 1;                     // first(nam, num);
            }
            else if (index == 0)
            {
                nptr.next = hptr;  // new node's next field holds address of old first
                hptr = nptr;       // new node is first
                size++;
            }
            else
            {
                cptr = hptr;
                int i;
                for (i = 0; i < index - 1; i++)
                    cptr = cptr.next;   //  moves cptr to node before where new node goes

                ynode bptr;
                ynode aptr;
                bptr = cptr;
                aptr = cptr.next;
                bptr.next = nptr; // previous nodes' next field references new node
                nptr.next = aptr;
                size++;
            }
        }
    }

    public void addFirst(String nam, int num)
    {
        //object is put before head-pointer as it is moved up
        ynode nptr = new ynode(nam, num);
        nptr.next = hptr;
        hptr = nptr;
        size++;
    }

    public void addLast(String nam, int num)
    {
        //object is put after tail-pointer
        ynode nptr = new ynode(nam, num);
        tptr.next = nptr;
        tptr = nptr;
        size++;
    }

    public String get(int index)
    {
        //gets object at desired index
        int i;
        cptr = hptr;
        for (i = 0; i < index; i++)
        {
            cptr = cptr.next;
        }
        return "Name: " + cptr.name + "\nNumber: " + cptr.number;
    }

    public String getFirst()
    {
        return "Name: " + hptr.name + "\n" + "Number: " + hptr.number + "\n";
    }

    public String getLast()
    {
        return "Name: " + tptr.name + "\nNumber: " + tptr.number + "\n";
    }

    public void set(int index, String nam, int num)
    {
        //replaces an object at desired index if it is in bound
        if (index < 0 || index > size)
            System.out.println("Index Out Of Bounds Exception " + index + " " + size);
        else {
            ynode nptr = new ynode(nam, num);
            cptr = hptr;
            int i;
            for (i = 0; i < index - 1; i++)
                cptr = cptr.next;
            ynode bptr = cptr;
            cptr = hptr;
            for (i = 0; i < index; i++)
                cptr = cptr.next;
            ynode aptr;
            aptr = cptr.next;
            bptr.next = nptr;
            nptr.next = aptr;
            size++;
        }
    }

    public int indexOf(String nam, int num)
    {
        //returns index of player and "-1" if not found
        int index = 0;
        cptr = hptr;
        while (cptr != null)
        {
            if (cptr.number == num && cptr.name.equals(nam))
                return index;
            cptr = cptr.next;
            index++;
        }
       return -1;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void display()
    {
        int index = 0;
        cptr = hptr;  // start at beginning - li = list.listIterator();
        System.out.println("List starts at " + hptr);
        while (cptr != null)  // traverse until no more nodes - while (li.hasNext())
        {
            System.out.printf("%-57s%6d%13s%7d%62s\n", cptr, index++, cptr.name, cptr.number, cptr.next);
            cptr = cptr.next;  // move to next node - li.next()
        }
    }
}

