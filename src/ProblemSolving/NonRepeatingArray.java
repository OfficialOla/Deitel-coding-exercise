package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonRepeatingArray {
    public static void main(String[] args) {
        int[] arr = {8,8,9, 2, 3, 2, 6, 6};
        int[] counts = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
        for (int i = 0; i < arr.length ; i++) {
                if (counts[(arr[i])] == 1){
                    System.out.println(arr[i]);
                }
            }
        }

    }

