package com.capgemini.bike.util;

public class Calculator implements ICalculator{

    public int add (int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {

        return a-b;
    }

    public int multiply(int a, int b) {

        return a*b;
    }
}
