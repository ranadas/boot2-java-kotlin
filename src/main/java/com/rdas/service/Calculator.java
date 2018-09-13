package com.rdas.service;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @FunctionalInterface
    interface MathOperation {
        int operation(int number1, int number2);
    }

    public int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    public void addition() {
        MathOperation additionOp = (number1, number2) -> number1 + number2;
        System.out.println("50 + 10 = " + operate(50, 10, additionOp));
    }

    public void subtraction() {
        MathOperation subtractionOp = (number1, number2) -> number1 - number2;
        System.out.println("50 - 10 = " + operate(50, 10, subtractionOp));
    }

    public void multiplication() {
        MathOperation multiplicationOp = (number1, number2) -> number1 * number2;
        System.out.println("50 * 10 = " + operate(50, 10, multiplicationOp));
    }

    public void division() {
        MathOperation divisionOp = (number1, number2) -> number1 / number2;
        System.out.println("50 / 10 = " + operate(50, 10, divisionOp));
    }
}
