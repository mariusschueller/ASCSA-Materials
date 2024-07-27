// Write a program that has a user guess a secret number between 1 and 100.
//


// Related Example Script: WhileLoops.java


// Store the secret number in a variable called secretNumber and allow the user to continually
// input numbers until they correctly guess what secretNumber is.
//
// Complete the method guessMyNumber that uses a while loop to ask the user for their guess and
// compares it againist secretNumber.
//


// EXAMPLE:
// if secretNumber was 16, an example run of the program may look like this:
//
//I'm thinking of a number between 1 and 100.
//See if you can guess the number!
//Enter your guess:
//4
//Try again!
//Enter your guess:
//3
//Try again!
//Enter your guess:
//1
//Try again!
//Enter your guess:
//10
//Try again!
//Enter your guess:
//16
//Correct!

public class GuessTheNumber
{
    // This is the secret number that will pass the test cases!
    static int secretNumber = 16;
    public static void main(String[] args)
    {

        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("See if you can guess the number!");

        // This calls the static method GuessMyNumber. Notice that the method is outside
        // of the main method.
        guessMyNumber();

    }

    public static void guessMyNumber()
    {
        // Your code goes here!

        // Ask if you need help, but try to look at the example run to see what needs to happen

    }
}