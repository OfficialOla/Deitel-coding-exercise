package chapterSix;

import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an input ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <=number; i++) {
//            for (int j = 1; j <= number; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1 ; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
           }
//           public  static int squareOf(int number){
//        int squareOf = 4;
////               int squareOf = (int)Math.pow(number, 2);
//               System.out.println(squareOf);
//               return squareOf;
//           }
}
