package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsUsingArray {
    public static void main(String[] args) {
        sumOfArray();
    }

    public  static void sumOfArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        int userInput = scanner.nextInt();
        int sum = 0;
        int[] numbers = new int[userInput];
        for (int index = 0; index < userInput; index++) {
            System.out.println("Enter score " +(index+1));
            numbers[index] = scanner.nextInt();
            sum +=numbers[index];
        }
        System.out.println("Sum of score is " +sum);

            }

//        number[0] = 7;
//        number[1] = 6;
//        number[2] = 3;
//        number[3] = 1;
//        int sum = number[0] + number[1] + number[2] + number[3];
//        System.out.println((sum));
    }

