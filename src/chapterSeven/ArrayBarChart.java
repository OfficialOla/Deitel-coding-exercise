package chapterSeven;

public class ArrayBarChart {
    public static void main(String[] args) {
//        int[] array = {85, 33, 56, 43, 78, 88, 12, 80, 71, 99, 100};
        int[] array = {0,1,0,1,1,1,0,2,3,1,1};
        System.out.println("Grade distribution: ");
        for (int counter = 0; counter <array.length ; counter++) {
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else System.out.printf( "%02d-%02d: ", counter*10, +counter*10 +9 );
            for (int star = 0; star <array[counter]; star++) {
                System.out.print("*");
                System.out.print("-");
            }
            System.out.println();

        }
    }
}
