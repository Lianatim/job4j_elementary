package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5to2to2Then5() {
        int a = 5;
        int b = 2;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax120to7to1to33Then120() {
        int a = 120;
        int b = 7;
        int c = 1;
        int d = 33;
        int result = Max.max(a, b, c, d);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }
}