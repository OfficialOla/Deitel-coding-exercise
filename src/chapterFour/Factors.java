package chapterFour;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
        int count = 0;
        while (userInput % count == 0);
        if (userInput % count == 0) {
            System.out.println( count+ " ");
        } count++;
//        for (count= 1; count <= userInput; count++) {
//            if (userInput % count == 0) {
//                System.out.print(+ count+" ");
//            }
//        }
    }
}
