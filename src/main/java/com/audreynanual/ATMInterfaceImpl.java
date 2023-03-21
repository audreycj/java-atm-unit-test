package com.audreynanual;
import java.util.HashMap;

public class ATMInterfaceImpl implements ATMInterface{

    // instance of ATM class
    ATM atm = new ATM();

    // HashMap for account statement
    HashMap<Double, String> statement = new HashMap<>();

    // viewBalance() function - displays the current amount of funds in the ATM account
    @Override
    public void viewBalance() {
        System.out.print("Available balance: PHP " + atm.getBalance() + "\n\n");
    }

    // withdrawAmount() function - withdraws the amount inputted by the user from the account's current balance
    @Override
    public void withdrawAmount(double amountToWithdraw) {

        // if the inputted amount is 0 or lesser than the account's current balance, the withdraw operation is denied
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

    // depositeAmount() function - deposits the amount inputted by the user into the account's current balance
    @Override
    public void depositAmount(double amountToDeposit) {

        // if the inputted amount is 0 or a negetive value, the deposit operation is denied
        if (amountToDeposit < 1) {
            System.out.println("\nInvalid value.\n");
        } else {
            atm.setBalance(atm.getBalance() + amountToDeposit);
            System.out.println("PHP " + amountToDeposit + " deposited successfully.\n");
            viewBalance();
        }
    }

    // viewAccountStatement() function - displays
    @Override
    public void viewAccountStatement() {
        
        
    }
}
