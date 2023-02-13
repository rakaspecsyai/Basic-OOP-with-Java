package com.tutorial;

class GeometricObject {
    private String color;
    private boolean filled;

    GeometricObject(){

    }

    void setColor(String color) {
        this.color = color;
    }



    void setFilled(boolean filled) {
        this.filled = filled;
    }

    String getColor(){
        return color;
    }

    boolean isFilled(){
        return filled;
    }

    
}
