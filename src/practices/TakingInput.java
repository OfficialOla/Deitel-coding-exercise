package practices;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("How many students? ");
        int length = scanner.nextInt();
        String[] studentName = new String[length];
        for (int counter = 0; counter <length ; counter++) {
            System.out.println("Enter student " + (counter + 1));
            studentName[counter] = scanner.next();
        }
        System.out.println("Students name are: ");
        for (int i = 0; i <length ; i++) {
            System.out.println(studentName[i]);
        }
    }
}
