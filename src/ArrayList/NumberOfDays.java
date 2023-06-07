package ArrayList;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        double value = scanner.nextDouble();

        double numberOfMinutes = value/60;
        double valueInHours = numberOfMinutes;
        numberOfMinutes = valueInHours/24;
        double valueInDays = numberOfMinutes;
        numberOfMinutes = valueInDays/365;
        double numberOfMinutesInYears = numberOfMinutes;

        double numberOfDays = value / 60 /24 % 365;

        System.out.println();
        System.out.printf("The value of %.0f minutes is apprx %.0f years and %.0f days", value, numberOfMinutes, numberOfDays);
    }

}

