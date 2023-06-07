package practices;

import java.util.ArrayList;
import java.util.List;

public class LCM {
    public static void main(String[] args) {
        System.out.println(getLCM(new int[]{3,6,8}));
    }
    public static int getLCM(int [] numbers){
        List<Integer> dividers = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int each:numbers ) if (each > max) max = each;
        for (int divider = 2; divider < max ; divider++) {
            int count = 0;
            for (int i = 0; i < numbers.length ; i++) {
                if (numbers[i] % divider == 0){
                    numbers[i] /= divider;
                    count++;
                }
            }
            if (count > 0 ) {
                dividers.add(divider);
                divider--;
            }
        }
        System.out.println(dividers);
        int result = 1;
        for (int each: dividers) {
            result *=each;
        }
        return  result;
    }
}
