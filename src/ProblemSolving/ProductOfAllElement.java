package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfAllElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for (int k : arr) {
            int product = 1;
            for (int i : arr) {
                if (k != i) {
                    product *= i;
                }

            }

            System.out.println(product);
        }
    }
}
