package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalcFactorialFor5Then120() {
        int in = 5;
        int result = Factorial.calc(in);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalcFactorialFor0Then1() {
        int in = 0;
        int result = Factorial.calc(in);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}