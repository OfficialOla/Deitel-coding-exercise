package chapterTwo;

import java.util.Scanner;

public class Arithmetic {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");

int firstNumber = input.nextInt();

System.out.print("Enter second integer: ");

int secondNumber = input.nextInt();

int Square = firstNumber * firstNumber;

int secondSquare = secondNumber * secondNumber;

int Sum = Square + secondSquare;

int Difference = Square - secondSquare;

System.out.printf(" Square of each is %d%n%d%n", Square, secondSquare);

System.out.printf(" Sum of their squares is %d%n", Sum);

System.out.printf(" Difference of their squares is %d%n", Difference);


}

}

