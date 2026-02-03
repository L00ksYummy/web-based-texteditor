import java.text.DecimalFormat;
import java.util.Scanner;

public class nextIntFunc{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you want to multiply: ");
        float num1 = scanner.nextFloat();

        System.out.print("\nEnter the number you are mulitplying by: ");
        float num2 = scanner.nextFloat();

        float answer = num1 * num2;
        DecimalFormat ans = new DecimalFormat("#.000");
        System.out.print("\nThe answer rounded is " + ans.format(answer));
    }   

}
