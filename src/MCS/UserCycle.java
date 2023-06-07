package MCS;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserCycle {
   private int age;

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public static String getNextTwelveFlowDate(String lastCycleDate, int cycleLength, int cycleInterval) {
      LocalDate lastFlowDate = LocalDate.parse(lastCycleDate, DateTimeFormatter.ISO_LOCAL_DATE);
      LocalDate startDate = lastFlowDate.plusDays(cycleLength);
      for (int i = 0; i < 12; i++) {
      startDate =  startDate.plusDays(cycleInterval);
//         System.out.println(startDate);
      JOptionPane.showMessageDialog(null, startDate);
      }
      return null;
   }

   public static String getNextFlowDate(String lastCycleDate, int cycleLength, int cycleInterval){
      LocalDate lastFlowDate = LocalDate.parse(lastCycleDate, DateTimeFormatter.ISO_LOCAL_DATE);
      return String.valueOf(lastFlowDate.plusDays(cycleInterval));
   }
   public static void validateAge(int age) {
      if (age < 10 || age > 49) {
         System.err.println("Oops! you are not eligible for this service");
         System.exit(0);
      }
   }
   public static void validateGender(String gender){
      if (!gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("f")){
         System.err.println("Oops! you are not eligible for this service");
         System.exit(0);
      }
   }


   }

