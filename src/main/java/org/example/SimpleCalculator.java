package org.example;

public class SimpleCalculator {

    // This method is used to calculate the quotient of two integers
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

}
