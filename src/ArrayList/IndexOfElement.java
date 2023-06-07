package ArrayList;

import java.util.Arrays;

public class IndexOfElement {
    public static void main(String[] args) {
        int[] arr ={5, 9, 12, 12};
        System.out.println("Index of the lowest and highest element removed is " +Arrays.toString(highestLowestIndices(arr)));

    }
    public static int[] highestLowestIndices(int[] arr) {
        int minimumIndex = 0;
        int sum = 0;
        int maximumIndex = 0;
        int minimumSum = Integer.MAX_VALUE;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    sum += arr[j];
                }
            }
            if (sum < minimumSum) {
                minimumSum = sum;
                minimumIndex = i;
            }
            if (sum > maximumSum) {
                maximumSum = sum;
                maximumIndex = i;
            }
        }
        return new int[] {maximumIndex, minimumIndex};
    }

}

