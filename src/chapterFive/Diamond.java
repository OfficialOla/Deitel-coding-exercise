package chapterFive;

import javax.print.DocFlavor;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        String asterisk = "*";
        Scanner scanner = new Scanner(System.in);
        int blank = 4;
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        blank = 1;
        for (int i = 7; i >0 ; i-=2) {
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
            blank++;
            }
        }
    }
