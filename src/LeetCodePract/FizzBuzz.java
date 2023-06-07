package LeetCodePract;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(getFizzBuzz(100));
    }

    public static List<String> getFizzBuzz(int number) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                answer.add("fizzbuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("buzz");
            } else answer.add(Integer.toString(i));
        }
        return answer;
    }
}
