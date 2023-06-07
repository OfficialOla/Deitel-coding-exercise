package practices;

public class MissingNumber {
    public static void main(String[] args) {
        int[] number = {1,2,4,5,6};
        System.out.println(findTheMissingNumber(number));
    }
   public static int findTheMissingNumber(int[] nums){
       int n = nums.length + 1;
       int expectedNumber = n * (n+1)/2;
       int actualNumber = 0;
       for (int num: nums){
           actualNumber +=num;
       }
       return expectedNumber - actualNumber;
   }
}
