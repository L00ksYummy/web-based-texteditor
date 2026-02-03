import java.text.DecimalFormat;
import java.util.Scanner;


public class Classes{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.00");

        double[] arr1 = {10,25,67,108,34,86};
        double[] arr2 = {10.5, 20.679, 10.873, 45.92};

        Greet();
        Print("What is your yearly salary?: ");
        Print(10000.11 + "\n");

        System.out.println("Minimum is " + getMin(10, 2));
        System.out.println("average is: " + getAverage(100, 25));
        System.out.println("Average of array 2 is: " + form.format(getAverArray(arr2)));

        System.out.print("Would you like to get the average of array 1 or 2?: ");
        String arraySelection = scan.next();
        if ("1".equals(arraySelection)){
            getAverArr(arraySelection, arr1);
        }
        else{
            getAverArr(arraySelection, arr2);
        }

    }
    public static void Greet() {   // Basic function that doesn't return a value due to void
        System.out.println("Hello!");  // Because we defined static, we do not need to assign the class an object
        // This means we can call the function without assigning an object

    }

    public static void Print(String s){
        System.out.print(s);
    }

    public static void Print(Double d){  // I can use the same name for this class because it doesn't have the same parameter
        System.out.print(d);            // Unlike the first one, I am printing a double, not a string
        // If I was printing a String, it would cause a syntax error
    }

    public static int getMin(int a, int b){ // using int a and int b as parameters so when called it uses the numbers assinged
        if (a < b) return a;
        return b;
    }

    public static double getAverage (double a, double b){
        double c = (a + b) / 2;
        return c;
    }

    public static double getAverArray (double[] arr){
        int i = 0;
        double total = 0;
        for (double value: arr){
            total += value;
            i++;
        }
        double average = total / i;
        return average;

    }

    public static void getAverArr(String s, double[] arr){
        int i = 0;
        double total = 0;
        for (double value: arr){
            total += value;
            i++;
        }
        double average = total / i;
        System.out.println("The average of array " + " is " + average);
    }


    
}