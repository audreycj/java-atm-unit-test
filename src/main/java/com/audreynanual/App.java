package com.audreynanual;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // correct ATM account and PIN values
        int atmAccount = 12345;
        int atmPIN = 123;

        // welcome message
        System.out.println("\nWelcome!\n");

        // asking user input for ATM account and PIN
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter ATM number: ");
        int inputAccount = userInput.nextInt();

        System.out.print("Enter PIN: ");
        int inputPIN = userInput.nextInt();

        // validating user number and PIN
        if ((atmAccount == inputAccount) && (atmPIN == inputPIN)) {
            System.out.println("\nValidation successful.\n");

            // displaying the ATM menu of services
            System.out.println("1. View available balance");
            System.out.println("2. Withdraw amount");
            System.out.println("3. Deposit amount");
            System.out.println("4. View account statement");
            System.out.println("5. Exit");

            // 

        } else {
            System.out.println("\nInvalid ATM account or PIN.\n");
            System.exit(0);
        }
    }
}
