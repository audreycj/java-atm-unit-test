package com.audreynanual;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // creating an instance of atmInterface
        ATMInterface atmInterface = new ATMInterfaceImpl();

        // correct ATM account and PIN values
        int atmAccount = 123;
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
            
            // validation success message
            System.out.println("\nValidation successful.\n");

            while(true) {

                // displaying the ATM menu of services
                System.out.println("===========================");
                System.out.println("1. View available balance");
                System.out.println("2. Withdraw amount");
                System.out.println("3. Deposit amount");
                System.out.println("4. View account statement");
                System.out.println("5. Exit");
                System.out.println("===========================");

                // asking user input for ATM service choice
                System.out.print("\nWhat do you want to do? ");
                int inputChoice = userInput.nextInt();

                switch(inputChoice) {
                    case 1: // View available balance
                    System.out.println("");
                        atmInterface.viewBalance();
                        break;

                    case 2: // Withdraw amount 
                        System.out.println("");
                        System.out.print("Amount to withdraw: ");
                        atmInterface.withdrawAmount(userInput.nextDouble());
                        break;

                    case 3: // Deposit amount
                        System.out.println("");
                        System.out.print("Amount to deposit: ");
                        atmInterface.depositAmount(userInput.nextDouble());
                        break;

                    case 4: // View account statement
                        atmInterface.viewAccountStatement();
                        break;

                    case 5: // Exit
                        System.out.println("\nDon't forget to collect your cash and ATM card. Thank you!\n");
                        System.exit(0);

                    default:
                        System.out.println("Please enter a valid option.");
                        break;
                } 

            }

        } else {
            System.out.println("\nInvalid ATM account or PIN.\n");
            System.exit(0);
        }
        userInput.close();
    }
}
