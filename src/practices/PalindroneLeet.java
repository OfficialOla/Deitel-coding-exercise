package practices;

public class PalindroneLeet {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;}
        int reversedNumber = 0;
        int originalNumber = x;
        while(originalNumber!=0){
            int digit  = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }
        return x==reversedNumber;
    }
}

