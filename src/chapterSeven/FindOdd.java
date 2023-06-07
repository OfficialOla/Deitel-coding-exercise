package chapterSeven;

import java.util.Arrays;

public class FindOdd {
    public static void main(String[] args) {
    }
    public  static int[] findodd(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) count++;
        }
        int[] oddElements = new int[count];
        int oddElementCounter = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            if (numbers[counter] % 2 != 0) {
                oddElements[oddElementCounter] = numbers[counter];
                oddElementCounter++;
                System.out.println(Arrays.toString(oddElements));
            }
        }
            return oddElements;

    }
    }