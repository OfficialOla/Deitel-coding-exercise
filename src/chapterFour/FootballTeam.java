package chapterFour;

import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Goalkeeper
                2. Defender
                3. Defender
                4. Defender
                5. Defender
                6. Midfielder
                7. Midfielder
                8. Midfielder
                9. Attacker
                10.Attacker
                11. Attacker
                """);
        System.out.println("Pick an option to know the name of your player: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Your Goalkeeper is Olayinka");
                break;
            case 2:
                System.out.println("Your defender is Ridwanullahi");
                break;
            case 3:
                System.out.println("Your defender is Tayo");
                break;
            case 4:
                System.out.println("Your defender is Idris");
                break;
            case 5:
                System.out.println("Your Defender is Timothy");
                break;
            case 6:
                System.out.println("Your Midfielder is Economist");
            case 7:
                System.out.println("Your Midfielder is Samuel");
            case 8:
                System.out.println("Your Midfielder is Victor");
            case 9:
                System.out.println("Your Attacker is Felix");
            case 10:
                System.out.println("Your Attacker is IK");
            case 11:
                System.out.println("Your Attacker is Moyin");
                break;
            default:
                System.out.println("Sorry, you didn't make 1st eleven");
        }
    }
}
