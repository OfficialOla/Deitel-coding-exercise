package chapterFour;

import java.util.Scanner;

public class TillTheUserStops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myChoice;
        int largestNumber;
        int smallestNumber;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter number please:");
        int userInput = input.nextInt();
        if (userInput > max) {
            max = userInput;
                    }
        if (userInput < min) {
            min = userInput;
        }
        System.out.println("Do you want to continue? yes/no");
        myChoice = input.next().trim();
//        while (myChoice = )
    }
}
