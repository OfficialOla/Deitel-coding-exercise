package chapterThree;

import java.util.Scanner;

public class ClockApplication {
    public static void main(String[] args) {
        Clock myClock = new Clock(4, 59, 23);
        System.out.println(myClock.getHour() +":" +myClock.getMinute() +":" +myClock.getSecond());

    }
}
