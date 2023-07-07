package com.example.codingprojects2;

/*
This program is used by "RandInt.java" to
construct each individual object consisting
of a random integer and corresponding index
, as well as to access both fields so
that they may be applied to formulas and
predetermined values
*/

public class JavInt implements Comparable<JavInt>{
    private int original;
    private int random;

    //constructor used to initialize a JavInt
    //object with that of index and corresponding
    //random integer
    public JavInt(int o, int r)
    {
        original = o;
        random = r;
    }

    //returns the index of the random number
    public int getOriginal()
    {
        return original;
    }

    //returns the random number associated with
    //the index
    public int getRandomInt()
    {
        return random;
    }

    //overloads the Comparable.compareTo abstract
    //method used for Collections.sort() in main class
    public int compareTo(JavInt jj)
    {
        if (random > jj.random)
            return 1;
        else if (random == jj.random)
            return 0;
        else
            return -1;
    }
}
