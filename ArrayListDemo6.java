package com.example.arraypractice;
import java.util.ArrayList;
public class ArrayListDemo6 {
    public static void main(String[] args)
    {
        ArrayList<BankAccount> list = new ArrayList<>();

        list.add(new BankAccount(100.0));
        list.add(new BankAccount(500.0));
        list.add(new BankAccount(1500.0));

        for (int index = 0; index < list.size(); index++)
        {
            BankAccount account = list.get(index);
            System.out.println("Account at index " + index +
                    "\nBalance: " + account.getBalance());
        }
    }
}
