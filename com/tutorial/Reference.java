package com.tutorial;

class Buku{
    String nama;
    String penulis;

    Buku(String nama, String penulis){
        this.nama = nama;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.nama);
        System.out.println("Penulis\t: " + this.penulis);
    }
}


public class Reference {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Atomic Habits", "Mark Ronson");
        buku1.display();

        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

        Buku buku2 = buku1;

        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        buku1.nama = "Burung Terbang";
        buku1.display();
        buku2.display();

        //memasukan object ke dalam method
        fungsi(buku2);
        buku1.display();
        buku2.display();
    }

    static void fungsi(Buku dataBuku){
        String addressDatabuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println(addressDatabuku);
        dataBuku.penulis = "Jihito guguk";
    }
}
