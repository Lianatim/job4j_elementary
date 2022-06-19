package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan187Then110dot05() {
        Assert.assertEquals(100.05, Fit.manWeight((short) 187), 0.01);
    }

    @Test
    public void whenWoman187Then88dot85() {
        Assert.assertEquals(88.55, Fit.womanWeight((short) 187), 0.01);
    }
}