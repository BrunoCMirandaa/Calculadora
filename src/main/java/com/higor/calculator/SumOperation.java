package com.higor.calculator;

public class SumOperation implements OperationStrategy {
    @Override
    public double execute(double number1, double number2) {
        return number1 + number2;
    }

}
