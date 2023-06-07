package chapterFour;

import java.util.Scanner;

public class Twelveth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day from 1 - 12: ");
        int day = scanner.nextInt();
        String chorus = " ";
        String song = " ";
        while (day <= 12);
        {
//        for (int i = 0; i < 12; i++) {
            switch (day) {
                case 1:
                    chorus = "A partridge in a pear tree\n";
                case 2:
                    chorus = "Two turtle doves\n";
                case 3:
                    chorus = "Three french hens\n";
                    break;
                case 4:
                    chorus = "Four calling birds\n";
                    break;
                case 5:
                    chorus = "Five golden rings\n";
                case 6:
                    chorus = "Six geese a-laying\n";
                case 7:
                    chorus = "Seven swans a-swimming\n";
                case 8:
                    chorus = "Eight maids a-milking\n";
                case 9:
                    chorus = "Nine ladies dancing\n";
                case 10:
                    chorus = "Ten lords a-leaping\n";
                case 11:
                    chorus = "Eleven pipers piping\n";
                case 12:
                    chorus = "Twelve drummers drumming\n";
            }
            song = chorus;
            System.out.println("On the " + day + " of Christmas, my true love sent to me\n " + song);
            System.out.println("enter a day from 1 - 12");
            day = scanner.nextInt();
        }


    }
}
