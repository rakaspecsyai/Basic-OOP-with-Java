package com.kampus;


class Fan{
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    int getSpeed(){
        return this.speed;
    }

    boolean getOn(){
        return this.on;
    }

    double getRadius(){
        return this.radius;
    }

    String getColor(){
        return this.color;
    }

    void SLOW(){
        this.speed = this.SLOW;
    }

    void MEDIUM(){
        this.speed = this.MEDIUM;
    }

    void FAST(){
        this.speed = this.FAST;
    }

    void setOn(boolean on){
        this.on = on;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

    void setColor(String color){
        this.color = color;
    }

    public String toString(){
        if (this.on){
            return "this is a normal fan.\nSpeed: " + this.speed + "\n" + 
            "Radius: " + this.radius + "\n" + "Color: " + this.color;
        }
        else{
            return "this is a normal fan.\n" + "Color: " + this.color
            + "\n" + "Radius: " + this.radius + "\n" + "fan is off.";
        }
    }
}


public class kipas {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.setOn(true);
        fan.FAST();
        fan.setRadius(20);
        fan.setColor("Black");
        
        System.out.println(fan.toString());
    }
}
