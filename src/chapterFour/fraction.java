package chapterFour;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            int product = 1;
            for (int j = 1; j <= number; j++) {
                if (j == i){
                    continue;
                }
                product *= j;
            }
            sum += product;
        }
            int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *=i;
        }
        int numerator = sum;
        int denominator = factorial;
        int dividend = 1;
        for (int i = factorial; i >= 1 ; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                dividend *= i;
                numerator = numerator / i;
                denominator = denominator / i;
            }

        }
        System.out.printf("fraction: %d/%d%n", numerator, denominator);
        System.out.println("decimal: " +(double)numerator / denominator);
        }
//        double userInput = scanner.nextDouble();
//        double count = 0;
//        double fraction =0;
//        double sum = 0;
//        double numerator = count;
//        for (count = 1; count <= userInput; count++) {
//            fraction = 1 / count;
//            sum +=fraction;}
//        System.out.println(sum);
//        System.out.println();
//        for (count = 1; count <= userInput; count++) {
//            numerator = count;
//        }
//        System.out.pri  u ntln( numerator + "/" +fraction);
//}
}
