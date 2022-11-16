package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int userInput = input.nextInt();
        if (userInput > 10) {
            System.out.println("Out of range");
        } else {
            if (userInput % 2 == 0)
                System.out.println("This number is even");
            else {
                System.out.println("This number is odd");
            }
        }
    }
}