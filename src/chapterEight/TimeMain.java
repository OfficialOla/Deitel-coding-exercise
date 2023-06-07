package chapterEight;

import java.util.Scanner;

public class TimeMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String... args) {
        Time myTime = new Time(23,45,56);

        try {
            System.out.println("Enter minute ");
            int minutes = scanner.nextInt();
            myTime.setMinutes(minutes);
            boolean minutesIsValid = minutes < 0 || minutes > 59;
            if (minutesIsValid) throw new IllegalArgumentException("Minutes is invalid");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            main();
        }

    }



    }

