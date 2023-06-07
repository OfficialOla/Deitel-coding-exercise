package StringChapt14;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatter {
    private  static Date date;

    public static void main(String[] args)  {
        System.out.println(formatDate("17/04/2023"));
    }
    public static String formatDate(String date) {
        String[] dateFormat = date.split("/");
        LocalDate localDate = LocalDate.of(Integer.parseInt(dateFormat[2]), Integer.parseInt(dateFormat[1]),
                Integer.parseInt(dateFormat[0]));
        System.out.println(DateTimeFormatter.ofPattern("EEEE, d MMMM, YYYY").format(localDate));

        int day = Integer.parseInt(dateFormat[0]);
        int month = Integer.parseInt(dateFormat[1]);
        int year = Integer.parseInt(dateFormat[2]);
        String months;

        switch (month) {
            case 1:
                months = "January";
                break;
            case 2:
                months = "February";
                break;
            case 3:
                months = "March";
                break;
            case 4:
                months = "April";
                break;
            case 5:
                months = "May";
                break;
            case 6:
                months = "June";
                break;
            case 7:
                months = "July";
                break;
            case 8:
                months = "August";
                break;
            case 9:
                months = "September";
                break;
            case 10:
                months = "October";
                break;
            case 11:
                months = "November";
                break;
            case 12:
                months = "December";
                break;
            default:
                throw new IllegalArgumentException("Invalid month value: " + month);
        }

        return String.format("%02d %s, %d", day, months, year);

    }

}
