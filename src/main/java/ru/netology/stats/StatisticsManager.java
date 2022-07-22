package ru.netology.stats;

public class StatisticsManager {
    public int sumStat(int[] shopStat) {
        int sum = 0;

        for (int i = 0; i < shopStat.length; i++) {
            sum += shopStat[i];


        }

        return sum;
    }

    public int mean(int[] shopStat) {
        int sum = 0;
        int q = 0;
        for (int i = 0; i < shopStat.length; i++) {
            sum += shopStat[i];
            q++;


        }
        int mean = sum / q;
        return mean;
    }

    public int maxSale(int[] shopStat) {
        int maxSale = 0;

        for (int i = 0; i < shopStat.length; i++) {
            if (shopStat[i] > shopStat[maxSale]) {
                maxSale = i;

            }

        }

        return maxSale + 1;

    }

    public int minSale(int[] shopStat) {
        int minSale = 0;

        for (int i = 0; i < shopStat.length; i++) {
            if (shopStat[i] < shopStat[minSale]) {
                minSale = i;

            }

        }
        return minSale + 1;
    }


    public int monthCountMin(int[] shopStat) {
        int monthCountMin = 0;
        StatisticsManager service = new StatisticsManager();

        for (int t : shopStat) {
            if (t < service.mean(shopStat)) {
                monthCountMin++;

            }


        }
        return monthCountMin;
    }

    public int monthCountMax(int[] shopStat) {
        int monthCountMax = 0;
        StatisticsManager service = new StatisticsManager();

        for (int t : shopStat) {
            if (t >= service.mean(shopStat)) {
                monthCountMax++;

            }


        }
        return monthCountMax;

    }


}
