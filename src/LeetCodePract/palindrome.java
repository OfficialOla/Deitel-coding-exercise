package LeetCodePract;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(73721));
    }

    public static boolean isPalindrome(int number){
        if ( number < 0 || number % 10 == 0 && number != 0)
            return false;
        int reversedNumber = 0;
        while(number > reversedNumber){
            int pop = number % 10;
            reversedNumber = reversedNumber * 10 + pop;
            number = number % 10;
            return number == reversedNumber || number == reversedNumber % 10;
        }

        return false;
    }
}
