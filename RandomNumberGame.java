package practice;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        System.out.println("Welcome to the Random Number Game!");
        System.out.println("You have to guess the hidden random numbers.");

        for (int i = 1; i <= 10; i++) {
            int randomNumber1 = random.nextInt(100) + 1;
            int randomNumber2 = random.nextInt(100) + 1; 

            System.out.println("\nRound " + i + ":");
            System.out.println("Two random numbers have been generated.");

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber1 || guess == randomNumber2) {
                score++;
                System.out.println("Congratulations! Your guess is correct.");
            } else {
                System.out.println("Oops! Your guess is incorrect.");
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Your final score is: " + score);
    }
}