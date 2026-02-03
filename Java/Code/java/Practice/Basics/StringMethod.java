public class StringMethod {
    
    public static void main(String[] args) {
        
        String greeting = "hello";
        int count = greeting.length();
        System.out.println(count);
        /// Here, we are using the String Method to assign a word to a variable (greeting)
        /// Then, we use the .length operation to count how many letters there are in the word assigned to greeting
        /// Finally, we are printing the value recieved from the .length function and printing it

        greeting.equals("hello"); /// returns false
        greeting.equals("Good-Bye"); /// returns false
        greeting.equals("Hello"); /// returns true
        ///The '.equals' operation scans the assigned boolean and compares it to the string in the parenthesis
        /// It will return true if the two statements are equal and false if not
        /// Remember that capitalization matters. If one has a capital in a place the other doesn't, it will return false. 

        greeting.equalsIgnoreCase("hello");
        /// Here we are using the .equalsIsIgnoreCase to tell if the variable and statement in the parenthesis are equal
        /// The only different between this and the regular .equals is this one ignores capitals. 

        String Capital = "Hello";
        Capital = Capital.toLowerCase();
        System.out.println(Capital);
        /// Here we are using the .toLowerCase() method to change the existing 'Hello' to 'hello'
        Capital = Capital.toUpperCase();
        System.out.println(Capital);
        /// Same works for uppercase

        String variable = "     uggg      ";
        variable = variable.trim();
        System.out.println(variable);
        /// The .trim operation removes any whitespace in the statement 
        /// This includes spaces, tabs, and new line ('\n') characters

        greeting = "hello";
        char x = greeting.charAt(0);
        char b = greeting.charAt(2);
        System.out.println(x);
        System.out.println(b);
        /// .charAt(value) finds the letter at the corresponding position, starting at 0

        greeting = greeting.substring(2);
        System.out.println(greeting);
        /// .substring will return the values in a sentence starting at the designated value
        /// values start at 0 for the beginning of the word
        /// becuase I assigned the operation 2, it started at the 2 position in the word 'hello'
        /// That means it started at the first l and kept going, returning 'llo' in the end\
        greeting = "abcdefg";
        String getLetters = greeting.substring(2,5);
        System.out.println(getLetters);
        /// You can also do a range of letters by adding a coma and the position you want it to end
        /// It will include the end position you chose in the return statement

        greeting = "hi michael!";
        int findMichael = greeting.indexOf("michael!");
        System.out.println(findMichael);
        /* .indexOf will scan the string in question for the desired statement
         Then it will return the beginning position of the statement, starting at 0
         Will return -1 if the desired statement is not present
         can also use .lastindexOf to find the last iteration of the statement in question
        */

        String myName = "Michael";
        int find = myName.compareTo("michael");
        int find2 = myName.compareTo("Michael");
        int find3 = myName.compareTo("zoo");
        int find4 = myName.compareTo("Alpha");
        System.out.println(find);
        System.out.println(find2);
        System.out.println(find3);
        System.out.println(find4);
        /* .compareTo reads the two statements. It returns positive if statement in question is before
        0 if they are the same, and negative if it comes after
        Is ordered lexographically
        This just means uppercase letters come after lowercase
        */




    }   
}
