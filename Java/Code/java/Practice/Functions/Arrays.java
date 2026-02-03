import java.util.Scanner;

public class Arrays{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired length of the array: ");
        int count = scan.nextInt();
        double[] score = new double[count];

        // here I am delcaring the first element of the array (position 1) as 10 and printing it
        score[0] = 10;
        System.out.println(score[0]);

        // printing the length of the array
        System.out.println(score.length);

        int[] score2 = {5,10,20,50};
        System.out.println(score2.length);
        
        // using a for loop to print the array
        for(int number : score2){
            System.out.println(number);
        }

        // if you don't specify each element of an array, the values will default to the base value for that type
        // ie: double will default to 0.0, int will default to 0, string will default to '', ect...
        double[] array = new double[5];
        for (double num : array){
            System.out.println(num);
        }


    }

    public static boolean equalsArray(int[] a, int[] b){
        if (a.length != b.length) return false;
        else{
            int i = 0;
            while (i < a.length){
                if (a[i] != b[i])
                    return false;
                i++;
            }
        }
        return true;
    }
}