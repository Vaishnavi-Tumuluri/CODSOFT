import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int minRange = 1;
        int maxRange = 100;

        System.out.println("enter number of attempts: ");
        int maxAttempts = input.nextInt();
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = rand.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess the number between " + minRange + " and " + maxRange + " in " + maxAttempts + " attempts.");

            for (int i = 1; i <= maxAttempts; i++) {
                System.out.print("Attempt " + i + ": ");
                int guess = input.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + i + " attempts.");
                    score += maxAttempts - i + 1;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

                if (i == maxAttempts) {
                    System.out.println("Sorry, you did not guess the number. The number was " + randomNumber + ".");
                }
            }

            System.out.print("Your score is " + score + ". Play again? (y/n): ");
            String playAgainInput = input.next();

            if (!playAgainInput.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
    }
}
