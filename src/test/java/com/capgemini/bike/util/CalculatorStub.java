package com.capgemini.bike.util;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
@Primary
public class CalculatorStub implements ICalculator{

    @Override
    public int add(int a, int b) {
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        return 0;
    }
}
