package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i * 2 + 3;
           // System.out.println(numbers[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println(numbers[i]);
            }
            System.out.println();
        }
    }
}
