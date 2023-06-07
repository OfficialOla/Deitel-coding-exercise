package chapterSeven;

public class PassByValue {
    public static void main(String[] args) {
        int number = 10;
        square(number);
        System.out.println("number after squaring:: "+number);
        addition(number);
        System.out.println("number after addition:: "+number);

    }
    private static void square(int firstNumber) {
        firstNumber = firstNumber*firstNumber;
        System.out.println("square of first number:: "+firstNumber);
    }
    private static void addition(int firstNumber) {
        firstNumber = firstNumber+firstNumber;
        System.out.println("square of first number:: "+firstNumber);

    }
}
