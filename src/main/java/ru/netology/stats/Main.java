package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        int[] shopStatic = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsManager service = new StatisticsManager();
        System.out.println("Сумма:" + service.sumStat(shopStatic));
        System.out.println("Среднее числа продаж:" + service.mean(shopStatic));
        System.out.println("Месяц максимальных продаж:" + service.maxSale(shopStatic));
        System.out.println("Месяц минимальных продаж:" + service.minSale(shopStatic));
        System.out.println("Количество месяцев с продажами меньше среднего:" + service.monthCountMin(shopStatic));
        System.out.println("Количество месяцев с продажами меньше среднего:" + service.monthCountMax(shopStatic));


    }


}
