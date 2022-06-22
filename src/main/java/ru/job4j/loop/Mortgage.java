package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        int duty = 0;
        while (duty >= 0) {
            duty = (int) (amount + amount * percent / 100 - salary);
            amount = duty;
            year++;
        }
        return year;
    }
}
