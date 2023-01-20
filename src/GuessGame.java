import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        // Prompt user.
        // Receive user input.
        System.out.println("Guess my secret number between 0-100?");
        int secretNumber = 60; // Declared secretNumb
        Scanner reader = new Scanner(System.in);
        int userInput = reader.nextInt();

        //Logic
        if (secretNumber == userInput) {
            System.out.println("Correct, the secret number is " + secretNumber);
        } else if (userInput < secretNumber) {
            System.out.println("Too Low");
        } else {
            System.out.println("Too High");
        }
    }
}
