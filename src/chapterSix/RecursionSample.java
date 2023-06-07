package chapterSix;

import java.util.Scanner;

public class RecursionSample {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter a number: ");
//        int number = scanner.nextInt();
        printRightAngledTriangle(10);
        printLeftAngledTriangle(10 );

    }
        private static void printRightAngledTriangle(int number){

            if (number < 1) return;
            number = number - 1;
          printRightAngledTriangle(number);
            for (int i = 0; i < number; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        private  static  void printLeftAngledTriangle(int number){
        if (number < 1) return;
        number = number - 1;
        printLeftAngledTriangle(number);
        for (int i = number; i <4; i++) {
            System.out.print(" ");}
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
            }

        }

