package chapterSeven;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
//        Instantiation using keyword new
        int[][] numbers = new int[5][];
        numbers[0] = new int[4];
        numbers[1] = new int[5];
        numbers[2] = new int[6];

        numbers[0][0] =14;
        numbers[0][3] =20;

        numbers[2][3] = 6;
        numbers[1][0] = 12;

        System.out.println(Arrays.deepToString(numbers));

//       Static initiation
//int[][] numbers = {{1,2,3,7}, {4,5}, {7}, {10,11,12}};
//        for (int[]row: numbers) {
//            System.out.println(Arrays.toString(row));
//        }
    }
}
