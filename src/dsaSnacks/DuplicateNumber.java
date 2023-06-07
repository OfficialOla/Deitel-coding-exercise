package dsaSnacks;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 6};
        int newArr = 0;
        int counter = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    newArr = arr[i];

                        }
            }
            System.out.println(newArr);

        }
    }
}
