package chapterSix;

import java.util.Scanner;

public class FloatingMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three floating numbers separated by space: ");
        double userInput1 = scanner.nextDouble();
        double userInput2 = scanner.nextDouble();
        double userInput3 = scanner.nextDouble();

        double result = Maximum(userInput1, userInput2, userInput3);
        System.out.println("Maximum number is: " +result);
//        double result1 = FloatingMaxFinder.Maximum(userInput1, userInput2, userInput3);
//        System.out.println("Maximum number is: " +result1);
        double result2 =    minimum(userInput1, userInput2, userInput3);
        System.out.println("Minimum value is: " +result2);
    }
    private static double Maximum(double x, double y, double z) {
        double maxValue = x;
        if (y > maxValue) {
            maxValue = y;
        }
        if (z > maxValue) {
            maxValue = z;
        }
        return maxValue;
    }
    public static double minimum(double x, double y, double z) {
        double minValue = x;
        if (y < minValue) {
            minValue = y;
        }
        if (z < minValue) {
            minValue = z;
        }
        return minValue;
    }
}
