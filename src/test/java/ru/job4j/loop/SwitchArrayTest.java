package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 6, 7, 9};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {9, 2, 6, 7, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to2() {
        int[] input = {1, 2, 6, 7, 9};
        int source = 3;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 7, 6, 9};
        Assert.assertArrayEquals(expected, result);
    }
}