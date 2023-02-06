package com.kampus;

class MyPoint {
    private double x, y;

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    MyPoint(){
        x = 0;
        y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint p){
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
    }


    double distance(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    void showText(){

    }

    String showText(int c){
        return "";
    }
    

}
