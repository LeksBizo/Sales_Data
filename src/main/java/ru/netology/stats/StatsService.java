package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {  //первая задача
        long resultSale = 0;
        for (long sale : sales) {
            resultSale += sale;

        }
        return resultSale;

    }

    public long average(long[] sales) {  //вторая задача
        long resultSale = sum(sales);
        long averageSale = sum(sales) / 12; //вывод на return
        return sum(sales) / 12;
    }

    public int monthMax(long[] sales) { //самый продающий месяц
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[monthMaxSale]) {
                monthMaxSale = i;
            }

        }
        return monthMaxSale + 1;
    }

    public int monthMin(long[] sales) { //самый не продающий месяц
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[monthMinSale]) {
                monthMinSale = i;
            }

        }
        return monthMinSale + 1;
    }

    public int monthBellowAverage(long[] sales) { //продажи ниже среднего
        int monthBellowAverageSales = 0;
        long averageSale = average(sales);
        for (long sale : sales) {

            if (sale < averageSale) {
                monthBellowAverageSales++;
            }
        }
        return monthBellowAverageSales;
    }

    public int monthUpAverage(long[] sales) { //продажи выше среднего
        int monthUPAverageSales = 0;
        long averageSale = average(sales);
        for (long sale : sales) {

            if (sale > averageSale) {
                monthUPAverageSales++;
            }
        }
        return monthUPAverageSales;
    }
}
