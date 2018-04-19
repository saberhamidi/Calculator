package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    private Multiplier multiplier;

    @org.junit.Test
    public void Test(){
        multiplier = new Multiplier();
        assertEquals(12, multiplier.multiply(4,3));
    }
}