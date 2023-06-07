package practices;

import java.util.Arrays;

public class MultiDimenssionalArrayprcatice {
    public static void main(String[] args) {
        int[] intasrray = {1, 2, 3, 45};


        int[][] multidimArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int total = 0;
        for (int i = multidimArray.length-1; i >0; i--) {

          int[] subArr = multidimArray[i];

            for (int j = subArr.length-1; j >0 ; j--) {
                if(i == j){
                    subArr[j] = -100;
                }

            }
            System.out.println(Arrays.toString(subArr));
        }
    }
}
