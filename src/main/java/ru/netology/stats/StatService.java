package ru.netology.stats;

public class StatService {
    public int sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int lowerAvg(long[] sales) {
        int counter = 0;
        long avg = sum(sales) / sales.length;
        for (long sale : sales) {
            if (sale < avg) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int upperAvg(long[] sales) {
        int counter = 0;
        long avg = sum(sales) / sales.length;
        for (long sale : sales) {
            if (sale > avg) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}