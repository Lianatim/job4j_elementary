package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Math.max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {

        return Math.max(d, max(a, b, c));
    }
}
