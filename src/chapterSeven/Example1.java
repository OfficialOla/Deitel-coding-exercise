package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//        int[] numbers = new int[10];
////        System.out.println(Arrays.toString(numbers));
//
//        numbers[0] = 9;
//        numbers[1] = 8;
//        numbers[2] = 100;
//        numbers[9] = 29;
////        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[9] +" "+numbers[2] + " " +numbers[1]);
//        System.out.println(numbers[3]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many scores you wan add: ");
        int numberOfScore = scanner.nextInt();
        int[] scores = new int[numberOfScore];
        int sum = 0;

        for (int index = 0; index < numberOfScore; index++) {
            System.out.println("Enter score "+(index+1));
            scores[index] = scanner.nextInt();
            sum+=scores[index];
        }
//        for (int index = 0; index < scores.length; index++) {
//            sum+=scores[index];
//        }
        System.out.println("sum of scores is " +sum);
    }
}