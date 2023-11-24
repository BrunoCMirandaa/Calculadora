package com.higor.calculator;

public class SubtractOperation implements OperationStrategy {
    @Override
    public double execute(double number1, double number2) {
        return number1 - number2;
    }
}
