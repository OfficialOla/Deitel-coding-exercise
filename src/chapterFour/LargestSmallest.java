package chapterFour;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        int largest = 0;
        int smallest = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int userInput = input.nextInt();
        largest = userInput;
        smallest = userInput;
        while (userInput != 0) {
             if (userInput > largest) {
                largest = userInput;
            }
            if (userInput < smallest) {
                smallest = userInput;
            }
            System.out.println("enter number: ");
            userInput = input.nextInt();
        }

        System.out.println("the largest number is " +largest);
        System.out.println("the smallest number is " +smallest);
    }
}
