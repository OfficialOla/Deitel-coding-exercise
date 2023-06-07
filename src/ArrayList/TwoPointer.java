package ArrayList;

import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
       int[] num = {1,2,3,4,5,6};
       int[] sum = new int[num.length];
       int counter = num.length/2;
       int start = 0;
       int start2 = counter;
       int count=0;
        for (int i = 0; i < counter; i++) {
            sum[count++] = num[start];
            sum[count] = num[start2];
            start2++;
            start++;
            count++;


        }
        System.out.println(Arrays.toString(sum));


        }
    }

