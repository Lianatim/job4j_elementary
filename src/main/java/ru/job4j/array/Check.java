package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
