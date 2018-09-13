package com.rdas.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void basicTests()  {
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();
    }
}