package ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7};
        int[] nums2 = {2,4,6,8};
       int  m = nums1.length;
       int n = nums2.length;
        int[] nums3 = new int [m + n];
        merge1(nums1, m, nums2, n, nums3);
        for (int i = 0; i <n +m ; i++) {
            System.out.println(nums3[i] + " ");
            
        }

    }

    public static void merge(int[] nums1) {
      int  m = nums1.length;
//      int  n = nums2.length;
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            System.out.println(num);
        }

    }
    public  static void merge1(int[] nums1, int m, int[] nums2, int n, int[] newNums) {
        m = nums1.length;
        n = nums2.length;
        int z = 0;
        for (int i = 0; i <nums1.length ; i++) {
            newNums[z++] = nums1[i++];
        }
        for (int i = 0; i <nums2.length ; i++) {
            newNums[z++] = nums2[i++];
        }
        Arrays.sort(newNums);
    }
}
