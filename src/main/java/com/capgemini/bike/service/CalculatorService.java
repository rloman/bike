package com.capgemini.bike.service;

import com.capgemini.bike.domain.CalculatorResult;
import com.capgemini.bike.util.ICalculator;

public class CalculatorService {

    private ICalculator iCalculatorDitIsEenInterface;

    public CalculatorResult add(int a, int b) {

        CalculatorResult r = new CalculatorResult();

        int result = this.addPrivate(a,b);

        r.setOperator("+");
        r.setA(a);
        r.setB(b);
        r.setResult(result);

        return r;
    }


    private int addPrivate(int a, int b) {
        return this.iCalculatorDitIsEenInterface.add(a,b);
    }
}
