package practices;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        long numberOfLoopExecutions = 0;
        long number = scanner.nextLong();
        for(long counter = number-1; counter>=1 ; counter--) {
            number = number * counter;
            numberOfLoopExecutions++;
        }
            System.out.println("factorial is " +number);
        System.out.println("loop executed " +numberOfLoopExecutions+ "times");
        }
    }
