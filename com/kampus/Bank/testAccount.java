package com.kampus.Bank;

public class testAccount {
    public static void main(String[] args) {
        account p1 = new account(1122, 20000);
        p1.setAnnualInterestRate(4.5);

        account p2 = new account(3200, 100000);
        p2.setAnnualInterestRate(300);


        p1.withdraw(2500);
        p1.deposit(3000);
        p1.display();

        System.out.println();


        p2.withdraw(700000);
        p2.deposit(1000000000);
        p2.display();
    }
    
}
