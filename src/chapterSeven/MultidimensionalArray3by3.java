package chapterSeven;

import java.util.Arrays;

public class MultidimensionalArray3by3 {
    public static void main(String[] args) {
//        Instantiation using keyword new
        int[][] numbers = new int[3][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;

        for (int[] row : numbers) {
            System.out.println(Arrays.toString(row));

        }
    }
}