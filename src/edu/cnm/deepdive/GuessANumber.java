package edu.cnm.deepdive;


import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

   while (playOneRound());
  }

  private static boolean playOneRound() {
    int randomized;

    randomized = random.nextInt(100) + 1;
    System.out.println("Please input a number between 1 and 100. Press 0 to give up.");
    while (checkGuess(randomized));

    System.out.println("Do you want to play again? Yes or no");
    String answer;
    do {
      answer = input.nextLine().trim().toLowerCase();
    } while (answer.isEmpty());

    return answer.charAt(0) == 'y' ;
  }

  private static boolean checkGuess(int randomized) {
    boolean guessAgain = true;
    int guess;
    guess = input.nextInt();
    if (guess == 0) {
      guessAgain = false;
    } else if (guess < randomized) {
      System.out.println("That's too low");
    } else if (guess > randomized) {
      System.out.println("That's too high");
    } else {

      System.out.println("That's right!");
      guessAgain = false;
    }
    return guessAgain;
  }
}
