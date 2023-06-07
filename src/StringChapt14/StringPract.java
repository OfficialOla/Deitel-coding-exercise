package StringChapt14;

import java.util.Locale;
import java.util.Scanner;

public class StringPract {
    public static void main(String[] args) {
        String name = "Spencer";
        String temp = name;
        name += "Daniel";
//        System.out.println(name);
//        System.out.println(temp);

//        StringBuilder stringBuilder = new StringBuilder("Yinka");
//        StringBuilder value = stringBuilder;
//        stringBuilder.append("James");
//        value.append("Money");
//        System.out.println(value.insert(5 , value));
//        System.out.println(stringBuilder);
//        System.out.println(value);
//        StringBuilder sb = new StringBuilder(5);
//        sb= new StringBuilder("Kabir");
//        sb.append("Hello");
//        System.out.println(sb);
//TODO TOKENIZATION
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();

//        String tokens = sentence.toLowerCase(Locale.ROOT);
        String[] tokens = sentence.split(" ");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.print(token);
        }

    }
}

