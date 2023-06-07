package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LCFArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findLCF(20)));
    }


    public static int[] findLCF(int num) {
        int divider = 2;
        int count = 0;
        int[] newArr = new int[num/2];
        while (num> 1){
            if (num % divider == 0 ) {
                num /= divider;
                newArr[count] = divider;
            count++;
            }else divider++;
        }
      return  Arrays.copyOf(newArr, count);


        }


    }

