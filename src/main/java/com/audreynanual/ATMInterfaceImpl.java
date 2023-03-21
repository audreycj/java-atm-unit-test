package com.audreynanual;
import java.util.HashMap;

public class ATMInterfaceImpl implements ATMInterface{

    // instance of ATM class
    ATM atm = new ATM();

    // HashMap for account statement
    HashMap<Double, String> statement = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.print("Available balance: PHP " + atm.getBalance() + "\n\n");
    }

    @Override
    public void withdrawAmount(double amountToWithdraw) {
        if (amountToWithdraw > atm.getBalance()) {
            System.out.println("\nInsufficient balance.\n");
        } else if (amountToWithdraw == 0) {
            System.out.println("\nInvalid value.\n");
        } else {
            atm.setBalance(atm.getBalance() - amountToWithdraw);
            System.out.println("PHP " + amountToWithdraw + " withrawn successfully.\n");
            viewBalance();
        }
    }

    @Override
    public void depositAmount(double amountToDeposit) {
        if (amountToDeposit < 1) {
            System.out.println("\nInvalid value.\n");
        } else {
            atm.setBalance(atm.getBalance() + amountToDeposit);
            System.out.println("PHP " + amountToDeposit + " deposited successfully.\n");
            viewBalance();
        }
    }

    @Override
    public void viewAccountStatement() {
        // TODO Auto-generated method stub
        
    }
}
