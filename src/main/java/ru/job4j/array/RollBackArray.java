package ru.job4j.array;

import java.util.Arrays;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - i - 1;
            result[i] = array[lastIndex];
        }
        return result;
    }
}
