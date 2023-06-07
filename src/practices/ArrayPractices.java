package practices;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractices {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int[] myVariable = getVariable(5);
//Arrays.stream(myVariable).forEach(System.out::println);
        for (int i = 0; i < myVariable.length ; i++) {
            System.out.println("Element " + i + " typed value was " + myVariable[i]);
        }
        System.out.println("The average is " +getAverage(myVariable));


        }

    private static int[] getVariable(int number) {
        System.out.println("Enter " + number + " integer " + "Value: ");
        int[] values = new int[number];
        for (int i = 0; i <values.length ; i++) {
            values[i] = scanner.nextInt();
        }return  values;
    }
    public static double getAverage(int[] number){
        int sum = 0;
        for (int i = 0; i < number.length ; i++) {
            sum +=number[i];;
        }
        return (double) sum / (double) number.length;
    }

}

