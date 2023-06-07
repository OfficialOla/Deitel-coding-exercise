package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
//        int[] arr = {2,4,5,3,8, 5, 89, -8, -0, 0, 67};
        int[] arr = {};
        sortedArr(arr);
        System.out.println(Arrays.toString(arr));

    }
 public static void sortedArr(int[] arr){
     for (int i = 0; i <arr.length ; i++) {
         int lastIndex = arr.length - i - 1;
         int maxIndex = getMaxIndex(arr, 0, lastIndex);
         swap(arr, maxIndex, lastIndex);
     }
 }
 public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
     for (int i = start; i <=end ; i++) {
         if (arr[max] <arr[i] ){
             max = i;
         }

     }
     return max;
 }
 public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
 }

}
