package LeetCodePract;

import java.time.LocalDate;
import java.time.Period;

public class AgeCal {
    public static void main(String[] args) {
        String dob = "2020-01-01";
        System.out.println(calculateAge(dob));
    }
    public static String calculateAge(String dateString) {
        LocalDate startDate = LocalDate.parse(dateString);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        return "Period: " + years + " years, " + months + " months, " + days + " days";

//        int day = Integer.parseInt(dateString.substring(8, 10));
//        int month = Integer.parseInt(dateString.substring(5, 7));
//        int year = Integer.parseInt(dateString.substring(0, 4));
//
//
//        Calendar now = Calendar.getInstance();
//        int currentDay = now.get(Calendar.DAY_OF_MONTH);
//        int currentMonth = now.get(Calendar.MONTH) + 1;
//        int currentYear = now.get(Calendar.YEAR);
//
//
//        int age = currentYear - year;
//        if (currentMonth < month || (currentMonth == month && currentDay < day)) {
//            age--;
//        }

//        return LocalDate.now().minusDays(localDate.getYear());
    }

}

