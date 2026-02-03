/*
Plan:
So I want to make a quiz in this but be able to automate the question making process so I don't
need to make a bunch of different functions for each question. First I need to get the parameters of the function set up.
I want to make the function into a integer so I can send the answer back for an if statement.

*/

import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        // Need to create multiple arrays to get the questions and answers down so I can later loop through them
        // Also used an Array on an Array so i didnt have to make 10 different arrays
        System.out.println("\nWelcome!! Today you're taking a quiz! This isn't very hard so don't worry too much. Good Luck!\n");

        String[] questions = {
            "What principle states that the position and momentum of a particle cannot both be precisely determined at the same time?",
            "What is the name of the theorem that demonstrates the inherent limitations of provability in formal systems?",
            "What term describes the brain's ability to reorganize itself by forming new neural connections throughout life?",
            "What part of the brain is primarily responsible for regulating the autonomic nervous system and homeostasis?",
            "What is the term for a political system where power is held by a small number of people, typically the wealthy or elite?",
            "What is the theoretical object in string theory that represents a fundamental one-dimensional string?",
            "Who proposed the heliocentric model of the solar system, challenging the geocentric view?",
            "What is the first letter of the English Alphabet?",
            "What is the term for the philosophical problem that questions how mental states are related to physical states?",
            "What is the term for the process by which a solid changes directly into a gas without passing through a liquid state?"
        };
        String[][] options = {
            {"A: Heisenberg Uncertainty Principle", "B: Barts Principle", "C: Superposition", "D: Principle of Theoretical Physics\n"},
            {"A: E = MC^2", "B: Gödel's Incompleteness Theorem", "C: Infinite Monkey Theorem", "D: Central Limit Theorem\n"},
            {"A: Brain Reorganization", "B: Rematter", "C: Neuroplasticity", "D: Gum-Gum brain\n"},
            {"A: Cerebellum", "B: Hypothalamus", "C: Cerebral Cortex", "D: Frontal Lobe\n"},
            {"A: Capitalism", "B: Dictatorship", "C: Tyranny", "D: Oligarchy\n"},
            {"A: An Atom", "B: A Quark", "C: A String", "D: A Element\n"}, 
            {"A: Copernicus", "B: Aristotle", "C: Aguines", "D: Socrates\n"},
            {"A: A", "B Bart", "C: Whats an English?", "D: Today I Shit Myself\n"},
            {"A: State Problem", "B: Mind-Body Problem", "C: Body-Mind Problem", "D: Problem of Relation\n"},
            {"A: Sublimation", "B: Staticism", "C: Hollowfication", "D: Reincarnation\n"}
        };
        String[] answers = {"A", "B", "C", "B", "D", "C", "A", "A", "B", "A"};

        Quiz(questions, options, answers);

    }
    public static void Quiz(String[] questionsArray, String[][] optionsUpperArray, String[] answersArray){
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < questionsArray.length; i++){
            System.out.println(i+1 + ": " + questionsArray[i]);
            for (String k: optionsUpperArray[i]){
                System.out.println(k);
            }
            System.out.print("Enter your Answer: ");
            String answer = scan.next();
            if (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D")){
                System.out.println("Dude... you didn't even enter a, b, c, or d. Get your shit together!\n");
            }
            else if (i == 7){
                if (answer.equalsIgnoreCase(answersArray[i])){
                    System.out.println("Great job! That was the hardest question in this WHOLE QUIZ!!!\n");
                }
                else{
                    System.out.println("Wrong!!! The answer was " + answersArray[i] + ". But don't beat yourself up. You got the next one.\n");
                }  
            }
            else if (answer.equalsIgnoreCase(answersArray[i])){
                System.out.println("Great job! Though that one was pretty easy, so I didn;t expect any less.\n");
            }
            else{
                System.out.println("Dude... the answer was " + answersArray[i] + ". That should have been easy. Come on man pick it up.\n");
            }
        }
    }
}