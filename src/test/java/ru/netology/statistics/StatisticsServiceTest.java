package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 4, 2, 1, 2, 2, 2, 2};
        long expected = 4;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);

    }
}