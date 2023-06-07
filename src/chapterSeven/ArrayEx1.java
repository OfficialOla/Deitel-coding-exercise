package chapterSeven;

public class ArrayEx1 {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        System.out.printf("%s%8s%n", "Index", "Value");
//        for (int counter = 0; counter < array.length; counter++) {
//            array[counter] = 2 + 2*counter;
//            System.out.printf("%5d%8d%n", counter, array[counter]);

//        }
        int[] array = {85, 33, 56, 43, 78, 88, 12, 80, 71, 99, 100};
        int total =0;
        for (int counter = 0; counter < array.length ; counter++) {
            total += array[counter];}
        System.out.printf("Total of array element: %d%n", total);

    }
}
