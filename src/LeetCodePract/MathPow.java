package LeetCodePract;

public class MathPow {
    public static void main(String[] args) {
//        int number = 2;
//        int power = 5;
        mathPow(2, 10);
//        System.out.println(mathPow(2, 10));

    }
    public static void mathPow(int number, int power){
        int result = 0;
        for (int i = 0; i <power ; i++) {
            result *= power;
        }
    }
//    public static void mathPow(int number, int power){
//        int ans = 1;
//        if (power % 2 == 0){
//            number *= number;
//            power = power / 2;
//        } else {
//            ans = ans * number;
//        power = power - 1;
//        }
//    }
//    public static double myPow(double x, int n) {
//        double result = 1.0;
//        if (n < 0) {
//            x = 1 / x;
//            n = -n;
//        }
//        for (int i = 0; i < n; i++) {
//            result *= x;
//        }
//        return result;
//    }

}
