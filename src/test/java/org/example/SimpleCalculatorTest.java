package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    // Test a valid division operation.

    @Test
    @Disabled
    public void testValidDivision() {
        int result = SimpleCalculator.divide(10, 2);
        assertEquals(6, result, "Valid division should return the correct result");
    }

    // Test division by zero
    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            SimpleCalculator.divide(10, 0);
        }, "Division by zero");
    }

}