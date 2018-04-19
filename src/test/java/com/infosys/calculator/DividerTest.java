package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class DividerTest {

    private Divider divider;

    @org.junit.Test
    public void Test(){
        divider = new Divider();
        assertEquals(3, divider.divide(15,5));
    }
}