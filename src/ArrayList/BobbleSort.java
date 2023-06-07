package ArrayList;

import java.util.Arrays;

public class BobbleSort {
    public static void main(String[] args) {

        int[] array = new int[]{23, 56, 73, 12, 14, 58, 98, 90, 100, 299, 560,
                354, 10000, 3789, 20, 58, 69, 22, 10, 2, 3, 1};

        boolean swapSomething = true;

        while (swapSomething) {
            swapSomething = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapSomething = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}

