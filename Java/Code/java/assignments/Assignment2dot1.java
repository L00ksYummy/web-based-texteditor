/*
Michael Allen
Assignment 3
September 14th, 2024
Today we will be taking a number and seeing if its odd, and we will also check if someone is eligible for a loan using
credit score and annual salary.
The program will take a number input, a credit score input, and annual salary input
These will result in a odd or even output and whether or not someone is eligible for a loan, and the amount of that loan.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment2dot1{
    public static void main(String[] args) 
    {
        //Part 1

        //First we need to create the scanner
        Scanner userInput = new Scanner(System.in);

        //Then take the user input
        System.out.print("Enter a whole number to see if it's odd or even: ");
        int num = userInput.nextInt();

        //Then use an if statement to see if its odd or even using the remainder operator
        if (num % 2 == 0)
        {
            System.out.println("The number input by user is even.");
        }
        else 
        {
            System.out.println("The number input is odd.");
        }

        // Part 2
        System.out.print("Enter your credit score: ");
        double creditScore = userInput.nextDouble();
        System.out.print("Enter your annual salary: ");
        double annualSalary = userInput.nextDouble();

        DecimalFormat money = new DecimalFormat("$#.00");

        // using an if statement and capping the credit score at 850 because it can't be higher than that
        if (creditScore > 850)
        {
            System.out.println("Credit Score cannot be above 850");
        }
        else if ((creditScore >= 700) && (annualSalary >= 80000))
        {
            double loan = annualSalary / 3;
            System.out.println("You are eligible for a loan of " + money.format(loan));
        }
        else if (creditScore < 700 || annualSalary < 80000)
        {
            System.out.println("You are not eligible for a loan due to a low credit score or a low salary.");
        }
        else{
            System.out.println("Your are not eligible for a loan due to a low annual salary and low credit score.");
        }

    }
}