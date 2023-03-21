package com.audreynanual;
import java.util.HashMap;
import java.util.Map;

public class ATMInterfaceImpl implements ATMInterface{

    // instance of ATM class
    ATM atm = new ATM();

    // HashMap instance for storing transactions
    HashMap<Double, String> accountStatement = new HashMap<>();

    // viewBalance() function - displays the current amount of funds in the ATM account
    @Override
    public void viewBalance() {
        System.out.print("Available balance: " + Utilities.moneyFormat(atm.getBalance()) + "\n\n");
    }

    // withdrawAmount() function - withdraws the amount inputted by the user from the account's current balance
    @Override
    public void withdrawAmount(double amountToWithdraw) {

        // amount to be withdrawn must be divisible by at least 20 (since 20 is the smallest Philippine bill)
        if (amountToWithdraw % 20 == 0) {
            // if the inputted amount is 0 or lesser than the account's current balance, the withdraw operation is denied
            if (amountToWithdraw > atm.getBalance()) {
                System.out.println("\nInsufficient balance.\n");
            
            } else if (amountToWithdraw == 0) {
                System.out.println("\nInvalid value.\n");

            } else {
                accountStatement.put(amountToWithdraw, " withdrawn."); // add this statement to transaction history
                atm.setBalance(atm.getBalance() - amountToWithdraw); // subtract inputted amount from current balance
                System.out.println("\nPHP " + amountToWithdraw + " withrawn successfully.\n");
                viewBalance();
            }
        } else {
            System.out.println("\nThe ATM can only give out banknotes.\n");
        }
    }

    // depositeAmount() function - deposits the amount inputted by the user into the account's current balance
    @Override
    public void depositAmount(double amountToDeposit) {

        // if the inputted amount is 0 or a negetive value, the deposit operation is denied
        if (amountToDeposit < 1) {
            System.out.println("\nInvalid value.\n");
        } else {
            accountStatement.put(amountToDeposit, " deposited."); // add this statement to transaction history
            atm.setBalance(atm.getBalance() + amountToDeposit); // add inputted amount to current balance
            System.out.println("\nPHP " + amountToDeposit + " deposited successfully.\n");
            viewBalance();
        }
    }

    // viewAccountStatement() function - displays the account's transaction history
    @Override
    public void viewAccountStatement() {

        System.out.println("");

        // iterating through the key/value mappings stored in the 'statement' HashMap
        for(Map.Entry<Double, String> statement:accountStatement.entrySet()) {
            System.out.println(statement.getKey() + statement.getValue());
        }

        System.out.println("");
        
    }
}
