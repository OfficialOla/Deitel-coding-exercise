package practices;

public class ArrayMax {
    public static void main(String[] args) {
        double[] grades = {99.8, 34.6, 87.8, 56, 45.9, 78.9};
        double max = grades[0];
        double min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) max = grades[i];}

            System.out.println("Max number is " +max);
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) min = grades[i];}
        System.out.println("Min number is " +min);

        }
    }
