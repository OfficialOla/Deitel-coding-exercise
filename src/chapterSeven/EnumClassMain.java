package chapterSeven;

import java.util.EnumSet;

public class EnumClassMain {
    public static void main(String[] args) {
        System.out.println("All books: ");
        for (EnumClass book :EnumClass.values()) {
            System.out.printf("%s %s %n", book.getTitle(), book.getCopyrightYear());}
        System.out.printf("%nDisplay range of enum constant%n");
            for(EnumClass book: EnumSet.range(EnumClass.JHTP, EnumClass.IW3HTP)){
                System.out.printf("%s %s%n", book.getTitle(), book.getCopyrightYear());
            }

        }
    }
