package edu.cnm.deepdive;


import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean playAgain;

    do {
      boolean guessAgain;
      int guess;
      int randomized;

      randomized = random.nextInt(100) + 1;
      System.out.println("Please input a number between 1 and 100. Press 0 to give up.");
      do {
        guess = input.nextInt();
        if (guess == 0) {
          guessAgain = false;
        } else if (guess < randomized) {
          System.out.println("That's too low");
          guessAgain = true;
        } else if (guess > randomized) {
          System.out.println("That's too high");
          guessAgain = true;
        } else {

          System.out.println("That's right!");
          guessAgain = false;
        }


      } while (guessAgain);
      System.out.println("Do you want to play again? Yes or no");
      String answer;
      do {
        answer = input.nextLine().trim().toLowerCase();
      } while (answer.isEmpty());

      playAgain = answer.charAt(0) == 'y' ;

    } while (playAgain);
  }
}
