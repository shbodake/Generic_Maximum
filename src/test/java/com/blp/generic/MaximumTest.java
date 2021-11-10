package com.blp.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
    @Test
    public void integerMaxAtFirstPosition() {
        int result = Maximum.findMaximum(7,5,2);
        Assert.assertEquals(7, result );
    }

    @Test
    public void integerMaxAtSecondPosition() {
        int result = Maximum.findMaximum(7,5,2);
        Assert.assertEquals(5, result );
    }

    @Test
    public void integerMaxAtThirdPosition() {
        int result = Maximum.findMaximum(7,5,2);
        Assert.assertEquals(2, result );
    }
}