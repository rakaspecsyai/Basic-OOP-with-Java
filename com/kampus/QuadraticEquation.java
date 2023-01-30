package com.kampus;

class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
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

    double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }

    double getRoot1(){
        if (this.getDiscriminant() >= 0){
            return (-this.b + Math.pow(this.getDiscriminant(), 0.5))/(2 * this.a);

        }
        return 0;
    }   

    double getRoot2(){
        if(this.getDiscriminant() >= 0){
            return (-this.b - Math.pow(this.getDiscriminant(), 0.5))/(2 * this.a);
        }
        return 0;
    }

    void display(){
        System.out.println("Discriminant: " + this.getDiscriminant());
        System.out.println("Root 1: " + this.getRoot1());
        System.out.println("Root 2: " + this.getRoot2());

    }

    public static void main(String[] args) {
        QuadraticEquation persamaan1 = new QuadraticEquation(1, 4, 4);
        persamaan1.display();

        QuadraticEquation persamaan2 = new QuadraticEquation(1, -2, 4);
        persamaan2.display();
    }
}
