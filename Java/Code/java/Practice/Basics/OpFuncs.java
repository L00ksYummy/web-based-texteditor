/// the operating functions are used the same way as in python
/// you can also combine the operators just as follows, '+=, -=, *=, ect.'
public class OpFuncs{

    public static void main(String[] args) {
        
        int number = 10;
        number++;
        System.out.println(number);

        /// the increment operator (++) adds one to whatever value it is asssigned to
        // the orientation of the operator matters
        
        int value = 20;
        System.out.println(value++);
        System.out.println(value);
        /// When '++' is added after the variable, it will be done after reading the variable
        /// This means it will read the value of the variable and then perform the function
        /// As seen above, the value is first printed as 20 and then 21 due to the '++' being after the first print

        int x = 10;
        System.out.println(++x);
        /// But, as seen here, the ++ is placed ahead of the variable x
        /// This allows the variable x to have 1 added to it before the multiplication is applied
        /// The resulting value is 20 instead of 22
    }
}

