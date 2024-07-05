import java.util.Scanner;

public class MoreScanner {

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read a string token
        System.out.println("Enter a word:");
        String nextWord = scanner.next();
        System.out.println("You entered the word: " + nextWord);

        // Consume the remaining newline
        scanner.nextLine();

        // Read a full line of text
        System.out.println("Enter a full line of text:");
        String nextLine = scanner.nextLine();
        System.out.println("You entered the line: " + nextLine);

        // Read an integer
        System.out.println("Enter an integer:");
        int nextInt = scanner.nextInt();
        System.out.println("You entered the integer: " + nextInt);

        //Another Example
        AnotherExample();
    }

    public static void AnotherExample(){
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);


        // Read an integer
        System.out.println("Enter a whole number:");
        int nextInt = scanner.nextInt();
        System.out.println("You entered the integer: " + nextInt);


        // Consume the remaining newline
        scanner.nextLine();

        // Read a full line of text
        System.out.println("Enter a full name:");
        String nextLine = scanner.nextLine();
        System.out.println("You entered the line: " + nextLine);

        // Read a string token
        System.out.println("Enter your first name:");
        String nextWord = scanner.next();
        System.out.println("You entered the word: " + nextWord);

        // Close the scanner
        scanner.close();
    }
}
