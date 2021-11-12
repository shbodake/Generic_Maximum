package com.blp.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
    @Test
    public void intMax() {
        int result = Maximum.findMaximum(5,7,2);
        Assert.assertEquals(7, result);
    }

    @Test
    public void floatMax() {
        float result = Maximum.findMaximum(5f,4f,9f);
        Assert.assertEquals(9f, result,0.0 );
    }

    @Test
    public void  stringMax() {
        String result = Maximum.findMaximum("Football","Badminton","Cricket");
        Assert.assertEquals("Football", result);
    }
}