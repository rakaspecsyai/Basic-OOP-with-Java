package com.kampus;

class stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    double getChangePercent(){
        return (this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice * 100;
    }

    void display(){
        System.out.printf("Percentage: %.2f%%\n", this.getChangePercent());
    }
}

public class Stock {

    public static void main(String[] args) {
        stock blackRock = new stock("ORCL", "Oracle Corporation", 34.5, 34.35);

        

        blackRock.display();
    }
    
}
