package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,5, 1,2,1};
//        System.out.println(findSingleElement(arr));
        System.out.println(Arrays.toString(findingMultipleSingleElementsUsingHash(arr)));
    }

    public static int findSingleElement(int[] arr){
        int result = 0;
        for (int i = 0; i <arr.length ; i++) {
            result ^= arr[i];
        }
        return result;
    }
    public static int[] findingMultipleSingleElementsUsingHash(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i] +1));
            }else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> singleNum = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (map.get(arr[i]) == 1) {
                singleNum.add(arr[i]);
            }
        }
        int[] result = new int[singleNum.size()];
        for (int i = 0; i <singleNum.size() ; i++) {
        result[i] = singleNum.get(i);
        }
        return result;
    }
}
