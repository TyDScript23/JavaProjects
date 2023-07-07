package com.example.objectsandclasses2;

import java.io.*;
import java.util.Scanner;

public class NeapolitanMain{
    public static void main(String[] args) throws IOException {
        NeapolitanPizza97 p1;

        String psize, ptopping, pstyle;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st pizza size (Small,Medium,Large,X-Large): ");
        psize= sc.nextLine();
        System.out.println("Enter pizza topping: ");
        ptopping = sc.nextLine();
        System.out.println("Enter pizza style: ");
        pstyle = sc.nextLine();
        p1 = new NeapolitanPizza97(psize, ptopping, pstyle);

        System.out.println("Pizza 1:\n");
        p1.printPizza();
    }
}



