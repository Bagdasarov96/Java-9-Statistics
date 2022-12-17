package ru.netology.stats.testqa;

public class StatsService {
    public int sum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int averageAmount(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximumSum(int[] sales) {
        int maxMonth = 0;
        int maxSale = sales[maxMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxMonth = i;
                maxSale = sales[i];
            }

        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int minSale = sales[minMonth];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minMonth = i;
                minSale = sales[i];
            }
        }
        return minMonth + 1;

    }

    public int bellowAverage(int[] sales) {
        int counter = 0;
        int averageSale = averageAmount(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveAverage(int[] sales) {
        int counter = 0;
        int averageSale = averageAmount(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }

        return counter;
    }
}