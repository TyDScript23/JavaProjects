package com.example.codingprojects;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DavisPayrollP2 {
    public static void main(String[] args) throws IOException
    {
        final double TAX_RATE = 0.08;

        File file= new File("employees.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            int numEmploys=0;
            double totalGross=0;
            double totalTax=0;
            double totalNet=0;

            String company = inputFile.nextLine();
            System.out.println("Company Name: " + company);
            System.out.println();

            while (inputFile.hasNextLine()) {
                String first = inputFile.nextLine();
                String lowFirst = first.toLowerCase();
                String second = inputFile.nextLine();
                String lowSecond = second.toLowerCase();
                char middle = second.charAt(0);
                char lowMiddle = lowSecond.charAt(0);
                String last = inputFile.nextLine();
                String lowLast = last.toLowerCase();
                int id = inputFile.nextInt();
                inputFile.nextLine();
                String fifth = inputFile.nextLine();
                char choice = fifth.charAt(0);
                float hourlyRate = inputFile.nextFloat();

                if (inputFile.hasNextLine())
                {
                    inputFile.nextLine();
                }

                double pay = 0;

                if (choice == 'A')
                    pay = 12.00 * hourlyRate;
                else {
                    if (choice == 'B')
                        pay = 14.50 * hourlyRate;
                    else {
                        if (choice == 'C')
                            pay = 16.00 * hourlyRate;
                        else {
                            if (choice == 'D')
                                pay = 20.00 * hourlyRate;
                            else
                                System.out.println("There is no payrate designated to this letter!!!");
                        }
                    }
                }

                double tax;
                double netPay;

                tax = pay * TAX_RATE;
                netPay = pay - tax;

                System.out.printf("Employee: %8s %s. %s\t\tEmail Address: " +
                        "%8s.%s.%s@hvcc.com\t\tID Number: %d" +
                        "\t\tGrossPay: $%.2f\t\t" +
                        "Taxes: $%.2f\t\t" +
                        "Net Pay: $%.2f\n", first, middle, last, lowFirst, lowMiddle, lowLast, id, pay, tax, netPay);

                numEmploys++;
                totalGross += pay;
                totalTax += tax;
                totalNet += netPay;
            }

            System.out.println("Number of employees: " + numEmploys);
            System.out.printf("Totals \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +
                    "Gross Pay: $%.2f\t\tTaxes: $%.2f\t\tNet Pay: $%.2f",totalGross,totalTax,totalNet);
        }
    }
}
