package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacantionTest {
    @Test
    public void testCashVacancion() {
        Vacantion service = new Vacantion();
        int expected = 3;
        int income = 10_000; // доход от работы
        int expenses = 3_000; // обязательные месячные траты
        int threshold = 20_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCashVacancionRich() {
        Vacantion service = new Vacantion();
        int expected = 2;
        int income = 100_000; // доход от работы
        int expenses = 60_000; // обязательные месячные траты
        int threshold = 150_000; // есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
