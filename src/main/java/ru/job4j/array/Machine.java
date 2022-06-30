package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int doubt = money - price;
        for (int i = 0, j = 0; i < coins.length; i++) {
            while (doubt >= coins[i]) {
                doubt = doubt - coins[i];
                size++;
                rsl[j] = coins[i];
                j++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

}
