/*
 * Michael Allen
 * October 9th 2024
 * Java Programming OL1
 * Today I will first answer the question in assignment 5, then I will move onto the programs
 * The programs will be taking and array list of integers and assigning those integers to a hashmap that has the keys minimum, maximum, sum, and average
 * Then, for the next program, we will be using a hashmap to make pizza sizes and corresponding prices, and then having the user pick the size they want
 * Then we will be using that choice to print out the total, the tax, and the final price
 * 
 * Inputs: The inputs will be the array lists, the hashmaps, and the users input for their choice of pizza
 * Outputs: The outpusts
 */

/*
 * The output of the first program would be:    Mark, Jonathon, Bob
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        //Part 1 Outputs

        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(55);
        list.add(31);
        list.add(78);
        list.add(108);

        HashMap<String, Integer> stats = arrayToHash(list);
 
        System.out.println("Here are the stats of the array: ");
        System.out.println("\tMaximum: " + stats.get("Maximum"));
        System.out.println("\tMinimum: " + stats.get("Minimum"));
        System.out.println("\tSum:     " + stats.get("Sum"));
        System.out.println("\tAverage: " + stats.get("Average") + "\n");


        //Part 2 Outputs

        DecimalFormat form = new DecimalFormat("$#.00");
        
        HashMap<String, Double> sizeList = new HashMap<>();

        sizeList.put("Small", 8.99); 
        sizeList.put("Medium", 11.90); 
        sizeList.put("Large", 14.76); 
        sizeList.put("Extra Large", 18.90); 

        HashMap<String, Double> toppingsList = new HashMap<>();

        toppingsList.put("Mushrooms", 3.99);
        toppingsList.put("Peppers", 2.99);
        toppingsList.put("Extra Cheese", 3.0);

        double pizzaTotal = 0;
        
        pizzaTotal += getPizzaCost(sizeList);

        pizzaTotal += getToppings(toppingsList);

            
        System.out.println("\nPre-tax total:  " + form.format(pizzaTotal));
        System.out.println("Sales tax (8%): " + form.format(tax(pizzaTotal)));
        System.out.println("Final total :   " + form.format(pizzaTotalFunc(pizzaTotal)) + "\n");

    }

    //Part 1 functions

    public static HashMap<String, Integer> arrayToHash(ArrayList<Integer> list){
        HashMap<String, Integer> stats = new HashMap<>();

        //Using a function to find the minimum in the array list
        int min = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if (min > list.get(i))    min = list.get(i);
        }

        //Now finding the max in the list
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if (max < list.get(i))    max = list.get(i);
        }

        //Now the sum
        int sum = 0;
        for(int value: list)    sum += value;

        //And finally adding them to the HashMap
        stats.put("Minimum", min);
        stats.put("Average", getAverage(list));
        stats.put("Maximum", max);
        stats.put("Sum", sum);

        return stats;
    }

    //Function to find the average of the list
    public static int getAverage(ArrayList<Integer> list){
        int total = 0;
        for(int value: list){
            total += value;
        }
        int average = total / list.size();
        return average;
    }

    //Part 2 Functions

    public static double getPizzaCost(HashMap<String,Double> list){
        double total = 0;

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Here are the options for pizza sizes: \n\tSmall: $8.99\n\tMedium: $11.90\n\tLarge: $14.76\n\tExtra Large: $18.90");


        while (true){
            System.out.print("Please Enter the Pizza Size you would like to Purchase (Extra for XL): ");
            String choice = scan2.next();
            choice = capitalize(choice);

            if (choice.equals("Extra")){
                choice = "Extra Large";
                total += list.get(choice);
                return total;
            }
            else if (!list.containsKey(choice)){
                System.out.println("\nPlease enter a valid size. ");
            }
            else {
                total += list.get(choice);
                return total;
            }
        }

    }

    public static double getToppings(HashMap<String, Double> toppingsList){
        Scanner scan3 = new Scanner(System.in);

        while (true){
            double total = 0.0;
            String toppings = "";
            String yOrN = "";
            int i = 0;

            while (true){
                System.out.println("\nWhat toppings would you like to add?: \n\tMushrooms: $3.99\n\tPeppers: $2.99\n\tExtra Cheese: $3");

                while (true){
                    System.out.print("Enter choice here ('Cheese' for extra cheese or 'N' for none): ");
                    toppings = scan3.next();
                    toppings = capitalize(toppings);

                    if (toppings.equals("Cheese")){
                        toppings = "Extra Cheese";
                        total += toppingsList.get(toppings);
                        break;
                    }
                    else if (!toppingsList.containsKey(toppings)){
                        if (toppings.equalsIgnoreCase("n")){
                            System.out.println("No toppings added");
                            break;
                        }
                        else System.out.println("Please enter a valid input");
                    }
                    else {
                        total += toppingsList.get(toppings);
                        break;
                    }
                }

                // If they choose all 3 toppings, the program will automatically stop
                if (i == 3) break;

                if (!toppings.equalsIgnoreCase("N")){
                    System.out.print("\nWould you like to add more? (Y or N): ");
                    yOrN = scan3.next().toUpperCase();

                    while (true){
                        if (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
                            System.out.println("\nPlease enter 'Y' or 'N'.");
                            System.out.print("Would you like to add more? ('Y' or 'N'): ");
                            yOrN = scan3.next().toUpperCase();
                        }
                        else break;
                    }
                }
                if (yOrN.equals("N") || toppings.equals("N")) break;
            }           
            return total;
        }
    }

    public static double tax(double total){
        return total * .08;
    }

    public static double pizzaTotalFunc(double cost){
        return cost + tax(cost);
    }

    //Using this to capitalize the first letter of the words entered
    public static String capitalize(String word){
        //This part checks to see is the word is null or empty and returns null if it is. Just to make sure no errors come through
        if (word == null || word.isEmpty()){
            return null;
        }
        //This part is the capitalizing part
        //It takes the first letter of the string using the substring method and capitalizes it
        //Then it adds the rest of the words onto the end and makes sure it is all lower case, just to make sure it 
        //Reads correctly and returns it at the same time
        else{
            return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        }
    }
}
