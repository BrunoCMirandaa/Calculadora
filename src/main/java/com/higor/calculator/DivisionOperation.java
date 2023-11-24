package com.higor.calculator;

public class DivisionOperation implements OperationStrategy {
    @Override
    public double execute(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return number1 / number2;
    }
}
