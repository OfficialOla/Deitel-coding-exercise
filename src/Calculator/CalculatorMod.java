package Calculator;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class CalculatorMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] number = new int[3][];
//        if (args.length != 3) {
//            System.out.println("Usage: Java calculator Operand1, operand, operand2");
//            System.exit(0);
//        }
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter number ");
           int userInput = scanner.nextInt();
           number = new int[userInput][];

            int result = 0;
            String e = "Error in operand";
            switch (args[1].charAt(0)) {
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
//            default:
//                throw new IllegalArgumentException(e);
            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        }
    }
}