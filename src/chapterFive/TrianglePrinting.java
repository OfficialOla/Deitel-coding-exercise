package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
//        int blank = 9;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j == i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

                System.out.println();
//                blank--;
            }
            System.out.println();
            int blank = 10;
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= blank; j++) {
                    System.out.print("");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                blank--;
            }
            for (int i = 10; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();

            }
        }
    }
