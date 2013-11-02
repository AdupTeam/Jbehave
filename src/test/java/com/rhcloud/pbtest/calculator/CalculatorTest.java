package com.rhcloud.pbtest.calculator;

import com.rhcloud.pbtest.Calculator;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {
     private Calculator calculator = new Calculator();

    @Ignore ("Code coverage test")
    @Test
    public void shouldAddNumbers(){
       int number1 = 10;
       int number2 = 5;
        calculator.add(number1, number2);
       assertTrue(calculator.getResult() == 15);
    }

    @Ignore ("Code coverage test")
    @Test
    public void testDeduct() throws Exception {
        calculator.deduct(4, 1);
        assertEquals("Incorrect deduction", 3, calculator.getResult());
    }
}
