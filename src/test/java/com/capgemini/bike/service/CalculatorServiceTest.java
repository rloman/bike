package com.capgemini.bike.service;

import com.capgemini.bike.domain.CalculatorResult;
import com.capgemini.bike.util.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService service;

    @Mock
    private Calculator calculator; // stel dat dit een interface is ... dus iets als BirdRepository of FilmRepository


    @Test
    public void testAdd() {


        //setup the mocking
        Mockito.when(this.calculator.add(3,4)).thenReturn(7);

        // invoke the service to be tested
        CalculatorResult r = this.service.add(3,4);


        // verify the stuff
        assertEquals(3, r.getA());
        assertEquals(4, r.getB());

        assertEquals("+", r.getOperator());

        assertEquals(7, r.getResult());

//        Mockito.verify(this.calculator.add(3,4), Mockito.times(1));

        Mockito.verify(this.calculator, Mockito.times(1)).add(3,4);

    }

}
