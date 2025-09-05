package com.ozmen.junit.Assertions;

import org.junit.jupiter.api.Test;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class AccountTest {

    @Test
    void testTransactionHistory() {
        // Arrange
        Account account = new Account(0);

        account.deposit(1200);
        account.withdraw(900);
        account.deposit(430);

        List<String> expected = Arrays.asList(
                "Deposit: 1200",
                "Withdraw: 901",
                "Deposit: 430"
        );

        // Act
        List<String> actual = account.getTransactions();

        // Assert
        assertIterableEquals(expected, actual, "the result of the operation is not correct");
    }

}