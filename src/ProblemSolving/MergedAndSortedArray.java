package ProblemSolving;

import java.util.*;

public class MergedAndSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        List<Integer> newArr = new ArrayList<>();
        for (int j : arr1) {
            newArr.add(j);
        }
        for (int j : arr2) {
            newArr.add(j);
        }
        for (int i = 0; i < newArr.size() ; i++) {
            for (int j = 0; j < newArr.size(); j++) {
                if (newArr.get(i) < newArr.get(j)) {
                    int temp = newArr.get(i);
                    newArr.set(i, newArr.get(j));
                    newArr.set(j, temp);
                }
            }
        }
        System.out.println(newArr);
    }

    }




