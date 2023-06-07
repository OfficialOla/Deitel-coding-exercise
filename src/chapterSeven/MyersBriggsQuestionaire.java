package chapterSeven;

import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsQuestionaire {
    private static String A;
    private static  String B;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Question 1");
        System.out.println("""
                A. expend energy, enjoy groups
                B. conserve energy, enjoy one-on-one""");
        System.out.println("select which is appropriate to you. A or B: ");
        String userInput1 = scanner.next();
//            if (!userInput1.equals("A") && (!userInput1.equals("B")))
//                System.out.println("enter valid number abeg!!!!!");
//            String userInput = scanner.next();
                System.out.println("Question 2");
                System.out.println("""
                        A. interpret literally
                        B. look for meaning and possibilities""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput2 = scanner.next();
//                invalidOption(userInput2);
                System.out.println("Question 3");
                System.out.println("""
                        A. logical, thinking, questioning;
                        B. empathetic, feeling, accommodating""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput3 = scanner.next();
                System.out.println("Question 4");
                System.out.println("""
                        A. organized, orderly;
                        B. flexible, adaptable""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput4 = scanner.next();
                System.out.println("Question 5");
                System.out.println("""
                        A. more outgoing, think out loud;
                        B. more reserved, think to yourself""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput5 = scanner.next();
                System.out.println("Question 6");
                System.out.println("""
                        A. practical, realistic, experimental;
                        B. imaginative, innovative, theoretical""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput6 = scanner.next();
                System.out.println("Question 7");
                System.out.println("""
                        A. candid, straight forward, frank;
                        B. tactful, kind, encouraging""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput7 = scanner.next();
                System.out.println("Question 8");
                System.out.println("""
                        A. plan, schedule;
                        B. unplanned, spontaneous""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput8 = scanner.next();
                System.out.println("Question 9");
                System.out.println("""
                        A. seek many tasks, public activities, interaction with others;
                        B. seek private, solitary activities with quiet to concentrate""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput9 = scanner.next();

                System.out.println("Question 10");
                System.out.println("""
                        A. standard, usual, conventional;
                        B. different, novel, unique""");
                System.out.println("Please select which is appropriate to you. A or B: ");
                String userInput10 = scanner.next();
            }
//    private static void invalidOption(String userInput1) {
//        while (userInput == A & userInput == B) {
//            if (userInput != A || userInput != B)
//            System.out.println("Please enter a valid number!!!!");}
        }
//        }