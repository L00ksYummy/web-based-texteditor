/*
Michael Allen
October 1st, 2024
Java Programming OL1
Today we will be making a function/method that takes a double array as an argument 
and returns the average of two other arrays. I will use one function to compute both integer and double arrays
Then we will make another function/method that returns true if a given statement is a Palindrome. Which is a string that
is the same both forwards and backwards. Lastly, we will make a function/method that takes an array as a parameter and returns
an array that contains the values of the array in reversed order
The input the computer will take are the corresponding arrays and strings we need for each part
The output will be the average of both arrays, a statement saying if there is a Palindrome or not, and the reversed array
*/

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        
        // Part 1 outputs

        int[] arr1 = {1, 10, 9, 10, 20, 39, 98,100};
        double[] arr2 = {1.67, 19.89, 9.9, 10.5, 120.5};
        //Where I will be putting the methods

        arrAverage(arr2, arr1);

        System.out.println();

        // Part 2 outputs
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word to see if it is a palindrome: ");
        String word = scan.next();
        palindromeCheck(word);

        // Part 3 outputs

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] reverseArr3 = reverseArray(arr3);

        System.out.println(Arrays.toString(reverseArr3));

        // Extra Credit Part 1 Outputs

        int[] arrEx1 = {1,2,3,4};
        int[] arrEx2 = {5,6,7,8,9,10};

        System.out.println(Arrays.toString(combineArrays(arrEx1, arrEx2)));

        // Extra Credit part 2 Outputs

        String[] pizzaSizes = {"S", "M", "L", "XL"};
        double[] pizzaPrices = {14.50, 19.50, 22.99, 28.50};
        
        System.out.println("\nPlease enter the size of pizza that you would like to order. Sizes and Prices are below:\n");
        System.out.println("|   S   |   M   |   L   |   XL   |");
        System.out.println("----------------------------------");
        System.out.println("|  14.5 |  19.5 | 22.99 |  28.5  |\n");
        System.out.print("What size would you like?(S,M,L,XL): ");
        String pizzaSize = scan.next();
        pizzaSelection(pizzaSize , pizzaSizes, pizzaPrices);



    }
    
    // Part 1 functions

    public static double sumIntArr(int[] arr){
        double sum = 0;
        for (double value: arr){
            sum += value;
        }
        return sum;
    }
    public static double sumDubArr(double[] arr){
        double sum = 0;
        for (double value: arr){
            sum += value;
        }
        return sum;
    }
    public static void arrAverage(double[] arrDub, int[] arrInt){  // I couldn't figure out how to get the integer array to 
        DecimalFormat format1 = new DecimalFormat("#.00");         // Translate into a double so I did this instead

        double averageDub = sumDubArr(arrDub) / arrDub.length;
        double averageInt = sumIntArr(arrInt) / arrInt.length;
        System.out.println("The average of array 1 is; " + format1.format(averageInt));
        System.out.println("The average of array 2 is: " + format1.format(averageDub));
    }

    // Part 2 functions

    public static String stringReverse(String s){
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--){
            reversedString += s.charAt(i);
        }
        return reversedString;
    }
    public static void palindromeCheck(String w){
        String k = stringReverse(w);
        if (k.equals(w)){
            System.out.println("The word " + w + " is a palindrome.\n");
        }
        else{
            System.out.println("The word " + w + " is not a palindrome.\n");
        }
    }

    // Part 3 functions
     
    public static int[] reverseArray(int[] arr){
        int[] reverseArr = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            reverseArr[k] = arr[i];
            k++;
            }
        return reverseArr;
    }   

    // Extra Credit Part 1 functions

    public static int[] combineArrays(int[] Arr1,int[] Arr2){
        int[] combinedArrays = new int[Arr1.length + Arr2.length];
        int x = 0;
        for (int i = 0; i < Arr1.length; i++){
            combinedArrays[i] = Arr1[i];
        }
        for (int k = Arr1.length; k < Arr2.length + Arr1.length; k++){
            combinedArrays[k] = Arr2[x];
            x++;
        }
        return combinedArrays;
    }

    // Extra Credit Part 2 functions

    public static void pizzaSelection(String s, String[] sizes, double[] prices){
        DecimalFormat format2 = new DecimalFormat("$#.00");
        boolean found = false;
        for (int i = 0; i < sizes.length; i++){
            String search = sizes[i];
            if (search.equalsIgnoreCase(s)){
                found = true;
                System.out.println("You chose a " + sizes[i] + " pizza.");
                System.out.println("Total: $" + prices[i]);
                System.out.println("Tax (8%): $" + format2.format(prices[i] * .08));
                System.out.println("The final price is: $" + format2.format(prices[i] * 1.08));
                break;
            }
        }
        if (!found){
            System.out.println("The size you entered does not exist, run the program again.");
        }
    }

}