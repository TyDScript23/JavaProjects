package com.example.objectsandclasses;

import java.math.BigInteger;

public class BigIntegerMethod {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1111111111111111111111");
        BigInteger b2 = new BigInteger("2222222222222222222222");
        BigInteger b3;
        BigInteger b4;

        b3 = b1.add(b2);
        b4 = b2.subtract(b1);

        System.out.println(b3);
        System.out.println(b4);

        if (b1 == b4)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        if (b2 == b3)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        System.out.println(Integer.MAX_VALUE);
    }
}
