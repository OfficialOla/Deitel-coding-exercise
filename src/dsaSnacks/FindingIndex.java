package dsaSnacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingIndex {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 15};
        int value = 20;
        System.out.println(((arr(numbers, value))));
    }

    public static List<Integer> arr(int[] arry, int value){
//        int[] result = new int[arry.length];
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i <arry.length ; i++) {
            for (int j = 0; j <arry.length ; j++) {
                if (arry[i] + arry[j] == value){
                    index.add(i);
                    index.add(j);
                    return index;
                }

            }

        }
        return index;
    }
}
