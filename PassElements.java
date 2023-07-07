package com.example.arraypractice;

public class PassElements {
    public static void main(String[] args)
    {
        int[] numbers= {5, 10, 15, 20, 25, 30, 35, 40};

        showArray(numbers);
    }

    public static void showArray(int[] array)
    {
       for (int i = 0; i < array.length; i++)
       {
           System.out.print(array[i] + " ");
       }
    }
}
