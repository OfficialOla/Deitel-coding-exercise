package chapterFour;

import java.util.Scanner;

public class TestTillUserStops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float max = Float.NEGATIVE_INFINITY;
        float min = Float.POSITIVE_INFINITY;
        System.out.println("Enter number please: ");
        float userInput = input.nextFloat();
        while (userInput != 00) {
            if (userInput > max) {
                max = userInput;
            }
            if (userInput < min && userInput != 00) {
                min = userInput;
            }
            System.out.println("Enter number or 00 to end");
            userInput = input.nextFloat();

        }
        System.out.println("The largest number is: " + max);
        System.out.println("The smallest number is: " + min);
    }
    }