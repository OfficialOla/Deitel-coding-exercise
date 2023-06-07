package breakSnacks;

import java.util.Scanner;

public class SevenSegment {
    static int[][] view = new int[5][4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary number");
        String userInput = scanner.nextLine();
        viewDisplay(userInput);
        showDisplay();

    }
    public static void showDisplay() {
        for (int[] row : view) {
            for (int column : row) {
                if (column == 1) {
                    System.out.print("# ");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void lineA() {
        view[0][0] = 1;
        view[0][1] = 1;
        view[0][2] = 1;
        view[0][3] = 1;
    }

    public static void lineB() {
        view[0][3] = 1;
        view[1][3] = 1;
        view[2][3] = 1;
    }

    public static void lineC() {
        view[2][3] = 1;
        view[3][3] = 1;
        view[4][3] = 1;
    }

    public static void lineD() {
        view[4][0] = 1;
        view[4][1] = 1;
        view[4][2] = 1;
        view[4][3] = 1;
    }

    public static void lineE() {
        view[2][0] = 1;
        view[3][0] = 1;
        view[4][0] = 1;
    }

    public static void lineF() {
        view[0][0] = 1;
        view[1][0] = 1;
        view[2][0] = 1;
    }

    public static void lineG() {
        view[2][1] = 1;
        view[2][2] = 1;
    }
    public static void viewDisplay(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '1') {
                switch (i) {
                    case 1 ->lineA();
                    case 2 -> lineB();
                    case 3 -> lineC();
                    case 4 -> lineD();
                    case 5 -> lineE();
                    case 6 -> lineF();
                    case 7 -> lineG();
                }
                }
//            else System.out.println("off!!");
            }
        }
    }

