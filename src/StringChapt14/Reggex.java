package StringChapt14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reggex {
    public static void main(String[] args) {

        //TODO  CHARACTER SET [A -Z] [0-9] [abc]

        //TODO QUANTIFIER  ? = 0 OR 1, + = 1 OR MORE, {n} = exactly n,
        // {n,}= atleast n, {n,m} = atleast n and at most m,  *= 0 or more
        // todo ^[abc] $
        // email@gmail.com
        //.matches(then pass in regex)
//        Matcher matcher = Pattern.matches();
//        matcher.matches();
        String userInput = "email09@gamil.com";
        System.out.println(userInput.matches("[[a-z0-9]+@[a-z]+\\.[a-z]{2,}]{15,}"));  // todo the {15, } indicates the total no of character
        System.out.println(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,}", userInput));

        Pattern pattern = Pattern.compile("[a-z0-9]+@[a-z]+\\.[a-z]{2,}");
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.matches());

    }
}
