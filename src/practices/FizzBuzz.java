package practices;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            } else System.out.println(i);
        }
    }



}
