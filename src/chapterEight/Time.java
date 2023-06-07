package chapterEight;

public class Time {
private int hour;
private int minutes;
private int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        validateMinutes(minutes);
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    public  Time(int hour, int minutes, int seconds) {
    validateTime(hour, minutes, seconds);
    this.hour = hour;
    this.minutes = minutes;
    this.seconds = seconds;
}

    public void validateTime(int hour, int minutes, int seconds){
    validateHour(hour);
    validateMinutes(minutes);
    validateSeconds(seconds);
}
public static void validateHour(int hour){
    boolean hourIsValid= hour < 0 || hour > 23;
    if (hourIsValid) throw new IllegalArgumentException("Hour is invalid");
}
public static void validateMinutes(int minutes){
    boolean minutesIsValid = minutes < 0 || minutes > 59;
    if (minutesIsValid) throw new IllegalArgumentException("Minutes is invalid");
}
public static void validateSeconds(int seconds){
    boolean secondIsValid = seconds < 0 || seconds > 59;
    if (secondIsValid) throw new IllegalArgumentException("Second is invalid");
}
}
