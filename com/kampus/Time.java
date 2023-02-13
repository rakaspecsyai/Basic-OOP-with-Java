package com.kampus;

public class Time{
    private long hour, minute, second;

    Time(){
        this.hour = System.currentTimeMillis()/1000/60/60;
        this.minute = System.currentTimeMillis()/1000/60;
        this.second = System.currentTimeMillis()/1000;
    }

    Time(long elapsed){
        this.hour = (elapsed/1000/60/60) % 24;
        this.minute = (elapsed/1000/60) % 60;
        this.second = (elapsed/1000) % 60;
    }

    Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    void setTime(long elapseTime){
        this.hour = (elapseTime/1000/60/60) % 24;
        this.minute = (elapseTime/1000/60) % 60;
        this.second = (elapseTime/1000) % 60;
    }

    void display(){
        System.out.printf("%d:%d:%d\n", this.getHour(), this.getMinute(), this.getSecond());
    }

    
}

class TestTime{
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.display();
        System.out.println();
        Time time2 = new Time(555550000);
        time2.display();
        System.out.println();
        Time time3 = new Time(10, 20, 30);
        time3.display();
    }
}