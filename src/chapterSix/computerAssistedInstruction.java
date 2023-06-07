package chapterSix;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class computerAssistedInstruction {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        RandomGenerator user = new Random();
        Scanner scanner = new Scanner(System.in);
        int userInput1 = randomNumbers.nextInt(10);
        int userInput2 = randomNumbers.nextInt(8);
        System.out.printf("what is %d times %d:\n", userInput1, userInput2);
        int userInput = scanner.nextInt();
        int userValue = Math.multiplyExact(userInput1, userInput2);
        while (userInput != userValue) {
            System.out.println("No. Please try again");
            userInput = scanner.nextInt();
            if (userInput == userValue) {
                System.out.println("Very good!");
            }
        }
    }
}