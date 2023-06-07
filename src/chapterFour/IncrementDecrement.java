package chapterFour;

public class IncrementDecrement {
    public static void main(String[] args) {
        int number = 9;
        System.out.printf("number before increment is %d%n", number);
        System.out.printf("     increment is %d%n", number++);
        System.out.printf("number after increment is %d%n", number);
        System.out.println();
        number = 9;
        System.out.printf("number before preincrement %d%n", number);
        System.out.printf("     preincrement %d%n", ++number);
        System.out.printf("number after preincrement %d%n", number);
    }
}
