package OOP;

import java.util.Scanner;

public class DependencyInversion {
    public static void showInputInUpperCase(){
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String upperCaseText = inputText.toUpperCase();
        System.out.println(upperCaseText);
    }

    public static void main(String[] args) {
        showInputInUpperCase();
    }
}
