package chapterSeven;

import java.util.Arrays;

public class MultiDimenUsingForLoop {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        int counter = 1;
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers[row][column] = counter;
                counter++;
            }
        }
        for (int[]row:numbers) {
            System.out.println(Arrays.toString(row));

        }
//            System.out.println(Arrays.deepToString(numbers));
        }
    }
