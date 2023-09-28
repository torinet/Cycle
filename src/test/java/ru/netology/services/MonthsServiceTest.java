package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthsServiceTest {
    @Test
    public void TestCalculate() {
        MonthsService service = new MonthsService();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void TestCalculate2() {
        MonthsService service = new MonthsService();
        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;
        assertEquals(expected, actual);
    }
}
