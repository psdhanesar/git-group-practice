package com.pardeep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount bankAccount = new BankAccount("pardeep", "singh", 1000);
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200, balance);
        assertEquals(1200,bankAccount.getBalance(),0);
    }

    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount("pardeep", "singh", 1000);
        double balance = bankAccount.withdraw(200, true);
        assertEquals(800, balance);
        assertEquals(800,bankAccount.getBalance(),0);
    }

    @Test
    void getBalance() {
        BankAccount bankAccount = new BankAccount("pardeep", "singh", 800);
        assertEquals(800,bankAccount.getBalance(),0);
    }

}