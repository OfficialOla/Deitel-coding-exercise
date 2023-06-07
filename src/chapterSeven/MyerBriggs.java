package chapterSeven;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MyerBriggs {

    public static void main(String[] args) {
        String userInput = "A";
        Scanner scanner = new Scanner(System.in);
        int choiceA =0;
        for (int i = 1; i < 21; i++) {
//            while (userInput.equalsIgnoreCase("A") && (userInput.equalsIgnoreCase("B")));{
//            if (!userInput.equalsIgnoreCase("A") && (!userInput.equalsIgnoreCase("B"))){
//                System.out.println("Wrong input. Please try again ");
//                System.out.println("Enter either A or B");
//                userInput = scanner.nextLine();
//            }
            switch (i) {
                case 1:
                    System.out.println("""
                            Question 1
                            A. expend energy, enjoy groups
                            B. conserve energy, enjoy one-on-one""");
                    System.out.println("Enter option A OR B: ");
                    userInput = scanner.next();
                        if (userInput.equalsIgnoreCase("A")){
                         choiceA = 1;
                         userInput = "A";
                    } else if (userInput.equalsIgnoreCase("B")){
                         choiceA =1;
                         userInput ="B";
                    } else{
                        System.out.println("Wrong input");
                        userInput = scanner.next();}
                case 2:
                    System.out.println("""
                            Question 2
                            A. interpret literally
                            B. look for meaning and possibilities""");
                    System.out.println("Enter option A OR B: ");
                    userInput = scanner.next();
                    if (userInput.equalsIgnoreCase("A")){
                        choiceA = 1;
                        userInput = "A";
                    } else if (userInput.equalsIgnoreCase("B")) {
                        choiceA = 1;
                        userInput = "B";
                    } else System.out.println("Wrong input"); break;
                case 3:
                    System.out.println("""
                            Question 3
                            A. logical, thinking, questioning;
                            B. empathetic, feeling, accommodating""");
                    System.out.println("Enter option A OR B: ");
                    userInput = scanner.next();
                    if (userInput.equalsIgnoreCase("A")){
                        choiceA = 1;
                        userInput = "A";
                    } else if (userInput.equalsIgnoreCase("B")) {
                        choiceA = 1;
                        userInput = "B";
                    } else System.out.println("Wrong input");break;
                case 4:
                    System.out.println("""
                            Question 4
                            A. organized, orderly;
                            B. flexible, adaptable""");
                    System.out.println("Enter option A OR B: ");
                    userInput = scanner.next();
                    if (userInput.equalsIgnoreCase("A")){
                        choiceA = 1;
                        userInput = "A";
                    } else if (userInput.equalsIgnoreCase("B")) {
                        choiceA = 1;
                        userInput = "B";
                    } else System.out.println("Wrong input"); break;
                case 5:
                    System.out.println("""
                            Question 5
                            A. more outgoing, think out loud;
                            B. more reserved, think to yourself""");
                    System.out.println("Enter option A OR B: ");
                    userInput = scanner.next();
                    if (userInput.equalsIgnoreCase("A")){
                        choiceA = 1;
                        userInput = "A";
                    } else if (userInput.equalsIgnoreCase("B")) {
                        choiceA = 1;
                        userInput = "B";
                    } else System.out.println("Wrong input"); break;
            }
            }
        }
    }
//}
//    }