/* 
Michael Allen
Assignment 1
September 7th, 2024
Today we will be taking a user input for a degree in farenheight and printing the temp after converting it to celcius
The user will be inputing a temp in farenheight as a double
The program returns the temp converted to celcius

No bugs or crashes
 */


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
    
    public static void main(String[] args){

        try{
            DecimalFormat round = new DecimalFormat("#.000");

            System.out.println("Today we will be converting a temp in Farenheight to Celcius!\n");

            Scanner userInput = new Scanner(System.in);

            System.out.print("Please enter the temp you want converted to Celcius: ");
            double farTemp = userInput.nextDouble();

            double celcConversion = ((5.0/9.0) * (farTemp - 32.0));

            System.out.println("Your degree when converted is " + round.format(celcConversion) + " degrees celcius.\n");
        }
        catch(InputMismatchException e){
            System.out.println("\nPlease enter a numerical temperature.");
        }
        System.out.println("The program is finished running.");
    }
}