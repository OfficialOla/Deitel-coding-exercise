package chapterFour;

import java.util.Scanner;

public class ClassAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.println("enter result(1 == pass( 2 == fail)): ");
            int result = scanner.nextInt();
            if (result == 1) {
                pass += 1;}
            else {
                fail += 1;
            }
            counter += 1;
        }
        System.out.printf("Pass: %d%nFailed: %d%n", pass, fail);
        if (pass > 8 ){
            System.out.println("Bonus to instructor!");
        }
    }
}
