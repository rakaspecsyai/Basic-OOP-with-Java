package com.tutorial;

class Pemain {
    private String name;
    private static int jumlahPlayer;

    Pemain(){
        Pemain.jumlahPlayer++;
        this.name = "Pemain" + Pemain.jumlahPlayer;
    }

    Pemain(String name){
        Pemain.jumlahPlayer++;
        this.name = name;
    }

    void display(){
        System.out.println("Pemain name: " + this.name);
    }


}
