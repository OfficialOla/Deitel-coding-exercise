package chapterTwo;

import java.util.Scanner;

public class Comparison {

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

  System.out.print("Enter first number");

	int highestNumber = scanner.nextInt();

	int lowestNumber = highestNumber;

System.out.print("Enter second number");

	int userInput = scanner.nextInt();

	if (userInput > highestNumber) highestNumber = userInput;
	if (userInput < highestNumber) lowestNumber = userInput;

System.out.print("Enter third number: ");

	userInput = scanner.nextInt();

	if (userInput > highestNumber) highestNumber = userInput;
	if (userInput < highestNumber) lowestNumber = userInput;


System.out.print("Enter fourth number: ");

	userInput = scanner.nextInt();

	if (userInput > highestNumber) highestNumber = userInput;
	if (userInput < highestNumber) lowestNumber = userInput;

System.out.printf("The largest number is %d%n%n and the smallest number is %d%n", highestNumber, lowestNumber);

}

}










