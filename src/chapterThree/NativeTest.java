package chapterThree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NativeTest {
    public static void main(String[] args) {
        Native pauline = new Native();
        String herName = pauline.getName();
        System.out.println(herName);
    pauline.setName("pauline");
    herName = pauline.getName();
        System.out.println(herName);
//        String newPhone = pauline.getPhoneNumber();
        pauline.setPhoneNumber("08133445566");
//        newPhone = pauline.getPhoneNumber();''''\/getPhoneNumber
        System.out.println(pauline.getPhoneNumber());
        pauline.setAge(24);
        System.out.println(pauline.getAge());
    }
}
