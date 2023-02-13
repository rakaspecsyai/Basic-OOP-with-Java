package com.tutorial;

class overload {
    public static void main(String[] args) {
        Pemain player1 = new Pemain("Saitama");
        Pemain player2 = new Pemain();

        player1.display();
        player2.display();
    }
}
