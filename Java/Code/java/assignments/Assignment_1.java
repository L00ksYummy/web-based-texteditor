

/**
*
*  Michael Allen
*  Assignment #1
*  September 1, 2024
*  Today, we are doing 3 things, solving two function with assigned variables, then we will declare 2 strings and compare them
and lastly, We are printing a statement using new print operation
*  We will be inputing a value for 3 variables. A, B, and C, str1 and str2, and the words needed to create the statement
*  The program will return the answer for the 2 equations
*
* Bugs: write here if there is any bug that causes the program to crash/terminate
*/

public class Assignment_1 
{
    public static void main(String[] args)
    {


        // part 1/3

        System.out.println("Part 1/3\n");

        // I am solving the equation 2a^2 + 4a + 29
        int a = 10;
        // assigning 10 to the value a and declaring a an integer
        double answer = 2 * (Math.pow(a, 2)) + 4 * a + 29;
        System.out.println(answer);
        /*
         * Here, I used the double operator to tell the system the variable being assinged would be a double
         * Then I wrote the equation out making sure to include the power and correct parthesis where ever needed
         */

        // Now I will be making the second equation
        // a will remain as 10 
        int b = 4;
        int c = 8;
        double answer2 = ((4 * c) + (a * c)) / (3 * b);
        System.out.println(answer2);
        // After making the equation I printed the result


        // part 2/3

        System.out.println("\nPart 2/3\n"); 


        String str1 = "Hawk";
        String str2 = "Spirit";
        int length = str2.length();
        System.out.println("The length of string 2 is " + length + " letters");
        // We used the .length operator to find the legnth of string 2

        int compare = str1.compareTo("Hawk");
        System.out.println("The value when comparing str1 to str1 is " + compare);
        // The resulting answer when comparing str1 to str1 is 0 because they are the same

        char getChar = str1.charAt(0);
        System.out.println("The first character in str1 is " + getChar);
        /* Used .charAt operator to obtain the first letter in str1
        used 0 as the designated position because 0 is the first according to the computer
        */

        char getLast = str2.charAt(5);
        System.out.println("The last character in str2 is " + getLast);

        String getRange = str1.substring(0, 3);
        System.out.println("The first 3 characters in str1 are " + getRange);
        /* Used .substring method to get a range of letters
        used 0 and 3 as range (start at 0 and end at 3)
        */

        String notFirst = str2.substring(1);
        System.out.println("If you remove the first letter in str2, you get " + notFirst);
        // Removing the first letter in str2 using .substring and telling it to start at the position 1


        //part 3/3

        System.out.println("\nPart3/3");

        // Printing the statement using 6 System.out methods
        System.out.print("\nThis is a test");
        System.out.print("\n");
        System.out.print("of the emergency ");
        System.out.print("\n");
        System.out.print("broadcast ");
        System.out.print("system.");

        // !!!!!!!!! This is not part of the assignment !!!!!!!!!!!!!
       /* !!!!!!!!!! */System.out.print("\n" + "\n");/* !!!!!!!!!! */
        // !!!!!!!!! Just trying to seperate the two attempts in the terminal !!!!!!!!!!!!!!

        // Printing the statement using one 'print' and one 'println' method
        System.out.print("This is a test\nof the emergency\n");
        System.out.println("broadcast system.");
        

 
    }
}
