package com.blp.generic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
    @Test
    public void stringMaxAtFirstPosition() {
        String result = Maximum.findMaximum("Cricket", "Football","Badminton");
        Assert.assertEquals("Football", result);
    }

    @Test
    public void stringMaxAtSecondPosition() {
        String result = Maximum.findMaximum("Football","Cricket","Badminton");
        Assert.assertEquals("Football", result );
    }

    @Test
    public void stringMaxAtThirdPosition() {
        String result = Maximum.findMaximum("Football","Badminton","Cricket");
        Assert.assertEquals("Football", result);
    }
}