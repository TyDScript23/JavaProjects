package com.example.objectsandclasses2;

import java.io.*;
import java.util.Scanner;

public class MakeAccount {
    public static void main(String[] args) throws IOException {
        BankAccount b = new BankAccount();
        String anumber;
        double balance, amount;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        anumber = br.readLine();

        b.setacctnum(anumber);

        System.out.print("Enter the beginning balance: ");
        balance = sc.nextDouble();

        b.setBalance(balance);

        System.out.print("Enter amount of deposit: ");
        amount = sc.nextDouble();

        b.deposit(amount);

        System.out.println("\nAccount Number is " + b.getacctnum());
        System.out.printf("Current Balance is %.2f\n", b.getBalance());
    }
}
