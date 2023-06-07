package chapterFour;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.2000
                2. 5000
                3. 10000
                4. 15000
                5. 20000
                6. enter amount""");

        System.out.println("pick an option: ");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("Take your 2k");
                System.out.println("Thank you for using our platform");
                break;
            case 2:
                System.out.println("Take your 5k");
                System.out.println("Thank you for using our platform");
                break;
            case 3:
                System.out.println("take your 10k");
                System.out.println("Thank you for using our platform");
                break;
            case 6:
                System.out.println("enter amount: ");
                String amount = scanner.next();
//                handleOtherAmounts(amount);
                System.out.println("Take your " +amount +"k");
                break;
            default:
                System.out.println("money don finish");
        }
        }

//    private static void handleOtherAmounts(String amount) {
//    }

}

