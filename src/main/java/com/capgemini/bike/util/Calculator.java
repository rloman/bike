package com.capgemini.bike.util;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add (int a, int b) {
        return a+b;
    }
}