package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    private Multiplier multiplier;

    @org.junit.Test
    public void Test(){
        multiplier = new Multiplier();
        int expected = 12;
        int actual = multiplier.multiply(4,3);
        assertEquals(expected, actual);
    }
}