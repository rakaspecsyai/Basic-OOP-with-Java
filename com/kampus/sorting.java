package com.kampus;

public class sorting {
    int A[];
    sorting(int x){
        this.A = new int[x];
    }

    void swap(int x){
        this.A[x] = 0;
    }


    public static void main(String[] args) {
        sorting array = new sorting(16);
        array.A[0] = 10;

        array.swap(0);

    

    }
}
