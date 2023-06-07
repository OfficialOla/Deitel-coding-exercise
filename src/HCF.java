import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HCF {
    public static void main(String[] args) {
        int[] num = {30,180,270};
        System.out.println(getHCF(num));
    }

    public static List<Integer> getHCF(int[] nums) {
        List<Integer> newArr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
//        int[] newArr = new int[nums.length];
        for (int each : nums) if (each > max) max = each;
        for (int divisor = 2; divisor < max; divisor++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % divisor == 0) {
                    nums[i] /= divisor;
                    count++;
                }
            }
            if (count > 0){
                newArr.add(divisor);
                divisor--;
//            if (divisor == count) return newArr;
            }
                    }
        return newArr;
    }
}

