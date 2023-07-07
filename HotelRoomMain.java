package com.example.objectsandclasses2;

public class HotelRoomMain {
    public static void main(String[] args)
    {
        HotelRoom92 h = new HotelRoom92(375);
        Suite92 s = new Suite92(475);

        System.out.println("Hotel Room " + h.getroomnum() + " " +
                h.getroomrate());
        System.out.println("\nSuite " + s.getroomnum() + " " +
                s.getroomrate());
    }
}
