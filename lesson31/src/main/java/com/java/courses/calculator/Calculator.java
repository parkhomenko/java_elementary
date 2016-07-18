package com.java.courses.calculator;

public class Calculator {

    public int add(int op1, int op2) {
        int result = op1 + op2;
        return result;
    }

    public int subtract(int op1, int op2) {
        int result = op1 - op2;
        return result;
    }

    public int divide(int op1, int op2) throws DivisionByZero {
        if (op2 == 0) {
            throw new DivisionByZero("You can't divide by zero");
        }

        int result = op1 / op2;
        return result;
    }
}
