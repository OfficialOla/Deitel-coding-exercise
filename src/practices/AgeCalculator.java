package practices;
import java.time.LocalDate;
import java.util.Scanner;

import static java.util.Scanner.*;
public class AgeCalculator {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        getAgeCalculator();
    }
    public static void getAgeCalculator(){
        String name = null;

        try {
            // Prompt the user to enter a string
            System.out.println("What is your name? ");
            name = scanner.nextLine();

            // Do something with the string
            System.out.println("You entered: " + name);
        } catch (Exception e) {
            // Print an error message if an exception is thrown
            System.out.println("Error: Invalid input!");
        }
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        int yearOfBirth = LocalDate.now().minusYears(age).getYear();
        System.out.println("Hey " + name + ", you were born in " +yearOfBirth);
        if (age > 18){
            System.out.println("you are an adult :)");
        }else System.out.println("you are still a child");
    }

    }

