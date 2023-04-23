import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    int guessNum;
    int numberOfGuess;
    int randomNumber;
    boolean isNumberGuessed = false;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public GuessTheNumber() {
        randomNumber = rand.nextInt(1, 101);
    }

    public void takeUserInput() {
        while (!isNumberGuessed) {
            System.out.print("Enter you Guess (1,100): ");
            guessNum = sc.nextInt();
            isCorrectNum();
        }
    }

    public void isCorrectNum() {
        if (guessNum == randomNumber) {
            System.out.println("You got it right!");
            isNumberGuessed = true;
        } else {
            numberOfGuess += 1;
            if (guessNum > randomNumber && guessNum != 0) {
                System.out.println("You guess is High, make it Small.");
            } else if (guessNum < randomNumber && guessNum != 0) {
                System.out.println("You guess is Low, make it High.");
            }
            takeUserInput();
        }
    }

    public static void main(String[] args) {
        GuessTheNumber gtn = new GuessTheNumber();
        gtn.isCorrectNum();
        System.out.printf("Your Number of guesses are: %d\n.", gtn.numberOfGuess);
    }
}
