import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean repeat;
        
        do {
            boolean repeat2;
            int guess;
            int randomized;
            
            randomized = random.nextInt(101);
            System.out.println("Please input a number between 1 and 100. Press 0 to give up.");
            do {
                guess = input.nextInt();
                if (guess == 0) {
                    repeat2 = false;
                } else {
                    if (guess < randomized) {
                        System.out.println("That's too low");
                        repeat2 = true;
                    } else {
                        if (guess > randomized) {
                            System.out.println("That's too high");
                            repeat2 = true;
                        } else {
                            if (guess == randomized) {
                                System.out.println("That's right!");
                                repeat2 = false;
                            }
                        }
                    }
                }
            } while (repeat2);
            System.out.println("Do you want to play again? Yes or no");
            String answer;
            
            answer = input.nextLine();
            if (answer.charAt(0).equals("y") || answer.charAt(0).equals("Y")) {
                repeat = true;
            } else {
                repeat = false;
            }
        } while (repeat);
    }
}
