package com.kampus.Bank;


public class account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public account(){

    }

    public account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public void setDateCreated(Date date){
        this.dateCreated = date;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/ 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public double withdraw(double withdraw){
        return this.balance - withdraw;
    }

    public double deposit(double deposit){
        return this.balance + deposit;
    }


    public void display(){
        System.out.println("Balance : "+ this.balance);
        System.out.println("The monthly interest rate : "+getMonthlyInterestRate());
        this.dateCreated.display();
    }


    
    


    

    
    
}


