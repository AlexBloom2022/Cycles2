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
        int averageSum = 0;
        for (long sale : sales) {
            averageSum = sum(sales) / sales.length;
        }
        return averageSum;
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
        int lowerAverage = 0;
        float average = average(sales);
        for (long sale : sales) {
            if (sale < average) {
                lowerAverage++;
            }
        }
        return lowerAverage;
    }

    public int upperAvg(long[] sales) {
        int upperAverage = 0;
        float average = average(sales);
        for (long sale : sales) {
            if (sale > average) {
                upperAverage++;
            }
        }
        return upperAverage;
    }
}