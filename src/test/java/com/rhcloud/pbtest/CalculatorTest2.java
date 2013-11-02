package com.rhcloud.pbtest;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Przemek
 * Date: 01.11.13
 * Time: 20:29
 */
public class CalculatorTest2 {
    Calculator calc = new Calculator();

    //depends from getResult()
    @Test
    public void testAdd() throws Exception {
        calc.add(1, 2);
        assertEquals("Incorrect addition", 3, calc.getResult());
    }

    //depends from getResult()
    @Test
    public void testDeduct() throws Exception {
        calc.deduct(4, 1);
        assertEquals("Incorrect deduction", 3, calc.getResult());
    }

}
