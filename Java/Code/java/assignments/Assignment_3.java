/*
Michael Allen
Assignment 3
September 29, 2024
Today we will be taking two arrays and printing the total, sum, and average of both of them
The computer will take an array input and output the desired output
The computer will be returning the average,total, and sum of both arrays
*/

import java.text.DecimalFormat;

public class Assignment_3 {
    public static void main(String[] args) {
        DecimalFormat format1 = new DecimalFormat("#.00");
        int i = 0; //creating a variable to control the loops to get total
        double total1 = 0; // creating total variable for array 1 and array 2 next
        double total2 = 0;

        int[] array1 = {1,10,9,10,20,39,98,100}; // assigning values to each array
        double[] array2 = {1.67,19.89,9.9,10.5,120.5};

        System.out.println("The length of array 1 is: " + array1.length);

        // using for-each statement to simplify things
        for (int values1 : array1){
            total1 += values1;
            i++;
            if (i == 8){
                System.out.println("The total of array 1 is: " + total1);
                double average1 = total1 / 8;
                System.out.println("The average for array 1 is: " + format1.format(average1));
            }
        }
        System.out.println("The length of array 2 is: " + array2.length);
        
        i = 0;
        for (double values2 : array2){
            total2 += values2;
            i++;
            if (i == 5){
                System.out.println("The total of array 2 is: " + format1.format(total2));
                double average2 = total2 / 5;
                System.out.println("The average of array 2 is: " + format1.format(average2));
            }
        }
    }
}