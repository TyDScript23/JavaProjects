package com.example.objectsandclasses;

public class StringBufferMethod {
    public static void main(String[] args)
    {
        StringBuffer yanks = new StringBuffer("Go");

        /* create StringBuffer object of size 2 plus 16 extra and initialize */
        yanks.append(" yankees");
        /* add to end, without using a whole new spot in memory, also increase size of the StringBuffer object yanks */
        yanks.insert(3, "New York ");
// insert at index #3
        yanks.setCharAt(12, 'Y');	// change index #12 to Y
        System.out.println("String Buffer is now:  " + yanks);
    }
}
