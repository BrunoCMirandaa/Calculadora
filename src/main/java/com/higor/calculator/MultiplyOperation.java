package com.higor.calculator;

public class MultiplyOperation implements OperationStrategy {
    @Override
    public double execute(double number1, double number2) {
        return number1 * number2;
    }
}
