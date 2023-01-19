package com.tutorial;


class Student{

    //data member
    String name;
    String nim;

    //constructor
    Student(String name, String nim){
        this.name = name;
        this.nim = nim;
        
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Name: " + this.name);
        System.out.println("NIM: " + this.nim);
    }

    //method tanpa return dan ada parameter
    void setName(String name){
        this.name = name;
    }
    void setNim(String nim){
        this.nim = nim;
    }

    //method dengan return dan tanpa parameter
    String getName(){
        return this.name;
    }
    String getNim(){
        return this.nim;
    }

    //method dengan return dan parameter

    String sayHi(String message){
        return message + " there, my name is " + this.name;
    }

    void endl(){
        System.out.println();
    }
}

public class method {
    public static void main(String[] args) {
        Student student1 = new Student("ucup", "1330202");
        student1.show();
        student1.setName("Tutung");
        student1.endl();
        student1.show();
        student1.endl();

        System.out.println(student1.getName());
        System.out.println(student1.getNim());
        student1.endl();
        System.out.println(student1.sayHi("Hello"));

        
        
        
    }


}
