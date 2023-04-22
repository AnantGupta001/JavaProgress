import java.util.Scanner;
import java.util.Random;

public class RPS_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computerMove = rand.nextInt(0, 3);
        System.out.println("rock = 0\nscissors = 1\npaper = 2");
        System.out.print("Enter your Move: "); /* rock = 0; scissors = 1; paper = 2 */
        int userMove = sc.nextInt();
        // tie
        if (userMove == computerMove) {
            System.out.println("Tie");
            System.out.println("Computer's Move was: " + computerMove);
            System.out.println("Your Move was: " + userMove);
        }
        // user is losing
        else if ((userMove == 0 && computerMove == 2) || (userMove == 1 && computerMove == 0) || (userMove == 2 && computerMove == 1)) {
            System.out.println("You Lost!");
            System.out.println("Computer's Move was: " + computerMove);
            System.out.println("Your Move was: " + userMove);
        }
        // user is winning
        else {
            System.out.println("You Won!");
            System.out.println("Computer's Move was: " + computerMove);
            System.out.println("Your Move was: " + userMove);
        }
    }
}
