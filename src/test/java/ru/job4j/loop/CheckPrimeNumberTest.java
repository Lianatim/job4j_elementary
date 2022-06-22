package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void whenCheck5() {
        int in = 5;
        boolean result = CheckPrimeNumber.check(in);
        Assert.assertTrue(result);
    }

    @Test
    public void whenCheck4() {
        int in = 4;
        boolean result = CheckPrimeNumber.check(in);
        Assert.assertFalse(result);
    }

    @Test
    public void whenCheck1() {
        int in = 1;
        boolean result = CheckPrimeNumber.check(in);
        Assert.assertFalse(result);
    }
}