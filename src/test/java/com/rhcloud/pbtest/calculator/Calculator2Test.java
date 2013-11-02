package com.rhcloud.pbtest.calculator;

import com.rhcloud.pbtest.Calculator;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Przemek
 * Date: 01.11.13
 * Time: 20:29
 */
public class Calculator2Test {
    Calculator calc = new Calculator();

    //depends from getResult()
    @Ignore("Code coverage test")
    @Test
    public void testAddSomething() throws Exception {
        calc.add(1, 2);
        assertEquals("Incorrect addition", 3, calc.getResult());
    }

    //depends from getResult()
    @Ignore ("Code coverage test")
    @Test
    public void testDeductSomething() throws Exception {
        calc.deduct(4, 1);
        assertEquals("Incorrect deduction", 3, calc.getResult());
    }

}
