import java.util.Random;
import java.util.Scanner;

class Game{
    private int randomNumber;
    private int userNumber;
    private int noOfGuesses;

    Scanner sc = new Scanner(System.in);

    // constructor -->
    public Game(){
        Random rand = new Random();
        randomNumber = rand.nextInt(100)+1;
        noOfGuesses = 0;
    }

    public void UserTakenInput(){
        System.out.print("Enter your guess: ");
        userNumber = sc.nextInt();
        noOfGuesses++;
    }

    public boolean checkGuess(){
        if (userNumber == randomNumber) {
            System.out.println("🎉 Correct! You guessed the number.");
            System.out.println("Total Guesses: " + noOfGuesses);
            return true;
        }
        else if(userNumber < randomNumber){
            System.out.println("Too low! Try again!");
        }
        else{
            System.out.println("Too high! Try again!");
        }
        return false;
    }
}

public class Guess_the_number {
    public static void main(String[] args) {

        Game game = new Game();

        boolean check = false;

        while(!check){
            game.UserTakenInput();
            check = game.checkGuess();
        }
    }
}
