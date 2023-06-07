package tdd;

public class Utme {
    public static void main(String[] args) {
        int number = 499;
        System.out.println(productOf(number));
    }

    public static int productOf(int number) {
        int numberOfCopies = 0;
        if (number > 0 && number <= 4) {
            numberOfCopies = number * 2000;
        }
        if (number > 4 && number <= 9) {
            numberOfCopies = number * 1800;
        }
        if (number > 9 && number <= 29) {
            numberOfCopies = number * 1600;
        }
        if (number > 29 && number <= 49) {
            numberOfCopies = number * 1500;
        }
        if (number > 50 && number <= 99) {
            numberOfCopies = number * 1300;
        }
        if (number > 100 && number <= 199) {
            numberOfCopies = number * 1200;}
        if (number > 199 && number <= 499) {
                numberOfCopies = number * 1100;
            }
            if (number > 500) {
                numberOfCopies = number * 1000;
            }
            return numberOfCopies;
        }
}