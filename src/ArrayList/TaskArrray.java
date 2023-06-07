package ArrayList;

import java.util.Arrays;

public class TaskArrray {
    public static void main(String[] args) {
        int[] num = {12, 10, 3, 4};
        int[] newArray = new int[num.length];
        int counter = 0;
        for (int i = num.length-1; i >= 0 ; i--) {
//            System.out.println(Arrays.toString(newArray));
            newArray[counter] = num[i];
            counter++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
