package com.audreynanual;

public class ATM {

    // instance variables
    private double balance;
    private double amountToDeposit;
    private double amountToWithdraw;

    // default constructor 
    public ATM() {

    }

    // getter and setter methods for instance variables
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountToDeposit() {
        return amountToDeposit;
    }

    public void setAmountToDeposit(double amountToDeposit) {
        this.amountToDeposit = amountToDeposit;
    }

    public double getAmountToWithdraw() {
        return amountToWithdraw;
    }

    public void setAmountToWithdraw(double amountToWithdraw) {
        this.amountToWithdraw = amountToWithdraw;
    }
}
