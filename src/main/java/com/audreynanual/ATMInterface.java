package com.audreynanual;

public interface ATMInterface {
    public void viewBalance();
    public void withdrawAmount(double amountToWithdraw);
    public void depositAmount(double amountToDeposit);
    public void viewAccountStatement();
}
