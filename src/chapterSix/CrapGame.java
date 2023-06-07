package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapGame {
    public static int bankBalance = 1000;
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static  final int BOX_CARS = 12;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        int newBalance;
        int myPoint = 0;
        Crap gameStatus;
        int sumofDice = rollDice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a wager: ");
        int wager = scanner.nextInt();
        for (; wager> bankBalance;) {
            System.out.println("reenter wager: ");
            wager = scanner.nextInt();
        }

        switch (sumofDice) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Crap.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Crap.LOST;
                break;
            default:
                gameStatus = Crap.CONTINUE;
                myPoint = sumofDice;
                System.out.printf("Point is %d%n ", myPoint);
                break;
        }
        while (gameStatus == Crap.CONTINUE) {
            sumofDice = rollDice();
            if (sumofDice == myPoint) {
                gameStatus = Crap.WON;
                if (gameStatus == Crap.WON) {
                    newBalance= bankBalance + wager;
                    System.out.println(newBalance);
                }
                System.out.println("Player wins");
                           }
            else {
                if (sumofDice == SEVEN) {
                    gameStatus = Crap.LOST;
                    if (gameStatus == Crap.LOST) {
                        newBalance = bankBalance - wager;
                        System.out.println(newBalance);
                        if (newBalance == 0) {
                            System.out.println("Sorry. You busted!");
                        }
                    }
                    System.out.println("Player loses");
                }
            }
                }
            }
        private static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum =  die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
    private static String chatter() {
        int sumofDice = SEVEN;
        if (sumofDice == SEVEN) {
            String gameStatus = String.valueOf(Crap.LOST);
            System.out.printf("Aw!.. you can do beter", gameStatus = randomNumbers.toString());

        }
        return null;
    }
    }


