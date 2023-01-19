package com.tutorial;

class player{
    String name; // default, bisa diread dan diwrite

    player(String name){
        this.name = name;
    }
}







public class Keyword {
    public static void main(String[] args) {
        player player1 = new player("Encok");
        System.out.println(player1.name); //membaca data
        player1.name = "Marni"; //menulis data
        System.out.println(player1.name);
    }
}
