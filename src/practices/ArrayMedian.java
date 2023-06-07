package practices;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayMedian {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter ");
        System.out.println("Welcome to out statistics program!");
        System.out.println("how many numberInput do you want to enter? ");
        int userInput = scanner.nextInt();
        double [] numberInput = new double[userInput];
        for (int i = 0; i < numberInput.length; i++) {
            System.out.println("Enter numbers... " + (i + 1));
            numberInput[i] = scanner.nextDouble();
        }
//        System.out.println(getMode(numberInput));

//        System.out.println("Median ::" + getMedian(numberInput));
//        System.out.println(getMode(numberInput));
//        System.out.printf("Mean ::%.2f ", getMean(numberInput));
        System.out.println(getSummary(numberInput));
    }

    public static String getMedian(double[] num) {
        Arrays.sort(num);
        double median;
        if (num.length % 2 != 0) {
            median = num[num.length / 2];
        } else
            median = (num[num.length / 2] + num[num.length / 2 - 1]) / 2;
//            System.out.println(median);
        return String.format("Median of the data is ::" + median);
    }

    public static String getMode(double [] number) {

        double highestOccuringNumber = 0.0;
        double repeatedNumber = 0.0;
        int counter1 = 0;

        for (int num = 0; num < number.length; num++) {
            highestOccuringNumber = number[num];

            int count = 0;
            for (int i = 0; i < number.length ; i++) {
                if (highestOccuringNumber == number[i]){
                    count++;
                    }
                if (count > counter1){
                    counter1 = count;
                    repeatedNumber = highestOccuringNumber;
                   }

            }

       //String.format("mode is :: " + repeatedNumber + " \n"+
               // repeatedNumber + " was repeated " + counter1 + " times");
    }
        return String.format("mode is :: " + repeatedNumber + " \n"+
        repeatedNumber + " was repeated " + counter1 + " times");
    }
    public static String getMean(double [] number){

        double totalSum = 0.2f;
        double mean = 0.2f;
        for (int i = 0; i <number.length ; i++) {
            totalSum +=number[i];
            mean = totalSum / number.length;



        }
     return String.format("Mean of the data is ::%1$,.2f", +mean);
    }
    public static String getSummary(double [] numbers){


        return String.format(getMode(numbers) + "\n"+getMean(numbers) + "\n" + getMedian(numbers));
    }
}

