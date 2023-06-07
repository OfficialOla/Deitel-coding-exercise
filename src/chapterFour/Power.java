package chapterFour;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int input = scanner.nextInt();
        System.out.println("enter second number: ");
        int input2 = scanner.nextInt();
//        int raiseToPower = 1;
//        while (input2 != 0) {
//            raiseToPower *= input;
//            --input2;
//        }
//        System.out.println(raiseToPower);

        if (input2 < 0) negativeExponential(input, input2);
        else {
            int result = 1;
            for (int i = 0; i < input; i++) {
                result *= input;
            }
            System.out.println(result);
        }
//         int num2 = input2 * input2;
//         int num3 = input2 * input2 * input2;
//         int num4 = input2 * input2* input2 * input2;
//         int num5 = input2 * input2* input2 * input2 * input2;
//         int num6 = input2 * input2* input2 * input2 * input2 * input2;
//         int num7 = input2 * input2* input2 * input2 * input2 * input2 * input2;
//         int num8 = input2 * input2* input2 * input2 * input2 * input2 * input2 * input2;
//         int num9 = input2 * input2* input2 * input2 * input2 * input2 * input2 * input2 * input2;
//         if (input2 >=2 ) {
//             System.out.println(input * input) ;}
//         else if  (input2 >= 3) {
//                 System.out.println(num3);
//             }
//         if (input2 >= 4){
//             System.out.println(num4);}
//         else if (input2 >=5) {
//             System.out.println(num5);}
//         if (input2 >=6) {
//             System.out.println(num6);}
//         else if (input >=7) {
//             System.out.println(num7);}
//         if (input >=8) {
//             System.out.println(num8);}
//         else if (input >=9) {
//             System.out.println(num9);}

    }
            private static void negativeExponential(int input, int input2){
        int result = 1;
        input2 *= -1;
        for (int i = 0; i < input2; i++) {
            result *= input;
        }
                System.out.println(1 + "/" + result);
            }

}