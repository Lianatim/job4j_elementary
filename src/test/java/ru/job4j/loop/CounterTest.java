package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumByEvenFromOneToTen() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(1, 10);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenFromOneToSix() {
        int start = 1;
        int finish = 6;
        int result = Counter.sumByEven(1, 6);
        int expected = 12;
        Assert.assertEquals(expected, result);
    }
}