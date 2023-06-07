package dsaSnacks;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String word = "abcdefgh df dgd";
        System.out.println(checkPangram(word));
    }


    public static boolean checkPangram(String word){
//       word = "abcgefg";
       String[] toToken = word.split("");
       for(String a : toToken){
           if (a.contains("a")) return true;
       }


        return false;
    }
}
