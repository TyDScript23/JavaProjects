package com.example.objectsandclasses;

public class Countable {
    private static int instanceCount;

    public Countable()
    {
        instanceCount++;
    }

    public int getInstanceCount()
    {
        return instanceCount;
    }
}
