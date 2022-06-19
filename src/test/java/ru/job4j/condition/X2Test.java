package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        Assert.assertEquals(40, X2.calc(10, 0, 0, 2));
    }

    @Test
    public void whenA1B1C1X1Then3() {
        Assert.assertEquals(3, X2.calc(1, 1, 1, 1));
    }

    @Test
    public void whenA0B1C1X1Then2() {
        Assert.assertEquals(2, X2.calc(0, 1, 1, 1));
    }

    @Test
    public void whenA1B1C0X1Then2() {
        Assert.assertEquals(2, X2.calc(1, 1, 0, 1));
    }

    @Test
    public void whenA1B1C1X0Then1() {
        Assert.assertEquals(1, X2.calc(1, 1, 1, 0));
    }
}