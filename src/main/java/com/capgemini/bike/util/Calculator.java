package com.capgemini.bike.util;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
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
