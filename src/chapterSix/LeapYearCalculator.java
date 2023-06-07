package chapterSix;

import java.util.Scanner;

public class LeapYearCalculator {
        public static void main(String[] args) {
            isLeapYear(); thankYou();
        }
        public static void isLeapYear() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Year in: ");
            int userInput = scanner.nextInt();
            if (((userInput % 4 == 0) && (userInput % 100 != 0)) || (userInput % 400 == 0)) {
                System.out.println(userInput + " " + "is a leap year!");
            }
            else System.out.println(userInput +" " +"is not a leap year!");
        }
        public static void thankYou() {
            System.out.println("Thank you for using my Calculator!!");

        }
    }


