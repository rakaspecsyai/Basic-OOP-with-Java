package com.kampus;

public class Time{
    private long hour, minute, second;

    Time(){
        this.hour = System.currentTimeMillis()/1000/60/60;
        this.minute = System.currentTimeMillis()/1000/60;
        this.second = System.currentTimeMillis()/1000;
    }

    Time(int a){

    }

    Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    
}

class TestTime{
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    }
}