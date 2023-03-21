package com.audreynanual;

public class ATMInterfaceImpl implements ATMInterface{

    // instance of ATM class
    ATM atm = new ATM();

    @Override
    public void viewBalance() {
        System.out.print("Available balance: PHP " + atm.getBalance() + "\n\n");
    }

    @Override
    public void withdrawAmount(double amountToWithdraw) {
        System.out.println("");
    }

    @Override
    public void depositAmount(double amountToDeposit) {
        System.out.println("PHP " + amountToDeposit + " deposited successfully.\n");
        atm.setBalance(atm.getBalance() + amountToDeposit);
        viewBalance();
    }

    @Override
    public void viewAccountStatement() {
        // TODO Auto-generated method stub
        
    }
}
