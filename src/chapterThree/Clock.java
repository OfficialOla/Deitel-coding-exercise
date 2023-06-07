package chapterThree;

// Create a class called Clock that includes three instance variables—an hour
//(type int), a minute (type int) and a second (type int)
//Provide a constructor that initializes the
//three instance variables and assumes that the values provided are correct.
// Provide a set and a get method for each instance variable.
public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
//        if (hour > 23 && minute > 59 && second > 59)
//            return;
        if (hour > 23)
            this.hour = 0;
        if (hour <=23 && minute < 59)
            this.hour = hour;
        if (hour <= 23 && minute > 59)
            this.hour = hour + 1;
        if (minute < 59 && second < 59 )
            this.minute = minute;
        if (minute >59)
        this.minute = 0;
        if (second > 59 && minute <= 59 )
            this.minute = minute +1;
        this.second = second;
        if (second > 59)
            this.second = 0;
    }

    public void setHour(int hour) {
//        if (hour > 23) this.hour = 0;
    }

    public void setMinute(int minute) {
//        if (minute > 59 && hour <= 23) this.minute = hour + 1;
    }

    public void setSecond(int second) {
//     if (second > 59 && minute <= 59) this.second = minute +1;
    }

    public int setClock(int hour, int minute, int second) {
      if (this.hour > 23 && this.minute > 59 && this.second > 59);
      return 0;
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
            return minute;
    }

    public int getSecond() {
        return second;
    }

    }
