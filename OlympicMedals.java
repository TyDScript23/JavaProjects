package com.example.arraypractice;

public class OlympicMedals {
    public static void main(String[] args) {
        int[][][] olympics =
                {         //summer olympics
                        {
                                {1996, 44, 32, 25},
                                {2000, 37, 24, 32},
                                {2004, 26, 29, 26},
                                {2008, 36, 38, 36},
                                {2012, 46, 29, 29},
                                {2016, 46, 37, 38},
                                {2020, 39, 41, 33}
                        },
                        //winter olympics
                        {       {1996, 6, 5, 2},
                                {1998, 6, 3, 4},
                                {2002, 10, 13, 11},
                                {2006, 9, 9, 7},
                                {2010, 9, 15, 13},
                                {2014, 9, 9, 10},
                                {2018, 9, 8, 6}
                        }
                };

        int yearmedals = 0,totalmedals = 0, total = 0,wintertotal = 0;

        System.out.println("Gold medals in 2018 are " + olympics[1][6][1]);

        for (int c = 1; c < olympics[1][6].length; c++)
            yearmedals += olympics[1][6][c];

        System.out.println("Total medals in 2018 are " + yearmedals);

        for (int r = 0; r < olympics[1].length; r++)
            for (int c = 1; c < olympics[1][r].length; c++)
                totalmedals += olympics[1][r][c];

        System.out.println("The total medals for the winter olympics is " + wintertotal);

        for (int a = 0; a < olympics.length; a++)
            for (int r = 0; r < olympics[a].length; r++)
                for (int c = 1; c < olympics[a][r].length; c++)
                    totalmedals += olympics[a][r][c];

        System.out.println("The total medals for both olympics is " + totalmedals);

    }
}