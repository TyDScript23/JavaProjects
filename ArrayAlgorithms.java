package com.example.arraypractice;

public class ArrayAlgorithms {
    //This is the Selection Sort algorithm!!!

    public static void selectionSort(int[] array)
    {
        int startScan, index, minIndex, minValue;

        for (startScan = 0;startScan < (array.length - 1); startScan++)
        {
            minIndex = startScan;
            minValue = array[startScan];
            for(index = startScan + 1; index < array.length; index++)
            {
                if (array[index] < minValue)
                {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }

    public static int binarySearch(int[] array, int value)
    {
        int first;
        int last;
        int middle;
        int position;

        boolean found;

        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;

        while (!found && first <= last)
        {
            middle = (first + last) / 2;

            if (array[middle] == value)
            {
                found = true;
                position = middle;
            }
            else if (array[middle] > value)
                last = middle - 1;
            else
                first = middle + 1;
        }
        return position;
    }
}
