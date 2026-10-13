package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(8, calculator.add(5, 3));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(5, calculator.divide(15, 3));
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(15, 0)
        );
    }
}
