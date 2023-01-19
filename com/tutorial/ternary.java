package com.tutorial;
import java.util.*;

public class ternary {
    public static void main(String[] args) {
        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Value: ");
        input = inputUser.nextInt();
        inputUser.close();

        x = (input == 10) ? (input*input) : (input/2);

        /*
         * Jika using if
         * 
         * if(input == 10){
         *     x = input*input;
         * }else{
         *      x = input/2;
         * }
         */

        System.out.println("the result is " + x);
    }
}
