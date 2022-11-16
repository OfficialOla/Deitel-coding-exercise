package chapterThree;

import java.util.Scanner;

public class OddEven {

public static void main(String[] arg) {

Scanner input = new Scanner(System.in);

System.out.println("Enter number: ");
double userInput = input.nextDouble();
 

if (userInput %2 == 0)
System.out.printf("%.0f an even number", userInput); else
{
System.out.printf("%.0f is an odd number", userInput);
}

}
}