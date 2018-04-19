package com.infosys.calculator;
import static org.junit.Assert.assertEquals;

public class SubtractorTest {

    private Subtractor subtractor;

    @org.junit.Test
    public void Test(){
        subtractor = new Subtractor();
        int expected = 2;
        int actual = subtractor.subtract(5,3);
        assertEquals(expected, actual);
    }
}