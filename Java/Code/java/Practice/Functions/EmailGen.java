import java.util.Scanner;

public class EmailGen {
    public static void main(String[] args) {

        while (true){  
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter an email that contains '@' and '.', neither can be at the start or end. \nTYPE E TO TERMINATE");
            System.out.print("Enter here: ");
            String email = scan.next();

            if (email.equalsIgnoreCase("e")) break;
          
            boolean atCheck = false;
            boolean dotCheck = false;

            for (int i = 0; i < email.length() - 1; i++){

                if (email.charAt(i) == '@'){
                    if (i > 0 && i < email.length() - 1) atCheck = true;
                }
                
                if (email.charAt(i) == '.'){
                    if (i > 0 && i < email.length() - 1) dotCheck = true;
                }
            }
            if (dotCheck && atCheck) {
                System.out.println("The email is valid");
            }
            else System.out.println("Email is invalid");
        }
    }
}