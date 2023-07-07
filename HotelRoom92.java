package com.example.objectsandclasses2;

public class HotelRoom92 {
    protected int roomnum;
    protected double roomrate;

    public HotelRoom92(int n)
    {
        roomnum = n;
        if (roomnum <= 299)
            roomrate = 69.95;
        else
            roomrate = 89.95;
    }

    public int getroomnum()
    {
        return roomnum;
    }
    public double getroomrate()
    {
        return roomrate;
    }
}
