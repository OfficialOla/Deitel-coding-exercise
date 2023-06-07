package chapterFour;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter number");
        int userInput = input.nextInt();
//        int isPrime = userInput % 2;
//        System.out.println(isPrime);
            for (count = 2; count <= userInput; count++) {
                if (userInput % count == 0){
                    System.out.println("Number");
                }
                    }
        System.out.println("Number is prime");
                 }
                }
