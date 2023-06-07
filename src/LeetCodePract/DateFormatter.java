package LeetCodePract;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        String date = "17/05/2023";
        System.out.println(formatDate(date));
    }

        public static String formatDate(String myDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(myDate, formatter);
            return date.format(DateTimeFormatter.ofPattern("ee, d MMMM, yyyy"));
        }
    }

