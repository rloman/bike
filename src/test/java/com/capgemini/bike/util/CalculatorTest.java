package com.capgemini.bike.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {

        int sum = this.calculator.add(3,4);
        assertEquals(7, sum);
    }

    @Test
    public void testSubtract() {
        int minus = this.calculator.subtract(10, 5);

        assertEquals(5, minus);
    }

    @Test
    public void testMultiply() {
        int multiplied = this.calculator.multiply(3,5);

        assertEquals(15, multiplied);
    }

    @After
    public void tearDown() {
        this.calculator = null;
    }
}
