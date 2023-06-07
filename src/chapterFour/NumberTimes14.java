package chapterFour;
import java.util.Scanner;
public class NumberTimes14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput = input.nextInt();
//        for (int count = 1; count <= 12; count++) {
//            int multiply = userInput * count;
//            System.out.printf("%d * %d = %d \n", userInput, count, multiply);
//        }
        int count = 1;
        while (count <= 12 ) {
          int multiply = userInput * count;
            System.out.printf("%d * %d = %d \n", userInput, count, multiply); count++;
        }

            }
        }
