package com.kampus;
import java.util.Scanner;


class LinearEquation{
    private double a, b, c, d , e, f;

    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    double getA(){
        return this.a;
    }

    double getB(){
        return this.b;

    }

    double getC(){
        return this.c;

    }

    double getD(){
        return this.d;

    }

    double getE(){
        return this.e;

    }

    double getF(){
        return this.f;
    }

    boolean isSolvable(){
        return (this.a * this.d - this.b *this.c) != 0;
    }

    double getX(){
        return (this.e * this.d - this.b * this.f)/(this.a * this.d - this.b * this.c);
        
    }

    double getY(){
        return (this.a * this.f - this.e * this.c)/(this.a * this.d - this.b * this.c);
        
    }

    void display(){
        if(this.isSolvable()){
            System.out.printf("(x, y) = (%.1f, %.1f)", this.getX(), this.getY());
        }
        else{
            System.out.println("These equations have no solutions.");
        }
    }

    
}



 class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation persamaan1 = new LinearEquation(a, b, c, d, e, f);
        persamaan1.display();
        
    }
}
