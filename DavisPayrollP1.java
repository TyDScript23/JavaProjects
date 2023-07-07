package com.example.davispayrollp1;
import java.util.Scanner;
public class DavisPayrollP1 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int numberEmploy,j,id;
        String firstName, lastName,letter;
        char level;
        double hours,pay = 0,salary = 0;

        System.out.println("Enter the number of employees:");
        numberEmploy = keyboard.nextInt();

            for (j = 0; j < numberEmploy; j++) {
                System.out.println("Enter employee's first name:");
                firstName = keyboard.nextLine();

                firstName = keyboard.nextLine();

                System.out.println("Enter employee's last name:");
                lastName = keyboard.nextLine();

                System.out.println("Enter employee's ID number:");
                id = keyboard.nextInt();

                System.out.println("Enter " + firstName + " " + lastName + "  level (A, B, C or D):");
                letter = keyboard.nextLine();

                letter = keyboard.nextLine();
                level = letter.charAt(0);

                System.out.println("Enter the hours " + firstName + " " + lastName + " worked this week:");
                hours = keyboard.nextDouble();

                if (level == 'A')
                    pay = 12.00 * hours;
                else {
                    if (level == 'B')
                        pay = 14.50 * hours;
                    else {
                        if (level == 'C')
                            pay = 16.00 * hours;
                        else {
                            if (level == 'D')
                                pay = 20.00 * hours;
                            else
                                System.out.println("There is no payrate designated to this letter!!!");
                        }
                    }
                }
                System.out.printf("Employee:%s %s\t\tID Number: %d\t\tPay: $%.2f\n",firstName,lastName,id,pay);
                salary += pay;
            }
            System.out.printf("Total salary: $%.2f for %d employees\n",salary,numberEmploy);
    }
}
