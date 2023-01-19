package com.kampus;
import java.util.Scanner;

public class AngkaToHuruf{

    private static final String[] specialNames = {
        "",
        " ribu",
        " juta",
        " milyar",
        " triliun",
        " quadriliun",
        " quintiliun"
    };
    
    private static final String[] tensNames = {
        "",
        " sepuluh",
        " dua puluh",
        " tiga puluh",
        " empat puluh",
        " lima puluh",
        " enam puluh",
        " tujuh puluh",
        " delapan puluh",
        " sembilan puluh"
    };
    
    private static final String[] numNames = {
        "",
        " satu",
        " dua",
        " tiga",
        " empat",
        " lima",
        " enam",
        " tujuh",
        " delapan",
        " sembilan",
        " sepuluh",
        " sebelas",
        " dua belas",
        " tiga belas",
        " empat belas",
        " lima belas",
        " enam belas",
        " tujuh belas",
        " delapan belas",
        " sembilan belas"
    };

    private String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20){
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;
            
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " ratus" + current;
    }
    
    public String convert(int number) {

        if (number == 0) { return "nol"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negatif";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AngkaToHuruf obj = new AngkaToHuruf();
        System.out.print("Masukkan angka: ");
        int number = input.nextInt();
        System.out.println("angka dalam huruf: " + obj.convert(number));
        input.close();
    }


}
