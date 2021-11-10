package com.blp.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
    @Test
    public void integerMaxAtFirstPosition() {
        float result = Maximum.findMaximum(7.123f,5.745f,2.567f);
        Assert.assertEquals(7.123f, result, 0.0);
    }

    @Test
    public void integerMaxAtSecondPosition() {
        float result = Maximum.findMaximum(7.123f,5.745f,2.567f);
        Assert.assertEquals(5.745f, result, 0.0 );
    }

    @Test
    public void integerMaxAtThirdPosition() {
        float result = Maximum.findMaximum(7.123f,5.745f,2.567f);
        Assert.assertEquals(2.567f, result, 0.0 );
    }
}