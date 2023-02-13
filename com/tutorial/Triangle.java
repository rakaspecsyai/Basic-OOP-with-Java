package com.tutorial;

import java.util.Scanner;

class Triangle extends GeometricObject{
    private double side1, side2, side3;

    Triangle(){
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    double getArea(){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
    }

    double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 =" + side1 + ", side2 =" + side2 + ", side3 =" + side3;
    }

    void display(){
        System.out.printf("Area: %.2f\nPerimeter: %.2f\nColor: %s\nFilled: %b\n", getArea(), getPerimeter(), getColor(), isFilled());
        
    }

    

    
}
class Test{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = cin.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = cin.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = cin.nextDouble();

        Triangle tr1 = new Triangle(side1, side2, side3);
        System.out.print("Enter color: ");
        String color = cin.next();
        tr1.setColor(color);
        System.out.print("Wanna fill the triangle?(true/false): ");
        boolean checkFill = cin.nextBoolean();
        tr1.setFilled(checkFill);

        System.out.println(tr1.toString());
        tr1.display();
        cin.close();

    }
}
