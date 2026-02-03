import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    
    public static void main(String[] args) {
        
        try {
            
            Scanner scan = new Scanner(System.in);

            DecimalFormat money = new DecimalFormat("$#.00");

            System.out.print("Please enter your YEARLY INCOME: ");
            float income = scan.nextFloat();
            double tenYear = income * 10;

            System.out.println("You should make " + money.format(tenYear) + " after 10 years");

        } catch (InputMismatchException e) {
            System.out.println("You entered an invalid input. Please enter a number.");
        }
    }
}