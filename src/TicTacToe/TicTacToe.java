package TicTacToe;

import java.util.Scanner;

public class  TicTacToe {
    public static final String player1 = "X";
    public static final String player2 = "O";
    public final static String[][] GAMEBOARD = new String[3][3];
    public static int[] gamelength = new int[3];
    public static int[] player = new int[2];
    public static String Blank = " , ";
    public static String gameIndex;
    public static Scanner scanner = new Scanner(System.in);

    public static void movePlayers(int number, String player) {
        int boardcount = 0;
        for (int row = 0; row < GAMEBOARD.length; row++) {
            for (int column = 0; column < GAMEBOARD.length; column++) {
                GAMEBOARD[row][column] = String.valueOf(boardcount);
                boardcount++;
                if (boardcount == number && GAMEBOARD[row][column] == Blank) {
                    GAMEBOARD[row][column] = player;
                } else if (boardcount == number && GAMEBOARD[row][column] != Blank) {
                    System.out.println("Player on board!");
                }
            }
        }
    }

    public static void gameInstruction() {
        System.out.println("""
                1. Game instruction
                2. Skip and start game""");
        System.out.println("Kindly select an option from above ");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            System.out.println("This is Tic-Tac-Toe game, \n" +
                    "You play by selecting a number from 1 to 9, each player plays in turn, \n" +
                    "You win if you fill the empty squares in same line or diagonal. \n" +
                    "All the best!!");
            System.out.println("Select '1' to return to the main menu ");
            int userInputToMain = scanner.nextInt();
            System.out.println("""
                    1. Game instruction
                    2. Skip and start game""");
            System.out.println("Kindly select an option from above ");
            userInput = scanner.nextInt();

        } else if (userInput == 2) {
            display();
        }
    }

    public static void printGameBoard(String[][] gameBoard) {

        for (String[] row : gameBoard) {
            for (String r : row) {
                System.out.print(r + " ");
            }
            System.out.println();

        }
    }

    public static void placeSymbol(String position, String[][] GAMEBOARD, String player) {
        String symbol = " ";
        if (player.equals(player1)) {
            symbol = "X";
        } else if (player.equals(player2)) {
            symbol = "O";
        }
        switch (position) {
            case "1":
                GAMEBOARD[0][0] = symbol;
                break;
            case "2":
                GAMEBOARD[0][1] = symbol;
                break;
            case "3":
                GAMEBOARD[0][2] = symbol;
                break;
            case "4":
                GAMEBOARD[1][0] = symbol;
                break;
            case "5":
                GAMEBOARD[1][1] = symbol;
                break;
            case "6":
                GAMEBOARD[1][2] = symbol;
                break;
            case "7":
                GAMEBOARD[2][0] = symbol;
                break;
            case "8":
                GAMEBOARD[2][1] = symbol;
                break;
            case "9":
                GAMEBOARD[2][2] = symbol;
                break;
        }

        printGameBoard(GAMEBOARD);    }

    public static void main(String[] args) {
        gameInstruction();
        display();
        checkWinner();
    }

    private static void display() {
        System.out.println("Please enter your name ");
        String playerOneName = scanner.next();
        System.out.println("Please enter your name ");
        String playerTwoName = scanner.next();

        while (true) {

            System.out.println("Enter number from (1-9): " + " " + playerOneName);
            String position = scanner.next();
            placeSymbol(position, GAMEBOARD, player1);
            System.out.println("Enter number from (1-9): " + "" + playerTwoName);
            position = scanner.next();
            placeSymbol(position, GAMEBOARD, player2);
        }

    }

    public static void checkWinner() {
        for (String[] row : GAMEBOARD) {
            for (String player : row) {

                if (player.equals(GAMEBOARD[0][0]) && player.equals(GAMEBOARD[0][1]) && player.equals(GAMEBOARD[0][2])) {
                    System.out.println("Congratulations, you won!");
                }
                 else if (player.equals(GAMEBOARD[1][0]) && player.equals(GAMEBOARD[1][1]) && player.equals(GAMEBOARD[1][2])) {
                    System.out.println("Congratulations, you won!");
                } else if (player.equals(GAMEBOARD[2][0]) && player.equals(GAMEBOARD[2][1]) && player.equals(GAMEBOARD[2][2])) {
                    System.out.println("Congratulations, you won!");
                } else if (player.equals(GAMEBOARD[0][0]) && player.equals(GAMEBOARD[1][0]) && player.equals(GAMEBOARD[2][0])) {
                    System.out.println("Congratulations, you won!");
                } else if (player.equals(GAMEBOARD[0][1]) && player.equals(GAMEBOARD[1][1]) && player.equals(GAMEBOARD[2][1])) {
                    System.out.println("Congratulations, you won!");
                } else if (GAMEBOARD[0][2].equals(GAMEBOARD[1][2]) && GAMEBOARD[2][2].equals(GAMEBOARD[0][2])) {
                    System.out.println("Congratulations, you won!");
                } else if (GAMEBOARD[0][0].equals(GAMEBOARD[1][1]) && GAMEBOARD[2][2].equals(GAMEBOARD[0][0])) {
                    System.out.println("Congratulations, you won!");
                } else if (GAMEBOARD[0][2].equals(GAMEBOARD[1][1]) && GAMEBOARD[2][0].equals(GAMEBOARD[0][2])) {
                    System.out.println("Congratulations, you won!");
                }
            }
        }
    }


        }
