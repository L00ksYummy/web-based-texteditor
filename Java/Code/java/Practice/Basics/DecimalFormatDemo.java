// Today we will be using the package Decimal Format

import java.text.DecimalFormat;
// First, you have to import the package using the java.text operator

public class DecimalFormatDemo {

    public static void main(String[] args) {
        // Here we are delcaring the patterns we will use to format a long decimal number
        DecimalFormat pattern00dot000 = new DecimalFormat("00.000");
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");
        /* You have to use Decial format in front of the variable just as you would with int, string, float, or double
        you also have to add new in front of the desired decimal format to create a new pattern for the package */

        double d = 12.34567;
        // Declaring the decmial we will format

        System.out.println("Pattern 00.000");
        System.out.println(pattern00dot000.format(d) + "\n");

        // printing the formatted number and declaring which pattern it is above and below

        System.out.println("Pattern 0.00");
        System.out.println(pattern0dot00.format(d));

        double money = 13.8;
        DecimalFormat pattern$ = new DecimalFormat("$00.0");
        // You can also add a symbol into the format to change how it is printed in the end

        System.out.println("Pattern$");
        System.out.println(pattern$.format(money) + "\n");
        // For example, the dollar sign from the format above is printed without adding it into the print function
        // It will also change the outcome of the print depending on what you use

        double percent = .308;
        DecimalFormat patternPerc = new DecimalFormat("00.0%");

        System.out.println("Pattern %");
        System.out.println(patternPerc.format(percent));
        // Just as said above, because we used a % symbol here, the format changed the .308 to 30.8%
        
        

        
    }  
}