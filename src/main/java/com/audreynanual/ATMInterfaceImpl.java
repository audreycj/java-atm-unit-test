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
        atm.setBalance(atm.getBalance() - amountToWithdraw);
        System.out.println("PHP " + amountToWithdraw + "withrawn successfully.");
        viewBalance();
    }

    @Override
    public void depositAmount(double amountToDeposit) {
        atm.setBalance(atm.getBalance() + amountToDeposit);
        System.out.println("PHP " + amountToDeposit + " deposited successfully.\n");
        viewBalance();
    }

    @Override
    public void viewAccountStatement() {
        // TODO Auto-generated method stub
        
    }
}
