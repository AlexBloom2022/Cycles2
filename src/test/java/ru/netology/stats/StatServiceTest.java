package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        long actual = service.sum(sales);

        assertEquals(actual, expected);
    }

    @Test
    void average() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        long actual = service.average(sales);

        assertEquals(actual, expected);
    }

    @Test
    void minSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.minSales(sales);

        assertEquals(actual, expected);
    }

    @Test
    void maxSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.maxSales(sales);

        assertEquals(actual, expected);
    }

    @Test
    void lowerAvg() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.lowerAvg(sales);

        assertEquals(actual, expected);
    }

    @Test
    void upperAvg() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        long actual = service.upperAvg(sales);

        assertEquals(actual, expected);
    }

}