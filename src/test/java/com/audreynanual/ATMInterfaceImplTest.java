package com.audreynanual;

import org.junit.Test;
import static org.junit.Assert.*;

public class ATMInterfaceImplTest {

    // unit tests for the withdrawAmount() function
    @Nested
    @DisplayName("Unit tests for the withdrawAmount() function")
    class WithdrawTest {

        // test if amountToWithdraw is more than the current balance
        @Test
        public void testWithdrawAmount_IfAmountIsMoreThanBalance() {
            ATMInterfaceImpl atmInterfaceImpl = new ATMInterfaceImpl();
            atmInterfaceImpl.withdrawAmount(1000);
            assertEquals("Insufficient balance.", "Insufficient balance.");
        }

        // test if amountToWithdraw is 0
        @Test
        public void testWithdrawAmount_IfAmountIsZero() {
            ATMInterfaceImpl atmInterfaceImpl = new ATMInterfaceImpl();
            atmInterfaceImpl.withdrawAmount(0);
            assertEquals("Invalid value.", "Invalid value.");
        }

        // test if amountToWithdraw is divisible by 20 or 50
        @Test
        public void testWithdrawAmount_IfAmountIsNotDivisibleBy20Or50() {
            ATMInterfaceImpl atmInterfaceImpl = new ATMInterfaceImpl();
            atmInterfaceImpl.withdrawAmount(25);
            assertEquals("The ATM can only give out banknotes.", "The ATM can only give out banknotes.");
        }

    }
}
