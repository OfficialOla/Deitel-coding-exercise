package chapterFour;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++) {System.out.print(i+ " ");}
//    }

//int i = 1;
//while (i <= 10) {
//    System.out.print(i+ " ");
//    i++
//        }
//        int number = 3;
//        while (number <= 100) {
//            number = number * 3;
//            System.out.println(number);
//        }
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
//        int i = 0 ;
        while (gradeCounter <= 10){
        String letter = "";
        switch (gradeCounter) {
            case 1:
                letter = "st";
                break;
            case 2:
                letter = "nd";
                break;
            case 3:
                letter = "rd";
                break;
            default:
                letter = "th";
        }

            System.out.printf("Enter %d%s grade: ", gradeCounter, letter);
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter++;}
           double average = total/10;

            System.out.println("The average is " +average);
//            for (i=1; i <= 10; i++);
//        System.out.println("Enter ya grade ");
//        int grade = scanner.nextInt();
//        if (grade > 0 && grade <= 100) {
//        total = total + grade;}
//        double average = total/10;
//        System.out.println("The average is " +average);

        }


    }
