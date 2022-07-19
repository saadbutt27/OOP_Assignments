package myPack;

public class Time {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time(int h, int m, int s) {
        hour = h;
        minute = m;
        second = s;
    }

    // Getting Time which is initialized as 0 by constructor
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return hour;
    }
    public int getSecond() {
        return hour;
    }

    // Setting time through mutators
    public void setHour(int h) {
        hour = h;
    }
    public void setMinute(int m) {
        minute = m;
    }
    public void setSecond(int s) {
        second = s;
    }

    public void setTime(int h, int m, int s) { 
        hour = h;
        minute  = m;
        second = s;
    }

    // Printing Time
    public void print() {
        System.out.println("hh:mm:ss");
        System.out.print(((hour < 10 ? "0" + hour : hour)) + ":" + ((minute < 10 ? "0" + minute : minute)) + ":" + ((second < 10 ? "0" + second : second)));
    }
}