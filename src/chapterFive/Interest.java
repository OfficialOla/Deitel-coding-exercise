package chapterFive;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        double interestRate = 0.05;
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int year = 1; year <=10 ; year++){
            double amount = (principal * Math.pow(1 + interestRate, year));
            System.out.printf("%4d%,20.2f%n", year, amount);
        }

    }
}
