package MCS;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class FemaleMenstrualApp {
    public static void main(String[] args) {
        startApp();

    }
        private static void startApp () {
            String message = """
                    Welcome to our menstrual cycle date app! what would you like to do? 
                    1. Check flow date for the next 12 months
                    2. Check next flow date
                    3. exit""";
            String input = input(message);
            switch (input.charAt(0)) {
                case '1' -> twelveMonthsFlow();
                case '2' -> nextMonthFlow();
                case '3' -> exit();
                default -> {
                    display("invalid input try again");
                    startApp();
                }
            }
        }

    private static void exit() {
    display("Thanks for using this application");
        System.exit(0);
    }

    private static void nextMonthFlow() {
        String firstName = input("Enter first name:: ");
        String lastName = input("Enter last name:: ");
        String dateOfLastFlow = input("Enter date of last flow(YYYY-mm-dd:: ");
        int cycleLength = Integer.parseInt(input("Enter cycle length:: "));
        int cycleInterval = Integer.parseInt(input("Enter cycle interval:: "));
        int age = Integer.parseInt(input("Enter your age:: "));
        UserCycle.validateAge(age);
        String gender = input("Enter your gender:: ");
        UserCycle.validateGender(gender);

        LocalDate result = LocalDate.parse(UserCycle.getNextFlowDate(dateOfLastFlow, cycleLength, cycleInterval));
        display(firstName +"" +" "+lastName +", your next flow date is: " + result);
        startApp();
        
    }

    private static void twelveMonthsFlow() {
        String firstName = input("Enter first name:: ");
        String lastName = input("Enter last name:: ");
        String dateOfLastFlow = input("Enter date of last flow(YYYY-mm-dd:: ");
       int cycleLength = Integer.parseInt(input("Enter cycle length:: "));
       int cycleInterval = Integer.parseInt(input("Enter cycle interval:: "));
        int age = Integer.parseInt(input("Enter your age:: "));
        UserCycle.validateAge(age);
        String gender = input("Enter your gender:: ");
        UserCycle.validateGender(gender);
         LocalDate result = LocalDate.parse(Objects.requireNonNull(UserCycle.getNextTwelveFlowDate(dateOfLastFlow, cycleLength, cycleInterval)));
         display((firstName +"" +" "+lastName +", your next flow date for 12 months is: " + result));
        startApp();

//        UserCycle.getNextTwelveFlowDate(dateOfLastFlow, cycleLength, cycleInterval);
    }
    public static String input(String prompt){
      return JOptionPane.showInputDialog(prompt);
    }
    public static void display(String message){
        JOptionPane.showMessageDialog(null, message);
    }

}
