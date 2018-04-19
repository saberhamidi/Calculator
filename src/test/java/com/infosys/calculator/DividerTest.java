package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class DividerTest {

    private Divider divider;

    @org.junit.Test
    public void Test(){
        divider = new Divider();
        int expected = 3;
        int actual = divider.divide(15,5);
        assertEquals(expected, actual);
    }
}