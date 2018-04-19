package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class AdderTest {

    private Adder adder;

    @org.junit.Test
    public void Test(){
        adder = new Adder();
        int expected = 4;
        int actual = adder.add(2,2);
        assertEquals(expected, actual);
    }
}