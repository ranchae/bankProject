package com.nhnacademy.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    @DisplayName("입금테스트")
    void deposit() {
        double wonLeft = 1_000;
        double wonRight = 1_000;
        double result = bank.deposit(1_000,1_000);
        assertEquals(2_000, result);
    }
}