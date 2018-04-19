package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class DividerTest {

    private Divider divider;

    @org.junit.Test
    public void Test(){
        divider = new divider();
        int expected = 3;
        int actual = divider.divide(5,15);
        assertEquals(expected, actual);
    }
}