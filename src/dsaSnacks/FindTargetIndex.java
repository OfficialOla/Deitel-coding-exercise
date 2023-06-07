package dsaSnacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndex {
    public static void main(String[] args) {
        int[] numbers = { 8, 7, 6, 5, 4, 3, 2, 1 };
        int value = 60;
        System.out.println(Arrays.toString(getIndex(numbers, value)));
    }

    public static int[] getIndex(int[] arr, int target){
      List<Integer>result = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = i; j < arr.length ; j++) {
                sum +=arr[j];
                result.add(j);
                if (sum == target){
                    int[] value = new int[result.size()];
                    for (int k = 0; k <result.size() ; k++) {
                        value[k] = result.get(k);
                    }
                    return value;
                }
            }
            
        }
        return new int[]{0};
    }
}
