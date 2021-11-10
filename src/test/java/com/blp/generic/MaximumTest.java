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
}