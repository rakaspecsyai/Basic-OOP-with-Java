package com.kampus;

 class MyInteger {
    private int num;

     MyInteger(int num) {

        this.num = num;

    }

     int getValue() {
        return num;
    }

     boolean isEven() {

        return num % 2 == 0;

    }

     boolean isOdd() {
        return num % 2 != 0;

    }

     boolean isPrime() {
        boolean check = false;
        for (int i = 3; i < num / 2; i++) {
            if (num % i == 0) {
                check = false;
            } else {
                return true;
            }
        }

        return check;
    }

     static boolean isEven(int num) {
        return num % 2 == 0;

    }

     static boolean isOdd(int num) {
        return num % 2 != 0;
    }

     static boolean isPrime(int num) {
        boolean check = false;
        for (int i = 3; i < num / 2; i++) {
            if (num % i == 0) {
                check = false;
            } else {
                return true;
            }
        }

        return check;

    }

     static boolean isEven(MyInteger num) {
        return num.isEven();

    }

     static boolean isOdd(MyInteger num) {
        return num.isOdd();
    }

     static boolean isPrime(MyInteger num) {
        return num.isPrime();
    }

     boolean equals(int num) {
        return this.num == num;
    }

     boolean equals(Integer num) {
       return this.num == num;
    }

     static int parseInt(char[] arr) {

        String str = String.valueOf(arr);

        int result = 0;

        for (int j = 0; j < str.length(); j++) {

            result += str.charAt(j);
        }

        return result;

    }

     static int parseInt(String num) {

        return Integer.parseInt(num);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + num;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyInteger other = (MyInteger) obj;
        if (num != other.num)
            return false;
        return true;
    }
    
    
}

class TestInteger{
    public static void main(String[] args) {
        MyInteger num1 = new MyInteger(12);
        System.out.println(num1.equals(12));
        System.out.println(num1.equals(21));

        MyInteger num2 = new MyInteger(0);
        System.out.println(num2.equals(num1));

        System.out.println(num2.isEven());
        System.out.println(num1.isOdd());
        System.out.println(num2.isPrime());
        System.out.println(num2.isPrime());
        System.out.println(MyInteger.parseInt("12"));


    }
}
