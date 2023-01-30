package com.kampus;
import java.util.Scanner;

class intersection {
    private double x1, x2, x3, x4, y1, y2, y3, y4;

    public intersection(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    boolean isIntersect(){
        return (x1-x2) * (y3-y4) - (y1-y2) * (x3 - x4) != 0;
    }

    double getPx(){
        return ((x1*y2 - y1*x2) * (x3-x4) - (x1-x2) * (x3*y4 - y3*x4))/((x1-x2) * (y3-y4) - (y1-y2) * (x3 - x4));
    }

    double getPy(){
        return ((x1*y2 - y1*x2) * (y3-y4) - (y1-y2) * (x3*y4 - y3*x4))/((x1-x2) * (y3-y4) - (y1-y2) * (x3 - x4));
    }

    void display(){
        if(this.isIntersect()){
            System.out.printf("The intersecting point is : (%.1f, %.1f)", this.getPx(), this.getPy());
        }
        else{
            System.out.println("These lines don't intersect.");
        }
    }
    private kipas[] a;
}

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter endpoints of the first line segment: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println();
        System.out.print("Enter endpoints of the second line segment: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        input.close();

        intersection lines = new intersection(x1, x2, x3, x4, y1, y2, y3, y4);

        lines.display();
        
    }
}
