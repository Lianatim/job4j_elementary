package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void reverseOddArray() {
        int[] input = new int[]{4, 1, 6, 2, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[]{5, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void reverseEvenArray() {
        int[] input = new int[]{1, 6, 2, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[]{5, 2, 6, 1};
        Assert.assertArrayEquals(expected, result);
    }
}